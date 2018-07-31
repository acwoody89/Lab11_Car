
public class UsedCar extends Car{
	private double mileage;

	

	public UsedCar(String make, String model, int year, double price) {
		super(make, model, year, price);
		// TODO Auto-generated constructor stub
	}
	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);
		this.mileage = mileage;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString() + String.format("Used: %,-15.2f", mileage);
	}
	
}
