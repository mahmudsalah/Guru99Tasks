package TESTAutomation.Kerdasy;

import javax.mail.MessagingException;

import org.testng.annotations.Test;

import TESTAutomation.Kerdasy.MobileItemsSortedByNamePage;
import junit.framework.Assert;

public class MobileItemsSortedByNameTest extends TestBase{
	
	MobileItemsSortedByNamePage Object ;
	
	@Test
	public void MobileItemsSortedByNameTestCase()
	{
		Object = new MobileItemsSortedByNamePage(driver);
		Assert.assertEquals(driver.getTitle(), "Home page");
		Object.ClickMobileButton();
		Assert.assertEquals(driver.getTitle(), "Mobile");
		Object.SortItemsByName();
		
		String filePath = System.getProperty("user.dir")+"/Files/test.txt";
		try {
			EmailUtil.emailUtil(filePath);
			//Mail.mail(filePath);
		} catch (MessagingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
