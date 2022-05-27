package Session_10;

public class LoginToApplication {

	public void login() {
		System.out.println("login 0 param method");
		
	}
	public void login(String username) {
		System.out.println("login 1 parameters method -> username");
		
	}
	public void login(int OTP) {
		System.out.println("login 1 parameters method ->OTP");
	}
	public void login(String username, String password) {
		System.out.println(" login 2 parameters method ->username &password");
	}
	public void login(long phonenumber,String password) {
		System.out.println("login 2 parameters method -> phonenumber & password");
	}
	public void login(String username, long phonenumber) {
		System.out.println("login 2 parameters method ->usename & phonenumber");
	}
	public static void main(String[] args) {
		
		LoginToApplication lp= new LoginToApplication();
		lp.login();
		lp.login(1234);
		lp.login("john");
		lp.login("john", "john@345");
		lp.login("john", 473864444);
		lp.login(786695949, "john@345");
		
		
		
	}
	
	
	
	
	
	
	
}
