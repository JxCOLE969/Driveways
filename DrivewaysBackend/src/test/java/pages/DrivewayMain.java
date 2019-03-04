package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DrivewayMain {

	public WebDriver driver;

	public DrivewayMain(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(By.id("loginButton"));
	}
	
	public WebElement getSignupButton() {
		return driver.findElement(By.id("signupButton"));
	}
	
	public WebElement getLoginModal() {
		return driver.findElement(By.id("loginModal"));
	}
	
	public WebElement getSignupModal() {
		return driver.findElement(By.id("signupModal"));
	}
	
	public WebElement getLoginUsername() {
		return driver.findElement(By.id("username_login"));
	}
	
	public WebElement getLoginPassword() {
		return driver.findElement(By.id("password_login"));
	}
	
	public WebElement getLoginSubmit() {
		return driver.findElement(By.id("loginSubmit"));
	}
	
	public WebElement getSignupSubmit() {
		return driver.findElement(By.id("signupSubmit"));
	}
	
	public WebElement getSignupUsername() {
		return driver.findElement(By.id("username_register"));
	}
	
	public WebElement getSignupPassword() {
		return driver.findElement(By.id("password_register"));
	}
	
	public WebElement getSignupRole() {
		return driver.findElement(By.id("role_register"));
	}
	
	public WebElement getSignupPhone() {
		return driver.findElement(By.id("phone_register"));
	}
}
