package Pages;

import Base.BaseUtil;
import Utility.CommonUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationSettingpage extends BaseUtil {
    @FindBy(xpath="//input[@name='login']")
    private WebElement emailBox;
    @FindBy(xpath="//input[@name='password']")
    private WebElement passwordBx;
    @FindBy(xpath="//button[contains(text(),'Login')]")
    private WebElement Login;
    @FindBy(xpath="//button[@id='dropdownSystem']")
    private WebElement Menu;
    @FindBy(xpath="//button[text()='Administration']")
    private WebElement Admin;
    @FindBy(xpath="//h4[text()='Application settings']")
    private WebElement AppSettings;
    @FindBy(xpath="//input[@name='title']")
    private WebElement Title;
    @FindBy(xpath="//button[text()='Save']")
    private WebElement save;
    @FindBy(xpath="//button[text()='Logout']")
    private WebElement logout;
//    @FindBy(xpath="//span[contains(@class,\"app-title\")]")
//    private WebElement VerifyTitle;



    public void logintmOS(String username, String password) {
        CommonUtil.waitUntilElementIsDisplayed(emailBox, 20);
        //emailBox.clear();
        emailBox.sendKeys(username);
        passwordBx.sendKeys(password);
    }
    
    public ApplicationSettingpage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnAdministration(){
        CommonUtil.waitUntilElementIsDisplayed(Menu,30);
        Menu.click();
        CommonUtil.waitUntilElementIsDisplayed(Admin,30);
        Admin.click();
    }
    public void clickOnAppSettings(){
        AppSettings.click();
        CommonUtil.waitUntilElementIsDisplayed(Title,30);
        Title.clear();
    }
    public void updateTitle(String title, String titleNew) throws Exception{
        CommonUtil.waitUntilElementIsDisplayed(Title,30);
        Title.sendKeys(title);
        CommonUtil.waitUntilElementIsDisplayed(save,30);

        CommonUtil.scrollByVisibleElement(save);
        CommonUtil.waitUntilElementIsDisplayed(save,30);
        save.click();

   //     CommonUtil.getTextElement(VerifyTitle);
        clickOnAppSettings();
        Thread.sleep(2000);
        CommonUtil.waitUntilElementIsDisplayed(Title,30);
        Title.clear();
        Title.sendKeys(titleNew);
        Thread.sleep(2000);
        CommonUtil.scrollByVisibleElement(save);
        save.click();
    }
}

