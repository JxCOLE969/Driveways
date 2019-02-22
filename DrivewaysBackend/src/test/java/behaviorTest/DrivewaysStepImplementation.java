package behaviorTest;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

import pages.DrivewayMain;

public class DrivewaysStepImplementation {

	static {
		File file = new File("src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	}

	static ChromeDriver driver = new ChromeDriver();
	static DrivewayMain wikimain = new DrivewayMain(driver);

}

	
