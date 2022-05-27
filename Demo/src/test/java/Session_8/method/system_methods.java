package Session_8.method;

import java.util.ArrayList;

public class system_methods {
    static String wcmessage = "     hello user  ";
    public static void main(String[] args) 
    {
		
    System.out.println("size is equal to- " + wcmessage.length());	
    System.out.println(wcmessage.trim());	
    	
  ArrayList<Integer>list = new ArrayList<Integer>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    for (int i = 0; i<list.size(); i++)
    {
    	System.out.println(list.get(i));
    }
    
	}
	}
	
	
	
	
	

