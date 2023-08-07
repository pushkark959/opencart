package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	//Locator
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	@FindBy (xpath = "(//input[@id='input-password'])[1]")
	WebElement txtPassword;
	
	@FindBy (xpath = "//button[normalize-space()='Login']")
	WebElement btnLogin;
	
	//Action
	
	
	public void setEmail(String email)
	{
		txtEmailAddress.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clklogin()
	{
		btnLogin.click();
	}

}
