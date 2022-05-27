package Session_8;

public class webpage {
	
	//data member of class
	//variables
     String title = "Welcome to BestGoods";
     String url = "https://www.bestgood.com";
     String header = "bestgoods.com :online shopping - Mobiles, Laptops";
     String logoimage = "https://www.bestgood.com/images/logo";
     
     //non static methods
     public void toppanel()
     {
    	System.out.println("----------top panel start-----");
    	System.out.println(url);
    	 System.out.println("this is toppanel of webpage");
    	 System.out.println(title);
    	 System.out.println(logoimage);
    	 System.out.println("------top panel end--------");
     }
     public void footerlinks()
     {
    	 System.out.println("----------footerlinks start-----");
     	System.out.println(url);
     	 System.out.println("this is toppanel of webpage");
     	 System.out.println(title);
     	 System.out.println(logoimage);
     	 System.out.println("----footerlinks end--------"); 
     }
public void centerpanel()
{
	 System.out.println("----------centerpannel start-----");
  	System.out.println("mobiles");
  	 System.out.println("laptops");
  	 System.out.println("camera");
  	 System.out.println("books");
  	 System.out.println("----footerlinks end--------"); 	
}	
 //static method
public static void privacypolicy()
{
	System.out.println("----privacypolicy start--------");
	System.out.println("about business of bestgoods");
 	 System.out.println("bestgood vendor inf.");
 	 System.out.println("privacy notice");
 	 System.out.println("----privacypolicy end--------"); 	

}

public static void main(String[] args) 
{ 
	 webpage objRef = new webpage();
	 objRef.toppanel();
	 objRef.centerpanel();
	 objRef.footerlinks();
	 System.out.println("this is url for application" +objRef.url);
	privacypolicy();
}



	
}
	
	
	
	
	
	
	
	

