package Session_10;

public class WithoutConstructor_EMPLOYEE {
	// class variables:
		String name;
		int age;
		String dept;
		int empId;
		static String compName = "Unicorn Systems";

		public static void main(String[] args) {

			// Assigning the values of class variables to the different object
			// for employee e1 and e2
			WithoutConstructor_EMPLOYEE e1 = new WithoutConstructor_EMPLOYEE();
			e1.name = "Tom";
			e1.age = 25;
			e1.dept = "QA";
			e1.empId = 101;
			
			WithoutConstructor_EMPLOYEE e2 = new WithoutConstructor_EMPLOYEE();
			e2.name = "Steve";
			e2.age = 30;
			e2.dept = "HR";
			e2.empId = 102;
			
			// Accessing the assigned values of the employee e1 and e2 
			System.out.println("Employee e1 details are -> ");
			System.out.println("Name: " + e1.name);
			System.out.println("Age: " + e1.age);
			System.out.println("Department: " + e1.dept);
			System.out.println("Employee ID: " + e1.empId);
			
			System.out.println("---------------------------");
			
			System.out.println("Employee e2 details are -> ");
			System.out.println("Name: " + e2.name);
			System.out.println("Age: " + e2.age);
			System.out.println("Department: " + e2.dept);
			System.out.println("Employee ID: " + e2.empId);
			
			System.out.println("---------------------------");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
