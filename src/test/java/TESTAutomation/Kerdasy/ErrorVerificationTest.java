package TESTAutomation.Kerdasy;

import org.testng.annotations.Test;

import TESTAutomation.Kerdasy.ErrorVerificationPage;
import junit.framework.Assert;

public class ErrorVerificationTest extends TestBase{
	
	ErrorVerificationPage ErrorVerificationObject;
	
	@Test
	public void ErrorVerificationTestCase()
	{
		ErrorVerificationObject = new ErrorVerificationPage(driver);
		Assert.assertEquals(driver.getTitle(), "Home page");
		ErrorVerificationObject.ClickMobileButton();
		ErrorVerificationObject.ClickBtnADDTOCART();
		ErrorVerificationObject.EnterQTYValue();
		ErrorVerificationObject.ErrorMsg.getText().contains("Some of the products cannot be ordered in requested quantity.");
		ErrorVerificationObject.ClickEmptyCartButton();
		ErrorVerificationObject.PageTitleMsg.getText().contains("SHOPPING CART IS EMPTY");
	}

}
