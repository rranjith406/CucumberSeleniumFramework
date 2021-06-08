package Pages;

import Base.BaseUtil;
import Utility.CommonUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BaseUtil {
	 @FindBy(xpath = "//div/h4[contains(text(),'Carbide Measurement')]")
	    private WebElement CarbideTile;
	 @FindBy(xpath = "//div/button[@id='dropdownSystem']")
	    private WebElement AdminMenu;
	 @FindBy(xpath = "//div/button[contains(text(),'Logout')]")
	    private WebElement LogoutText;
	 
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    
    public void clickOnTile() {
   	 CommonUtil.waitUntilElementIsDisplayed(CarbideTile, 30);
   	 CarbideTile.click();
   }

    public void clickOnAdminMenu() {
         CommonUtil.waitUntilElementIsDisplayed(AdminMenu, 30);
         AdminMenu.click();
    }

    public void clickOnLogOut() {
      CommonUtil.waitUntilElementIsDisplayed(LogoutText, 30);
      LogoutText.click();
    }
}


