package Guru99BankTests;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Guru99BankPages.LoginSectionPageScenariosPage;
import junit.framework.Assert;

public class LoginSectionPageScenariosTest extends TestBase {

	LoginSectionPageScenariosPage LoginSectionObject;
	
	Faker FakeData = new Faker();
	
	String VaildUserName = "mngr232954";
	String VaildPassword = "nAzuvej";

	String InvalidUserName = FakeData.name().name();
	String InvaildPassword = FakeData.number().digits(8).toString();
	
	

	@Test(priority = 1)
	public void LoginWithVaildUserNameAndVaildPasswordTestCase()
	{
		LoginSectionObject = new LoginSectionPageScenariosPage(driver);
		LoginSectionObject.LoginWithVaildUserNameAndVaildPassword( VaildUserName , VaildPassword );
		Assert.assertTrue(LoginSectionObject.LogoutButton.getText().contains("Log out"));
		LoginSectionObject.LogoutButton.click();
		driver.switchTo().alert().accept();
	}
	
	@Test(priority = 2)
	public void LoginWithVaildUserNameAndInVaildPasswordTestCase()
	{
		LoginSectionObject = new LoginSectionPageScenariosPage(driver);
		LoginSectionObject.LoginWithVaildUserNameAndVaildPassword(VaildUserName ,InvaildPassword);
		String AlertMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(AlertMessage, "User or Password is not valid");
		driver.switchTo().alert().accept();
	}
	
	@Test(priority = 3)
	public void LoginWithInVaildUserNameAndVaildPasswordTestCase()
	{
		LoginSectionObject = new LoginSectionPageScenariosPage(driver);
		LoginSectionObject.LoginWithVaildUserNameAndVaildPassword(InvalidUserName ,VaildPassword);
		String AlertMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(AlertMessage, "User or Password is not valid");
		driver.switchTo().alert().accept();
	}
	
	@Test(priority = 4)
	public void LoginWithInVaildUserNameAndInVaildPasswordTestCase()
	{
		LoginSectionObject = new LoginSectionPageScenariosPage(driver);
		LoginSectionObject.LoginWithVaildUserNameAndVaildPassword(InvalidUserName ,InvaildPassword);
		String AlertMessage = driver.switchTo().alert().getText();
		Assert.assertEquals(AlertMessage, "User or Password is not valid");
		driver.switchTo().alert().accept();
	}

}
