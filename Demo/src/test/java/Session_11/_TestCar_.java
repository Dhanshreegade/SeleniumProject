package Session_11;

public class _TestCar_ {
	public static void main(String[] args) {

		System.out.println("---------------------------------------------");
		
		System.out.println("Child class reference with child class object");
		_2_BMW b = new _2_BMW();
		b.stop(); // calls Car class stop method
		b.start(); // calls BMW class start Method
		b.fillFuel(); // calls Car class fillFuel method 
		b.autoParking(); // calls BMW class autoParking Method
		b.engine(); // calls Vehicle class engine Method
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Parent class reference with parent class object");
		_1_Car c = new _1_Car();
		c.start(); // calls Car class start method
		c.stop(); // calls Car class stop method
		c.fillFuel(); // calls Car class fillFuel method
		c.engine(); // calls Vehicle class engine Method
		//c.autoParking(); // Parent cannot inherit the property from child class
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Parent class reference with child class object");
		//Top Casting/ Up casting
		_1_Car c1 = new _2_BMW(); //child class object can be referred by parent class ref variable...
		c1.start(); // calls Car class start method 
		c1.stop(); // calls Car class stop method
		c1.fillFuel(); // calls Car class fillFuel method
		//c1.autoParking(); // this cannot be accessed as autoParking method is not available in Car class
		
		System.out.println("---------------------------------------------");
		
		System.out.println("Grand Parent class reference with child class object");
		_0_Vehicle v1 = new _2_BMW();
		v1.engine(); //calls Vehicle class engine Method
		
		System.out.println("---------------------------------------------");
		
		//Down Casting
		//_2_BMW b1 = (_2_BMW) new _1_Car(); //ClassCastException as every car cannot be BMW, so its not allowed at runtime
		
		// Noted - 
		// Polymorphism - Many forms - In Java achieved in terms of overloading and overriding
		// Static methods cannot be overridden (as objects cannot hold any static properties of a class)
		// Method declared as final cannot be overridden (Used to prevent inheritance)
		// A class declared as final cannot be extended (Used to prevent inheritance)

	}
	
	
	
}
