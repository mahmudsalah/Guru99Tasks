package TESTAutomation.Kerdasy;

import org.testng.annotations.Test;

import TESTAutomation.Kerdasy.VerifyThatCostOfProductAreEqualPage;
import junit.framework.Assert;

public class VerifyThatCostOfProductAreEqualTest extends TestBase{
	
	VerifyThatCostOfProductAreEqualPage VerifyObject;
	
	@Test
	public void MobileItemsSortedByNameTestCase()
	{
		VerifyObject = new VerifyThatCostOfProductAreEqualPage(driver);
		Assert.assertEquals(driver.getTitle(), "Home page");
		VerifyObject.ClickMobileButton();
		Assert.assertEquals(driver.getTitle(), "Mobile");
		String PriceAtListOfProductsCost = VerifyObject.PriceAtListOfProducts.getText();
		VerifyObject.ClickMobileNameButton();
		String PriceAtDetailOfProductsCost = VerifyObject.PriceAtDetailOfProducts.getText();
		Assert.assertEquals(PriceAtListOfProductsCost, PriceAtDetailOfProductsCost);
		System.out.println("Price at productList = " +PriceAtListOfProductsCost +" , " + "Price at DatialProduct = "+PriceAtDetailOfProductsCost);
	}

}
