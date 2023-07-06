package seleniumproject;

import org.testng.annotations.Test;

public class TestNgprorities {
	@Test(priority=1)
	void openBrowser()
	{
		System.out.println("Open browser code");
	}
	@Test(priority=1)
	void registerAccount()
	{
		System.out.println("Register account code");
	}
	@Test(priority=0)
	void login()
	{
		System.out.println("Login code");
	}
	@Test(priority=3)
	void sendEmail()
	{
		System.out.println("Send an email");
	}
	@Test(priority=3)
	void logOut()
	{
		System.out.println("Log out code");
	}

}
