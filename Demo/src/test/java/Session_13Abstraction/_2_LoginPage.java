package Session_13Abstraction;

public class _2_LoginPage extends _1_Page {
	
	public _2_LoginPage(){
		System.out.println("Login page const...");
	}

	@Override
	public void title() {
		System.out.println("login page title");
	}

	@Override
	public void url() {
		System.out.println("http://google.com");
	}

	@Override
	public void footerLinks() {
		System.out.println("footerLinks.....");
	}
	
	@Override
	public void logo(){
		System.out.println("LoginPage -- logo");
	}
	
//	@Override
//	public void privacyPolicy()
//	{
//		System.out.println("Change in some privacy policy for login page .....");
//	}
	
	// Special method of login page class
	public void doLogin(){
		System.out.println("login to app...");
	}

}
