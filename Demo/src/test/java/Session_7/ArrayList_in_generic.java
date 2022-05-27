package Session_7;

import java.util.ArrayList;

public class ArrayList_in_generic {

	public static void main(String[] args) {
		
		ArrayList<String> Username =new ArrayList<String>();
		
		Username.add("Jerry");
		Username.add("Tom");
		//Username.add(17);
		Username.add("test");
		
		for(int i=0; i<Username.size();i++)
		{
			System.out.println(Username.get(i));
		}
		System.out.println("---------");
		ArrayList<Integer> numberlist=new ArrayList<Integer>();
		System.out.println(numberlist.size());
		
		numberlist.add(10);
		numberlist.add(20);
		numberlist.add(30);
		numberlist.add(40);
		numberlist.add(50);
		System.out.println(numberlist.size());
		
		for(int i=0; i<numberlist.size();i++)
		{
			System.out.println(numberlist.get(i));
		}
		System.out.println("------");
		
		boolean isavailable= numberlist.contains(60);
		System.out.println(isavailable);
		System.out.println(numberlist.contains(20));
		numberlist.clear();
		//System.out.println(numberlist.size());
		System.out.println("------");
		 System.out.println(numberlist.isEmpty());
		
		
		
		
		
	}
}
