package session_5;

public class Arrays_in_java {
	
	public static void main(String args[])
	{

		String browser[] =new String[4];
		
		browser[0] = "chrome";
		browser[1] = "firefox";
		browser[2] = "opera";
		browser[3] = "i.e";
		
		for(int row=0; row<browser.length; row++)
		{
			System.out.println(browser[row]);
			if(browser[row].equals("safari"))
			{
			
			System.out.println("chrome got invoked");
		
			}
			else
			{
				System.out.println("plz enter valid browser name");
				break;
			}
		
	}
		Object emp[] = new Object[7];
		
		emp[0] = "tom";
		emp[1] = 27;
		emp[2] = 530;
		emp[3] = true;
		emp[4] = "male";
		emp[5] = false;
		emp[6] = "IT";
		for(int j=0; j<=emp.length; j++)
		{
			System.out.println("---------------");
			System.out.println(emp[j]);
			//System.out.println("--------------");
		}
		
		}
	}
