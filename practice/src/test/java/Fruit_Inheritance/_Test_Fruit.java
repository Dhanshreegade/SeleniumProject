package Fruit_Inheritance;

import Session_11._2_BMW;

public class _Test_Fruit {
public static void main(String[] args) {
	System.out.println("---------------------------------------------");
	System.out.println("Child class reference with child class object");
	
	Fruit f = new Fruit();
	f.Branches();
	f.Colours();
	f.roots();
	
	System.out.println("-----------------------");
	System.out.println("\"Parent class reference with parent class object\"");

	 Seed s= new Fruit();
	 s.roots();
	
}	
	
	
}
