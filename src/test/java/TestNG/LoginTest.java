package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest {

	@Test(description="login test")
	public void bloginTest()
	{
		Reporter.log("Login");
		System.out.println("Login successful");;
	}
	
	@Test(description="logout test")

	public void cLogoutTest()
	{
		Reporter.log("Logout");
		System.out.println("Logout successful");
	}
	
	@Test(description="Add")
	
	public void aAddTest()
	{ 
		Reporter.log("add");
		int a = 20;
		int b = 30;
		int c = a+ b;
		System.out.printf("Sum is", + c);
	}
}
