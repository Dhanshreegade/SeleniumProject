package Session_13Abstraction;

public interface _3_IndianMedical extends _0_WHO {

	public void emegergencyServices(); // Abstract(Prototype) method

	public void neuroServices(); // Abstract(Prototype) method

	public void peditricServices(); // Abstract(Prototype) method
	
	public void RadioLogyServices(); // Abstract(Prototype) method [Common service also available in other interfaces]

	
	public static void dengueServices(){
		System.out.println("Indian --- dengueServices");
	}

}
