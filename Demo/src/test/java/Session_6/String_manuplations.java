package Session_6;

public class String_manuplations { 
	
	public static void main(String[] args) {
		
		//String test = "HI THERE";
		
//		String str1 = "Hello everyone lets learn something about string";
//		int lengthofstr1 = str1.length();
//		System.out.println("lenght of string is- " +( lengthofstr1+4));
//		
//		System.out.println(str1.length());
		
		String str2 = "I am learning string in java";
		
		//System.out.println("char at second index position is- "+ str2.charAt);
		
	//	System.out.println("char at second index position is- "+ str2.charAt(3));
		
		//System.out.println(str2.length());
		
		//System.out.println("char at 42th index position is- "+ str2.charAt(25));
		
		
//		String str3 = "Hello there";
//		
//		System.out.println(str3.length());
//		System.out.println("index number of char 'e' in str3 is: "  + str3.indexOf('e')+1);
//		
//		
		
//		String str4 = "Github is aquired by microsoft in year 2018";
//		System.out.println("index number for word apple in string str4 is - " + str4.indexOf("apple"));
//		
//	String str5 = "selenium is used to automateweb applications";
//	System.out.println(str5.toUpperCase());
		
// String str6 = "SELENIUM CANNOT auTOMATE DEKSTOP applications";		
//	System.out.println(str6.toLowerCase());	

// String str7 = "           selenium is a free automation tool   ";
// System.out.println(" after removing white spaces from string o/p is -" + str7.trim());

//		String str8 = "17/10/1995";
//		System.out.println(str8.replace('/', '#'));
//		String temp = "Hello there i am looking forward for hello reply";
//		System.out.println(temp.replace("Hello", "hi"));
		
//	String str9  = "selenium can handle html code";
//	 
//	System.out.println("is the word is available in str9:" +str9.contains("CAN"));
//		boolean isstringavailable  =str9.contains("html");
//		System.out.println(isstringavailable);
		
//	String str10 = "the transaction number is - 56864DE";
//	System.out.println("the transaction number is -" + str10.substring(27));

//	String str11 = "your transaction number is 56864DE thanks";
//	System.out.println(str11.substring(26,34));
	
//		String statement1 = "java is platform independent";
//		String statement2 = "Java is platform independent";
//		String statement3 = "java is platform independent";
//		
//		//boolean check
//		System.out.println(statement1.equals(statement3));
//		System.out.println(statement1.equalsIgnoreCase(statement2));
//		
String str13= "Java is based on oops";
	
	String[] words = str13.split(" ");
	for(int i=0; i<words.length; i++)
	{
		System.out.println(words[i]);
	}
		
	String str14 = "Good Bye"	;
	String[] reWord = str14.split(" ");
	 System.out.println(reWord[1]+ " "+ reWord[0]);
	 
		
		
	
	
	}

}
