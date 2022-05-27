package Session_9;

public class car {

	String name;
	int price;
	String colour;
	
	static int wheels = 4;
	public static void main(String[] args) {
	 car sportscar = new car();	
	 sportscar.name = "BMW";
	 sportscar.price = 5000000;
	 sportscar.colour = "black";
	 
	 System.out.println("========");
	 
	System.out.println(sportscar.name); 
	System.out.println(sportscar.price);
	System.out.println(sportscar.colour);
	System.out.println(sportscar.wheels);
	
	 System.out.println("========");
	 car passengercar = new car();
	 passengercar.name = "traveller";
	 passengercar.price = 6000;
	 passengercar.colour = "blue";
	 passengercar.wheels = 6;
	
	 
	 System.out.println(passengercar.name); 
		System.out.println(passengercar.price);
		System.out.println(passengercar.colour);
		System.out.println(passengercar.wheels);
	
	
	
	
	
	
	
	}
	
	
}
