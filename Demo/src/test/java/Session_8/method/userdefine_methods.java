package Session_8.method;

public class userdefine_methods {
//1. no input no return type
	public void test() {
		System.out.println("test method");
	}
	
//2.no input some returns
	public String nameofCountry() {
		String Countryname = "India";
		return Countryname;
	}
	
	//
	public String[] listofstudents()
	{
		System.out.println("student list is-");
		String names[] = new String[3];
		names[0]= "abc";
		names[1]= "jkl";
		names[2]= "xyz";
		return names;
	}	
//3. some input some output	
	public int add (int a , int b)
	{
		int c = a + b;
		return c;
	}
		
	public String Countrycapital(String countryname)
	{
		if(countryname.equals("india"))
		{ 
			String capital = "New Delhi";
			return capital;
		}
	
		else if(countryname.equals("usa"))	
		{
			String capital = "Washington DC";
			return capital;
			
		}
		else
		{
		   return "no country found";
		}
		
	}
	public static void main(String[] args) {
		
userdefine_methods ref = new userdefine_methods();
ref.test();
		
	System.out.println("my country name is " +ref.nameofCountry());	
		
	String listofstudents[] = ref.listofstudents();	
	System.out.println(listofstudents[2] +listofstudents [0]);	
	
	int var1 = 20;
	int var2 = 30;
	int total =ref.add(var1, var2);
	System.out.println("total is-" +total);
	
	
	System.out.println(ref.Countrycapital("usa"));
	}
	
}	
	

