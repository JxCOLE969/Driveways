package behaviorTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.DrivewayMain;

public class DrivewaysLoginStepImplementation 
{
	static
	{
		File file = new File("src/test/resources/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	}
	
	static ChromeDriver driver = new ChromeDriver();
	static DrivewayMain drivewaymain = new DrivewayMain(driver);
	
	@Given("^: The user is on the landing page$")
	public void the_user_is_on_the_landing_page() throws Throwable 
	{
		driver.get("http://localhost:4200/Signup");
	}

	@When("^: The user clicks Login$")
	public void the_user_clicks_Login() throws Throwable 
	{
		drivewaymain.getLoginButton().click();
	}

	@Then("^: The Login modal appears$")
	public void the_Login_modal_appears() throws Throwable 
	{
		Assert.assertEquals(driver.findElement(By.id("loginModal")).getAttribute("style"), "display: block;");
	}

	@Given("^: The user clicks Login$")
	public void the_user_is_on_the_login_screen() throws Throwable 
	{
		drivewaymain.getLoginButton().click();
	}
	
	@When("^: The user enters a correct \"([^\"]*)\" and \"([^\"]*)\"$")
	public void the_user_enters_a_correct_username_and_password(String un, String pw) throws Throwable 
	{
		drivewaymain.getLoginUsername().sendKeys(un);
		drivewaymain.getLoginPassword().sendKeys(pw);
		drivewaymain.getLoginSubmit().click();
	}

	@Then("^: The user is signed in$")
	public void the_user_is_signed_in() throws Throwable 
	{
		Assert.assertEquals(driver.findElement(By.id("loginModal")).getAttribute("style"), "display: none;");
	}

	@When("^: The user clicks signup$")
	public void the_user_clicks_signup() throws Throwable 
	{
		drivewaymain.getSignupButton().click();
	}

	@When("^: The user enters valid information$")
	public void the_user_enters_valid_information() throws Throwable 
	{
		drivewaymain.getSignupUsername().sendKeys("testuser");
		drivewaymain.getSignupPassword().sendKeys("testpassword");
		driver.findElement(By.xpath("//select[option[@value='0']]")).sendKeys("0");
		drivewaymain.getSignupPhone().sendKeys("5555555555");
		drivewaymain.getSignupSubmit().click();
	}

	@Then("^: The account is created$")
	public void the_account_is_created() throws Throwable 
	{
		Assert.assertEquals(driver.findElement(By.id("registerModal")).getAttribute("style"), "display: none;");
	}
}
