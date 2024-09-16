package tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AccessProperties {

	public static void main(String[] args) throws IOException {
		
		//Read data from Resource file
		Properties properties = new Properties();
		FileInputStream inputstream = new FileInputStream("C:\\Users\\Shankar Gutte\\Desktop\\JAVA\\RWfile\\src\\test\\resources\\Resource\\data.properties");
		properties.load(inputstream);  //To read the data
		String url = properties.getProperty("url");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		
		//Write data in Resource file
		
		FileOutputStream outputstream = new FileOutputStream("C:\\Users\\Shankar Gutte\\Desktop\\JAVA\\RWfile\\src\\test\\resources\\Resource\\data.properties");
		properties.setProperty("contact", "9175120291"); //To add the data
		properties.store(outputstream, "contact is added"); 
		//properties.store(object, "comment if you want to add"); if you don't add comment you can add null 
		
		driver.quit();
	}

}
