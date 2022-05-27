package Session_8.method;

import java.util.Scanner;

public class UserInput {
	private static final String Countryname = null;

	public static void main (String[] args) {
		
		System.out.println("please enter country name");
		
		Scanner sc = new Scanner(System.in);
		String userInput = sc.next();
		sc.close();
		
		userdefine_methods objRef = new userdefine_methods();
		String CountrycapName =objRef.Countrycapital(userInput );
		System.out.println(CountrycapName);
		
		
	}
	
	
}
