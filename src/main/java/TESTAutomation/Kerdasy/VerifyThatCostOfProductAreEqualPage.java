package TESTAutomation.Kerdasy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyThatCostOfProductAreEqualPage extends PageBase{

	public VerifyThatCostOfProductAreEqualPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "a.level0 ")
	WebElement BtnLink;
	
	@FindBy(xpath = "//*[contains(@title,'Sort By')]")
	WebElement sortbyDropDownList;
	
	
	@FindBy(css = "span.price")
	public WebElement PriceAtListOfProducts;
	
	@FindBy(css = "span.price")
	public WebElement PriceAtDetailOfProducts;
	
	@FindBy(linkText = "SONY XPERIA")
	WebElement MobileNameLink;
	
	public void ClickMobileButton()
	{
		ClickButton(BtnLink);
	}
	
	public void ClickMobileNameButton()
	{
		ClickButton(MobileNameLink);
	}
	

}
