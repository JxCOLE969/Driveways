package drivewaystest;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pages.DrivewayMain;

public class drivewaySearchTest {

	public static ChromeDriver driver;
	public static DrivewayMain drivewayMain;

	@BeforeSuite
	public void setUp() {

		File file = new File("src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		driver = new ChromeDriver();
		drivewayMain = new DrivewayMain(driver);
	}
	
	
	
	
	
	
	
	@AfterSuite
	public void teardown() {
		driver.quit();
	}

}
