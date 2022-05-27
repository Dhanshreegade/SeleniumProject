package Session_7;

import java.util.ArrayList;

public class Arraylist_ObjectTypeGenerics {
	
	public static void main(String[] args) {
		
		ArrayList <Object> ar = new ArrayList<Object>();
		
		ar.add(100);
		ar.add(200);
		ar.add("test");
		ar.add(true);
		ar.add(2.17);
		ar.add('*');
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
			
		
		
		
		
		
		
		
		
		
	}

}
