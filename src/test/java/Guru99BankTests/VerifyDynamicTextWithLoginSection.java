package Guru99BankTests;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Guru99BankPages.HomePage;

public class VerifyDynamicTextWithLoginSection extends TestBase {
	
	HomePage DynamicTextObject;
	
	 @DataProvider(name="UserNameID")
	    public Object[][] getDataFromDataprovider(){
	    return new Object[][] 
	    	{
	            { "mngr232954" ,"nAzuvej" }
	        };

	    }
	
	@Test(dataProvider="UserNameID")
	public void VerifyDynamicTextWithLoginSectionTest(String UserName , String PassWord)
	{
		
		DynamicTextObject = new HomePage(driver);
		DynamicTextObject.VerifyLoginSection(UserName , PassWord);
		Assert.assertTrue(DynamicTextObject.UserNameIDText.getText().contains(UserName));
		
	}

}
