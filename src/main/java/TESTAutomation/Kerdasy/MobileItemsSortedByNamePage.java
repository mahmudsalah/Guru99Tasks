package TESTAutomation.Kerdasy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MobileItemsSortedByNamePage extends PageBase{

	public MobileItemsSortedByNamePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "a.level0 ")
	WebElement BtnLink;
	
	@FindBy(xpath = "//*[contains(@title,'Sort By')]")
	WebElement sortbyDropDownList;
	
	
	public void ClickMobileButton()
	{
		ClickButton(BtnLink);
	}
	
	public void SortItemsByName()
	{
		select = new Select(sortbyDropDownList) ;
		select.selectByVisibleText("Name");
	}

}
