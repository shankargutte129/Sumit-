package launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Lounch_Crome {

	public static void main(String[] args) {
				
			System.setProperty("Syswebdriver.crome.driver", "C:\\browserdrivers\\chromedriver.exe");
				
			ChromeDriver driver = new ChromeDriver();
				
			driver.get("https://www.flipkart.com/");

	}

}
