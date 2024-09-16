package Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckTitleWithAssert {
	@Test
	public void CheckTitle() {
		ChromeDriver driver = new ChromeDriver();
		try {
			String ExpectedTitle = "Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com";
			WebDriverManager.chromedriver().setup();
			driver.get("https://www.flipkart.com/account/login?ret=/");
			String ActualTitle = driver.getTitle();
			Assert.assertEquals(ExpectedTitle, ActualTitle);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}
	}
}
