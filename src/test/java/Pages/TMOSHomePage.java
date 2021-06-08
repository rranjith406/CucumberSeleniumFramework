package Pages;

import Base.BaseUtil;
import Utility.CommonUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TMOSHomePage extends BaseUtil{

    @FindBy(xpath="//a[contains(text(),\"Home\")]")
    WebElement homePageHeading;

    @FindBy(xpath = "//div/h4[contains(text(),'Master Data')]")
    private WebElement Tile_MasterData_Tile;

    public TMOSHomePage() {

        PageFactory.initElements(driver, this);
    }

    public void verifyHomeHeadingDisplayed()
    {

        CommonUtil.waitUntilElementIsDisplayed(homePageHeading, 20);
    }

    public void clickOnMasterData()
    {
        CommonUtil.waitUntilElementIsDisplayed(Tile_MasterData_Tile, 30);
        Tile_MasterData_Tile.click();
    }
}
