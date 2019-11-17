package Guru99BankPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	
	protected WebDriver driver;
	
	
	
	public PageBase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public static void ClickButton(WebElement Button)
	{
		Button.click();
	}
	
	public static void SendText(WebElement Text , String Value )
	{
		Text.sendKeys(Value);;
	}

}
