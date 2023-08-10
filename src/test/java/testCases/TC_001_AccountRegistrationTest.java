package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import pageObject.AccountRegistrationPage;
import pageObject.HomePage;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	@Test
	void test_account_Registration() 
	{
        logger.debug("Application log.....");
        logger.info("***  Starting TC_001_AccountRegistrationTest ***");
	
		try
		{
		
		HomePage hp = new HomePage(driver);
		hp.clkMyaccount();
		logger.info("Clicked on my account..");
		hp.clkRegister();
		logger.info("Clicked on register.");
		
		AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		logger.info("Providing customer data");
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
        regpage.setEmail(randomeString()+"@gmail.com");
        regpage.setPassword(randomAlphaNumeric());
        regpage.setPrivacyPolicy();
        regpage.clickContinue();
        logger.info("Clicked on continue button");
        String confmsg = regpage.getConfirmationMsg();
        logger.info("Validating expected message");
        AssertJUnit.assertEquals(confmsg, "Your Account Has Been Created!","Test failed");
        
        }
		catch (Exception e)
		{
			logger.error("Test Failed");
			AssertJUnit.fail();
		}
		logger.info("***  Finished TC_001_AccountRegistrationTest ***");
	}
	

}
