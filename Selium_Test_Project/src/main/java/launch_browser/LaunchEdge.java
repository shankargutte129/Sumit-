package launch_browser;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) {
		System.setProperty("Syswebdriver.msedge.driver", "C:\\browserdrivers\\msedgedriver.exe");
		
		EdgeDriver Driver = new EdgeDriver();
		
		Driver.get("https://www.youtube.com/");
	}

}
