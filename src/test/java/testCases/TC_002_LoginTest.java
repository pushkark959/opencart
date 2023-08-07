package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.MyAccountPage;

public class TC_002_LoginTest extends BaseClass{
	
	

	@Test
	public void test_login()
	{
		try
		{
		logger.info("Starting TC_002_LoginTest");
		HomePage hp = new HomePage(driver);
		hp.clkMyaccount();
		hp.clicklogin();
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setEmail(rb.getString("email")); // valid email, get it from properties file
		lp.setPassword(rb.getString("password"));   // valid password, get it from properties file
		Thread.sleep(5000);
		lp.clklogin();
		
		MyAccountPage macc = new MyAccountPage(driver);
		boolean target = macc.isMyAccountPageExists();
		Assert.assertEquals(target, true);
		}
		catch(Exception e)
		{
			Assert.fail();
	}
		logger.info(" Finished TC_002_LoginTest");
	}

}
