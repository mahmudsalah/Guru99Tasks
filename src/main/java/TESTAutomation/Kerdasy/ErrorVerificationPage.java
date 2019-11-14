package TESTAutomation.Kerdasy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ErrorVerificationPage extends PageBase {

	public ErrorVerificationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "a.level0 ")
	WebElement BtnLink;
	
	@FindBy(css = "button.button.btn-cart")
	WebElement BtnADDTOCART;
	
	@FindBy(xpath = (".//*[@id='shopping-cart-table']/tbody/tr/td[4]/input"))
	WebElement QTYValue;
	
	@FindBy(css = "li.error-msg")
	public WebElement ErrorMsg;
	
	@FindBy(id = "empty_cart_button")
	WebElement EmptyCartButton;
	
	@FindBy(css = "div.page-title")
	public WebElement PageTitleMsg;
	
	@FindBy(xpath = (".//*[@id='shopping-cart-table']/tbody/tr/td[4]/button"))
    WebElement updatecartactionBtn;
	
	public void ClickMobileButton()
	{
		ClickButton(BtnLink);
	}
	
	public void ClickBtnADDTOCART()
	{
		ClickButton(BtnADDTOCART);
	}
	
	public void EnterQTYValue()
	{              
		
		QTYValue.clear();
		SendText(QTYValue, "1000");
		ClickButton(updatecartactionBtn);
		
	}
	
	public void ClickEmptyCartButton()
	{
		ClickButton(EmptyCartButton);
	}
	

}
