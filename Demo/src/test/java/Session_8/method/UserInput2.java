package Session_8.method;

import java.util.Scanner;

public class UserInput2 {
	public static void main(String[] args) {
		
	System.out.println("please enter two numbers for addition");
		
Scanner sc =new Scanner(System.in);
	int numone = sc.nextInt();
	int numTwo = sc.nextInt();
	sc.close();
	
		
	
userdefine_methods objRef = new userdefine_methods();
int total = objRef.add(numone, numTwo);
System.out.println(total);
		
		
		
		
		
		
		
	}
	
	
	
	

}
