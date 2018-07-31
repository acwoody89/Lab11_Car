import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<Car> carList = new ArrayList<>();

		// int count = Validator.getInt(scan, "How many cars are you entering?"); // this was part 1
		Car c1 = new Car("Honda", "Civic", 2018, 25000);
		Car c2 = new Car("Ford", "F150", 2018, 35000);
		Car c3 = new Car("Chevy", "Volt", 2018, 29000);
		UsedCar c4 = new UsedCar("Honda", "Pilot", 2007, 5000, 148000);
		UsedCar c5 = new UsedCar("Subaru", "Forester", 2015, 16500, 50000);
		UsedCar c6 = new UsedCar("Pontiac", "Fiero", 1983, 1, 170000);

		carList.add(c1); // new car
		carList.add(c2); // new car
		carList.add(c3); // new car
		carList.add(c4); // used car
		carList.add(c5); // used car
		carList.add(c6); // used car
		
		// this is for part 1
		// for (int i = 0; i < count; i++) {
		// System.out.println("Car " + (i + 1) + " :");
		// String make = Validator.getString(scan, "Please enter car Make: \n");
		// String model = Validator.getString(scan, "Please enter car Model: \n");
		// int year = Validator.getInt(scan, "Please enter car Year: \n");
		// double price = Validator.getDouble(scan, "Please enter car Price:
		// 1-250,000\n", 1, 250000);
		// Car car = new Car(make, model, year, price);
		//
		// carList.add(car);
		//
		// }

		String userInput = "";
		int optionNum = 0; // helps track the index when saying what model they purchased
		do {
			printMenu(carList);
			
			// this line allows the carList #'s to shrink or stay the same.
			optionNum = Validator.getInt(scan, "Please select an option...0-" + carList.size(), 0, carList.size());
			userInput = "" + optionNum;
			
			if (userInput.equals("0")) {  // checks to see if they want to quit
				System.out.println("Goodbye!!!");
			} else {
				menuOption(userInput, carList); // prints out their selection
				userInput = Validator.getString(scan, "Would you like to purchase this car? y/n");
				
				if (userInput.equalsIgnoreCase("y")) { // if yes, then it displays the Model purchased
					System.out.println("You purchased the " + carList.get(optionNum - 1).getModel());
					carList.remove(optionNum - 1);     // the list starts at one, but index starts @ 0
					printMenu(carList);
				}
			}
		}while (!userInput.equals("0")); // literally, have to enter 0 to quit
	}

	/*
	 * uses if else to find and print out what car they selected
	 */
	public static void menuOption(String userInput, ArrayList<Car> array) {
		
		if (userInput.equals("1")) {
			System.out.println(array.get(0).toString());
		} else if (userInput.equals("2")) {
			System.out.println(array.get(1).toString());
		} else if (userInput.equals("3")) {
			System.out.println(array.get(2).toString());
		} else if (userInput.equals("4")) {
			System.out.println(array.get(3).toString());
		} else if (userInput.equals("5")) {
			System.out.println(array.get(4).toString());
		} else if (userInput.equals("6")) {
			System.out.println(array.get(5).toString());
		} else if (userInput.equals("0")) {
			System.out.println("GoodBye!!!");
		}

	}
	
	
	/*
	 * Prints out the the list of cars + the option to quit
	 * 
	 */
	public static void printMenu(ArrayList<Car> array) {
		System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %-15s", "Option", "Make", "Model", "Year",
				"Price", "Mileage"));
		System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %-15s", "*****", "*****", "*****", "*****",
				"*****", "*****"));
		int i = 0;
		for (i = 0; i < array.size(); i++) {
			System.out.println("Option " + (i + 1) + "\t" + array.get(i));
		}
		System.out.println("Option " + (0) + " Quit");
	}

	// public static void buyCar(Scanner scan, ArrayList<Car> carList) {
	//
	// }

}
