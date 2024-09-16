package Test;

import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(priority = 2, description = "Login test runs successfully")
	public void bloginTest()
		
		{
			System.out.println("Login Sucessful");
			
		}
	@Test(priority = 1, description = "Logout test runs sucessfully")
	public void alogoutTest()
		
		{
			System.out.println("Logout Sucessfully");
		}

}
