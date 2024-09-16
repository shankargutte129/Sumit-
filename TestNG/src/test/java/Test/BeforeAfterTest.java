package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTest {
	@BeforeTest
	public void LoginApplication() 
	{
		
		System.out.println("Login Sucessfully");
	}
	@AfterTest
	public void LogoutApplication() 
	{
		
		System.out.println("Logout Sucessfully");
	}
	@BeforeMethod
	public void ConnectedToDB()
	{
		System.out.println("Database Connected");
	}
	@AfterMethod
	public void DisconnectedFromDB()
	{
		System.out.println("Disconnected from Database");
	}

	@Test(priority = 1, description = "Testcase 1 passed successfully")
	public void Testcase1() 
	{
		System.out.println("Testcase 1");
	}

	@Test(priority = 2, description = "Testcase 2 passed sucessfully")
	public void TestCase2() 
	{
		System.out.println("Testcase 2");
	}

}
