package Pages;

import Base.BaseUtil;
import Utility.CommonUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrackNetworkAnalytics extends BaseUtil
{
    public TrackNetworkAnalytics()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h4[contains(text(),'Fleet Management')]")
    private WebElement MD_FLEETMANAGEMENT_TILE;

    @FindBy(name = "searchInput")
    private WebElement Fleet_search_txt;


//    @FindBy(xpath = "//h4[contains(text(),'Fleet Management')]")
//    private WebElement MD_FLEETMANAGEMENT_TILE;

    public void fleetmanagementClick()
    {
        CommonUtil.waitUntilElementIsDisplayed(MD_FLEETMANAGEMENT_TILE, 30);
        MD_FLEETMANAGEMENT_TILE.click();

    }

    public void searchMachine()
    {
        CommonUtil.waitUntilElementIsDisplayed(Fleet_search_txt, 30);
        Fleet_search_txt.sendKeys();
    }
    public void searchClick()
    {
        CommonUtil.waitUntilElementIsDisplayed(Fleet_search_txt, 30);
        Fleet_search_txt.sendKeys(Keys.ENTER);
    }

}
