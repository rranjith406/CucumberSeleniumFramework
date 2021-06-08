package Pages;

import Base.BaseUtil;
import Utility.CommonUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterData_Machine extends BaseUtil {

    @FindBy(xpath = "//div/h4[contains(text(),'Master Data')]")
    private WebElement Tile_MasterData_Btn;

    @FindBy(xpath = "//div/h4[contains(text(),'Machines')]")
    private WebElement Tile_MD_MACHINES_Btn;

    @FindBy(xpath ="//button/span[@class='mat-button-wrapper']")
    private WebElement MD_MACHINE_CREATE_Btn;

//    @FindBy(name ="line")
//    private WebElement TRACK_LINE_TXT;
//
//    @FindBy(name ="machineNumber")
//    private WebElement TRACK_TRACK_TXT;

    @FindBy(name ="name")
    private WebElement MACHINE_NAME_TXT;

    @FindBy(name ="shortName")
    private WebElement MACHINE_SNAME_TXT;

   @FindBy(name ="machineNumber")
    private WebElement MACHINE_NUM_TXT;

 
    @FindBy(xpath ="//span[contains(text(),\"Automation_Group\")]")
    private WebElement MACHINE_GROUP;

    @FindBy(xpath ="//button[text()='Save']")
    private WebElement MACHINE_SAVE_BTN;

    @FindBy(name ="latitude")
    private WebElement MACHINE_LATITUDE;

    @FindBy(name ="longitude")
    private WebElement MACHINE_LONGITUDE;

    @FindBy(xpath ="//h1[contains(text(),'Edit Machine')]")
    private WebElement verifyEditMachine;


    public MasterData_Machine()
    {
        PageFactory.initElements(driver, this);
    }

    public void machineClick()
    {
        CommonUtil.waitUntilElementIsDisplayed(Tile_MD_MACHINES_Btn, 30);
        Tile_MD_MACHINES_Btn.click();

    }
    public void machineCreateBtnClick()
    {

        CommonUtil.waitUntilElementIsDisplayed(MD_MACHINE_CREATE_Btn, 30);
        MD_MACHINE_CREATE_Btn.click();
    }

    public void validateEditMachine()
    {
        CommonUtil.waitUntilElementIsDisplayed(verifyEditMachine, 20);
    }

    public void enterMachineCreationDeatils(String name, String shortName, String machineNumber, String latitute, String longitude) {

//        CommonUtil.waitUntilElementIsDisplayed(Tile_MasterData_Btn, 30);
//        Tile_MasterData_Btn.click();

//        CommonUtil.waitUntilElementIsDisplayed(Tile_MD_MACHINES_Btn, 30);
//        Tile_MD_MACHINES_Btn.click();

//        CommonUtil.waitUntilElementIsDisplayed(MD_MACHINE_CREATE_Btn, 30);
//        MD_MACHINE_CREATE_Btn.click();

        CommonUtil.waitUntilElementIsDisplayed(MACHINE_NAME_TXT, 20);
        MACHINE_NAME_TXT.sendKeys(name);

        CommonUtil.waitUntilElementIsDisplayed(MACHINE_SNAME_TXT, 20);
        MACHINE_SNAME_TXT.sendKeys(shortName);

        CommonUtil.waitUntilElementIsDisplayed(MACHINE_NUM_TXT, 20);
        MACHINE_NUM_TXT.sendKeys(machineNumber);

        CommonUtil.waitUntilElementIsDisplayed(MACHINE_LATITUDE, 20);
        MACHINE_LATITUDE.sendKeys(latitute);

        CommonUtil.waitUntilElementIsDisplayed(MACHINE_LONGITUDE, 20);
        MACHINE_LONGITUDE.sendKeys(longitude);
    }
        public void selectingResourceGroup()
    {
        CommonUtil.waitUntilElementIsDisplayed(MACHINE_GROUP, 20);
        MACHINE_GROUP.click();
    }

    public void clickSaveButton()
        {
            CommonUtil.scrollByVisibleElement(MACHINE_SAVE_BTN);
            MACHINE_SAVE_BTN.click();
        }
}
