package Guru99BankPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name = "uid")
	WebElement UserNameID;
	
	@FindBy(name = "password")
	WebElement UserPassword;
	
	@FindBy(name = "btnLogin")
	WebElement LoginButton;
	
	@FindBy(linkText = "Log out")
	public WebElement LogoutButton;
	
	@FindBy(css = "tr.heading3")
	public WebElement UserNameIDText;
	
	public void VerifyLoginSection(String UserName , String PassWord)
	{
		SendText(UserNameID, UserName);
		SendText(UserPassword, PassWord);
		ClickButton(LoginButton);
	}

}
