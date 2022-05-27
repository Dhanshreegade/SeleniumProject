package Session_10;

public class Book_a_car {


	public void getCar() {
		System.out.println("Booking a car");
	}

	public void getCar(String carType) {
		System.out.println("Booking a " +carType+ " car");
	}
	
	public void getCar(String carType, int seater) {
		System.out.println("Booking a " +carType+ " car" + " with seating capacity of " +seater+ " people");
	}
	
	public static void main(String[] args) {
		
		System.out.println("-------------------------------------------------------------------------------------------");
		
		Book_a_car bookCar = new Book_a_car();
		
		System.out.println("-------------------------- Booking a car with system defined type -------------------------");
		bookCar.getCar();
		
		System.out.println("--------------------- Booking a car with specific defined type by user --------------------");
		bookCar.getCar("Sedan");
		
		System.out.println("---- Booking a car with specific defined type by user with passenger seating capacity -----");
		System.out.println("welcome user");
		bookCar.getCar("Hachback", 2);
		
		System.out.println("-------------------------------------------------------------------------------------------");

	}
}
