package Guru99BankTests;

import org.testng.annotations.Test;

import Guru99BankPages.HomePage;
import junit.framework.Assert;

public class LoginSectionTest extends TestBase{
	
	HomePage HomePageObject;
	
	@Test
	public void VerifyLoginSectionTestCase()
	{
		HomePageObject = new HomePage(driver);
		HomePageObject.VerifyLoginSection();
		Assert.assertTrue(HomePageObject.LogoutButton.getText().contains("Log out"));
	}

}
