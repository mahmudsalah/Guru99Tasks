package TESTAutomation.Kerdasy;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TESTAutomation.Kerdasy.HandlingPopupWindowPage;
import junit.framework.Assert;
import java.util.Iterator;		
import java.util.Set;

public class HandlingPopupWindowTest extends TestBase{

	HandlingPopupWindowPage HandlingObject;
	
	
	
	@Test
	public void HandlingPopupWindowTestCase()
	{
		HandlingObject = new HandlingPopupWindowPage(driver);
		Assert.assertEquals(driver.getTitle(), "Home page");
		HandlingObject.ClickMobileButton();
		HandlingObject.AddtoCompareList();		

		// To handle all new opened window.		
		String MainWindow = driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();		
		Iterator<String> i1=s1.iterator();		

		while(i1.hasNext())			
		{		
			String ChildWindow=i1.next();	
			

			if(!MainWindow.equalsIgnoreCase(ChildWindow))			
			{    		

				// Switching to Child window
				driver.switchTo().window(ChildWindow);	                                                                                                           
			    driver.findElement(By.cssSelector("div.std")).getText().contains("MOB001");
			    System.out.println(driver.findElement(By.cssSelector("div.std")).getText());
			    System.out.println(driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/button")).getText());
			    driver.findElement(By.xpath("//*[@id=\"top\"]/body/div/div[2]/button")).click();	    
			}
		}

	}
}
