package Session_7;

import java.util.ArrayList;

public class Array_list_Rawtype {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		int arrayListsize = ar.size();
		
		System.out.println(arrayListsize);
		System.out.println("--------------");
		ar.add(100);
		ar.add(200);
		ar.add("test");
		
		System.out.println(ar.size());
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());
		System.out.println("-----------");
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println("-----------");
		System.out.println(ar.get(2));
		//System.out.println(ar.get(5));
		//System.out.println(ar.get(6));
		
		ar.remove(3);
		System.out.println(ar.size());
	System.out.println("--------");
	
	for(int j=0;j<ar.size();j++)
	{
		System.out.println(ar.get(j));
	}
	System.out.println("--------");
	
	for(int i=0;i<ar.size();i++)
	{
		if(ar.get(i).equals("test"))
		{
			System.out.println("yes i got \"test\" in the ar arraylist at index position" +i);
		}
		else
		{
			//System.out.println("no i dont got test in arraylist ");
		}
	}
	
	

		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
