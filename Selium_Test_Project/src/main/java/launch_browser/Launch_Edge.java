package launch_browser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Edge {

	public static void main(String[] args) {
		System.setProperty("Syswebdriver.gecko.driver", "C:\\browserdrivers\\geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");

	}

}
