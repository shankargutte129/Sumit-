package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondTestCase {
	WebDriver driver;
	@Test
	public void openApp()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
	}
	@Test
	void testLogo()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean logo=driver.findElement(By.xpath("//img[@src='/web/images/ohrm_branding.png?v=1721393199309']")).isDisplayed();
		System.out.println("Logo is visible : " + logo);
	}
	
	@Test
	void login()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test
	void close()
	{
		driver.quit();
	}
}

