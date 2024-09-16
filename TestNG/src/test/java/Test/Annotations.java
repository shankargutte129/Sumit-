package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod
	void login()
	{
		System.out.println("Login successfully");
	}
	@AfterMethod
	void logout()
	{
		System.out.println("Logout successfully.....");
	}
	
	@Test(priority= 1)
	void search()
	{
		System.out.println("Search");
	}
	
	@Test(priority=2)
	void advanceSerch()
	{
		System.out.println("Advance Search successfully");
	}
	
	

}
