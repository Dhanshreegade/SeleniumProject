package Session_9;

public class StaticAndNonStatic {
String name;
static int age = 26;
public void getName()
{
	System.out.println("get Name method");
	
}
public static void  getstart()
{
	System.out.println("get start");
}
  public static void main(String[] args) {
	System.out.println("------------");
	getstart();
	System.out.println(age);
	
	StaticAndNonStatic.getstart();
	System.out.println(StaticAndNonStatic.age);

	StaticAndNonStatic objRef =new StaticAndNonStatic();
	
	objRef.name	 ="Dhanshree";
	System.out.println(objRef.name);
	
	objRef.getName();
	
	System.out.println("------");
	System.out.println(new StaticAndNonStatic().name = "tom");
	new StaticAndNonStatic().getName();
	System.out.println("-----------");	
	
	StaticAndNonStatic ObjRef1 = new StaticAndNonStatic();
	ObjRef1.getName();
	ObjRef1 = null;
	ObjRef1.getName();
	ObjRef1.getName();
	ObjRef1.getName();
	
	
	
	
	
}


}
