package Test;

import org.testng.annotations.Test;

public class FirstTestCase {
	
		
		@Test(priority = 3)
		void openapp()
		{
			System.out.println("Open the application......");
		}
		@Test(priority = 1)
		void login()
		{
			System.out.println("Login successfully.......");
		}
		@Test(priority = 2)
		void logoff()
		{
			System.out.println("Logoff the application.......");
		}

	}


