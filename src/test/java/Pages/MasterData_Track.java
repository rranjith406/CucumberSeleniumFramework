package Pages;
import Base.BaseUtil;
import Utility.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.io.IOException;


public class MasterData_Track extends BaseUtil {
    LoginPage loginObj = new LoginPage();
    //start***********
    @FindBy(xpath = "//div/h4[contains(text(),'Master Data')]")
    private WebElement Tile_MasterData_Btn;

    @FindBy(xpath = "//div/h4[contains(text(),'Tracks')]")
    private WebElement Tile_MD_TRACK_Btn;

    @FindBy(xpath = "//button/span[@class='mat-button-wrapper']")
    private WebElement Tile_MDTRACK_CREATE_Btn;

    @FindBy(xpath = "//h1[contains(text(),'Edit Track')]")
    private WebElement verifyEditTrack;

    @FindBy(name = "line")
    private WebElement TRACK_LINE_TXT;

    @FindBy(name = "track")
    private WebElement TRACK_TRACK_TXT;

    @FindBy(name = "name")
    private WebElement TRACK_NAME_TXT;

    @FindBy(name = "shortname")
    private WebElement TRACK_SNAME_TXT;

    @FindBy(xpath = "//span[contains(text(),\"Automation_Group\")]")
    private WebElement TRACK_GROUP;

    @FindBy(xpath = "//button[contains(text(),\"Save\")]")
    private WebElement TRACK_SAVE_BTN;

    //span[contains(text(),"Automation_Group")]
    //End****************

    public MasterData_Track() {
        PageFactory.initElements(driver, this);
    }


    //    public void CreateTrack() {
////        CommonUtil.waitUntilElementIsDisplayed(loginBtn, 30);
////        loginBtn.click();
//        //new addition
//     //   loginObj.login(username,password);
//        CommonUtil.waitUntilElementIsDisplayed(Tile_MasterData_Btn, 30);
//        Tile_MasterData_Btn.click();
//        
//        CommonUtil.waitUntilElementIsDisplayed(Tile_MDTRACK_CREATE_Btn, 30);
//        Tile_MDTRACK_CREATE_Btn.click();
//
//        TRACK_NAME_TXT.sendKeys("AutoTrackCreation");
//        TRACK_SNAME_TXT.sendKeys("AutoTrack");
//        TRACK_GROUP.click();
//        TRACK_SAVE_BTN.click();
//
//
//    }


    public void clickTrack() {
        CommonUtil.waitUntilElementIsDisplayed(Tile_MD_TRACK_Btn, 30);
        Tile_MD_TRACK_Btn.click();
    }
    public void clickNewCreateButton() {
        CommonUtil.waitUntilElementIsDisplayed(Tile_MDTRACK_CREATE_Btn, 30);
        Tile_MDTRACK_CREATE_Btn.click();

    }
    public void verifyTrackHeader() {
        CommonUtil.waitUntilElementIsDisplayed(verifyEditTrack, 30);
        verifyEditTrack.click();
    }

    public void tracklineAndTRack() {
        CommonUtil.waitUntilElementIsDisplayed(TRACK_LINE_TXT, 30);
        TRACK_LINE_TXT.sendKeys(String.valueOf(CommonUtil.generateRandomNum()));
        CommonUtil.waitUntilElementIsDisplayed(TRACK_TRACK_TXT, 30);
        TRACK_TRACK_TXT.sendKeys(String.valueOf(CommonUtil.generateRandomNum()));
    }

    public void trackNameAndShortName(String Name, String shortName) {
        CommonUtil.waitUntilElementIsDisplayed(TRACK_NAME_TXT, 30);
        TRACK_NAME_TXT.sendKeys(Name);
        CommonUtil.waitUntilElementIsDisplayed(TRACK_SNAME_TXT, 30);
        TRACK_SNAME_TXT.sendKeys(shortName);
    }

    public void selectingTrackResourceGroup() {
        CommonUtil.waitUntilElementIsDisplayed(TRACK_GROUP, 30);
        TRACK_GROUP.click();
    }

    public void trackSave() throws Exception {
        Thread.sleep(2000);
        CommonUtil.waitUntilElementIsDisplayed(TRACK_SAVE_BTN, 30);

        CommonUtil.scrollByVisibleElement(TRACK_SAVE_BTN);
        TRACK_SAVE_BTN.click();
    }
}
