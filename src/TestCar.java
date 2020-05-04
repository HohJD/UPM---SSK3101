import java.util.Scanner;
public class TestCar {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter number of cars:");
		int n = scan.nextInt();
		//declare and create array of size n
		Car [] carlist = new Car [n];
		
		//input attributes values from console and create object car
		for (int i=0; i < carlist.length; i++) {
			System.out.println("Enter car brand:");
			String brand = scan.next();
			System.out.println("Enter capacity:");
			double capacity = scan.nextDouble();
			System.out.println("Enter rental rate:");
			double rentalRate = scan.nextDouble();
			carlist[i]=new Car (brand, capacity, rentalRate);
			
		}
		//display attributes values and rental cost
		for (int i=0; i<carlist.length;i++) {
			System.out.println(carlist[i].toString());
			System.out.println(carlist[i].calRentalCost(5));
		}

	}

}
