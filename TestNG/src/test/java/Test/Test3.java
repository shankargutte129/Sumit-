package Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {
	@Test
	public void sumit() 
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://translate.google.co.in/?sl=en&tl=hi&op=translate");
		driver.close();
	}

}
