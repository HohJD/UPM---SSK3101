
public class Car {
	private String brand;
	private double capacity;
	private double rentalRate;
	public Car() {
		
	}
	public Car (String brand, double capacity, double rentalRate) {
		this.brand = brand;
		this.capacity = capacity;
		this.rentalRate = rentalRate;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}
	public String getBrand() {
		return brand;
	}
	public double getCapacity() {
		return capacity;
	}
	public double getRentalRate() {
		return rentalRate;
	}
	public double calRentalCost(int days) {
		return rentalRate * days;
		
	}
	public String toString() {
		return "Car brand: " + getBrand() + "Capacity: " + getCapacity() + "Rental Rate: " + getRentalRate();
	} 

}
