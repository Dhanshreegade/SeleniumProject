package Session_10.WithConstructor_EMPLOYEE;

public class WITHCONSTRUCTOR_EMP {

	// class vars:
		String name;
		int age;
		String dept;
		int empId;

		static String compName = "Unicorn Systems";

		// Constructors is the mechanism called when an object of a class got created
		// Points to be noted - 1. It has no return type
		//						2. It has same name of the class name
		// 						3. If no constructor is provided by user java creates it
		// 						4. Types of  constructors: 	1. Default constructor
		//													2. User defined constructor (parameterized or non parameterized)
		//						5. Constructor can be overloaded with different parameters

		public  WITHCONSTRUCTOR_EMP() // 0 parameter
		{ 
			System.out.println("default const...");
		}

		public  WITHCONSTRUCTOR_EMP(int i) // 1 parameter integer type
		{ 
			System.out.println("one param const..." + i);
		}

		public  WITHCONSTRUCTOR_EMP(String s) // 1 parameter String type
		{ 
			System.out.println("one param const..." + s);
		}

		// create parameterized constructor with all class variables initialized
		public  WITHCONSTRUCTOR_EMP(String name, int age, String dept, int empId) {
			// name = name; // this line has no effect 
			this.name = name;
			this.age = age;
			this.dept = dept;
			this.empId = empId;
		}

		// created parameterized constructor with only two class variables initialized
		public  WITHCONSTRUCTOR_EMP(String name, int empId) {
			this.name = name;
			this.empId = empId;
		}

		public static void main(String[] args) {


			System.out.println("Calling zero pparameter constructor");
			 WITHCONSTRUCTOR_EMP e0 = new WITHCONSTRUCTOR_EMP();
			System.out.println("-----------------------------------");
			
			System.out.println("Calling One pparameter constructor int type");
			 WITHCONSTRUCTOR_EMP e1 = new WITHCONSTRUCTOR_EMP(10);
			System.out.println("-----------------------------------");
			
			System.out.println("Calling One pparameter constructor String type");
			WITHCONSTRUCTOR_EMP e2 = new WITHCONSTRUCTOR_EMP("Thomas");
			System.out.println("-----------------------------------");

			WITHCONSTRUCTOR_EMP e3 = new WITHCONSTRUCTOR_EMP("Jeff", 35, "Admin", 102);
			WITHCONSTRUCTOR_EMP e4 = new WITHCONSTRUCTOR_EMP("Harry", 25, "QA", 103);
			WITHCONSTRUCTOR_EMP e5 = new WITHCONSTRUCTOR_EMP("Louis", 45, "Dev", 104);

			System.out.println("-----------------------------------");
			System.out.println(e3.name + " " + e3.age + " " + e3.dept + " " + e3.empId + " " + WITHCONSTRUCTOR_EMP.compName);
			System.out.println(e4.name + " " + e4.age + " " + e4.dept + " " + e4.empId + " " + WITHCONSTRUCTOR_EMP.compName);
			System.out.println(e5.name + " " + e5.age + " " + e5.dept + " " + e5.empId + " " + WITHCONSTRUCTOR_EMP.compName);
			System.out.println("-----------------------------------");

		}

	
	
	
	
	
	
	
	
	
	
	
}
