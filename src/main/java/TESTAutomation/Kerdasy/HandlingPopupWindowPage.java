package TESTAutomation.Kerdasy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HandlingPopupWindowPage extends PageBase{

	public HandlingPopupWindowPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "a.level0 ")
	WebElement BtnLink;
	
	@FindBy(xpath = "//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[1]/div/div[3]/ul/li[2]/a")
	WebElement AddtoCompareButton1;
	
	@FindBy(xpath = "//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/ul/li[2]/div/div[3]/ul/li[2]/a")
	WebElement AddtoCompareButton2;
	
	@FindBy(css = "li.success-msg")
	public WebElement successmsg;
	
	@FindBy(xpath = "//*[@id=\"top\"]/body/div/div/div[2]/div/div[3]/div[1]/div[2]/div/button")
	WebElement CompareButton;
	
	public void ClickMobileButton()
	{
		ClickButton(BtnLink);
	}
	
	public void AddtoCompareList()
	{
		ClickButton(AddtoCompareButton1);
		ClickButton(AddtoCompareButton2);
		ClickButton(CompareButton);
	}
	

}
