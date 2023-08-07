	package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {
	
	public AccountRegistrationPage (WebDriver driver)
	{
		super(driver);
	}

	//Elements
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstname;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLasttname;
	
	@FindBy (xpath = "//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy (xpath = "//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy (xpath = "//input[@name='agree']")
	WebElement chkdPolicy;
	
	@FindBy (xpath = "//button[normalize-space()='Continue']")
	WebElement btnContinue;
	
	@FindBy (xpath = "h1[normalize-space()='Your Account Has Been Created!']")
	WebElement confirmationMsg;
	
	//Action
	
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}

	public void setLastName(String lname)
	{
		txtLasttname.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String pwd) 
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void setPrivacyPolicy()
	{
		chkdPolicy.click();
	}
	
	public void clickContinue()
	{
		btnContinue.click();
	}
	
	
	
	
	
	//Solution2
	
	//sol2 
	//btnContinue.submit();
	
	//sol3
	//Actions act=new Actions(driver);
	//act.moveToElement(btnContinue).click().perform();
				
	//sol4
	//JavascriptExecutor js=(JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click();", btnContinue);
	
	//Sol 5
	//btnContinue.sendKeys(Keys.RETURN);
	
	//Sol6  
	//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
	
	////h1[normalize-space()='Your Account Has Been Created!']
	
	public String getConfirmationMsg() {
	try {
	{
		return(confirmationMsg.getText());
	}
	}
	catch(Exception e)
	{
		return(e.getMessage());
	}
	

}
	}
