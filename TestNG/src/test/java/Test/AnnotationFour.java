package Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
public class AnnotationFour {
	
	@org.testng.annotations.BeforeMethod
	void BeforeMethod()
	{
		System.out.println("Before Method");
	}
	
	
	void Login()
	{
		System.out.println("Login successfully");
	}
	@Test
	void Search()
	{
		System.out.println("Seaching......");
	}
	/*
	void Logout()
	{
		System.out.println("Logout succcessfully");
	}
	*/
	@org.testng.annotations.AfterMethod
	void AfterMethod()
	{
		System.out.println("After Method");
	}

}
