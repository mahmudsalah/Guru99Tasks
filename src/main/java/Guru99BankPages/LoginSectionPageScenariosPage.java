package Guru99BankPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSectionPageScenariosPage extends PageBase{

	public LoginSectionPageScenariosPage(WebDriver driver) {
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
	
	public void LoginWithVaildUserNameAndVaildPassword(String UserName , String Password)
	{
		SendText(UserNameID, UserName);
		SendText(UserPassword, Password);
		ClickButton(LoginButton);
	}
	
	public void LoginWithVaildUserNameAndInVaildPassword(String UserName , String Password)
	{
		SendText(UserNameID, UserName);
		SendText(UserPassword, Password);
		ClickButton(LoginButton);
	}
	
	public void LoginWithInVaildUserNameAndVaildPassword(String UserName , String Password)
	{
		SendText(UserNameID, UserName);
		SendText(UserPassword, Password);
		ClickButton(LoginButton);
	}
	
	public void LoginWithInVaildUserNameAndInVaildPassword(String UserName , String Password)
	{
		SendText(UserNameID, UserName);
		SendText(UserPassword, Password);
		ClickButton(LoginButton);
	}

}
