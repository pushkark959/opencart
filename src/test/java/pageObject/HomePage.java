package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage (WebDriver driver)
	{
		super(driver);
	}
	
	//Locator
	
	@FindBy(xpath = "//span[normalize-space()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy (xpath = "//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	@FindBy (xpath = "//a[normalize-space()='Login']")
	WebElement lnklogin;
	
	//Action
	
	public void clkMyaccount()
	{
		lnkMyaccount.click();
	}
	
	public void clkRegister()
	{
		lnkRegister.click();
	}
	
	public void clicklogin()
	{
		lnklogin.click();
	}


}
