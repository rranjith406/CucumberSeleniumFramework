package Pages;

import Base.BaseUtil;
import Utility.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends BaseUtil {
    @FindBy(name = "login")
    private WebElement userNameTxt;
    @FindBy(name = "password")
    private WebElement passWordTxt;
    @FindBy(xpath = "//button[contains(@class,'login-button btn btn-primary')]")
    private WebElement loginBtn;

    @FindBy(xpath="//infra-root/div/infra-notification/div/div")
    private WebElement errorMessage;

        public ReadProperties readProperties;
    public LoginPage() {
            PageFactory.initElements(driver, this);
            readProperties = new ReadProperties();
        }
        public void login() 
        { 
        	
            String username=readProperties.getUserName("username");
        	String password=readProperties.getUserName("password");
        	CommonUtil.waitUntilElementIsDisplayed(userNameTxt, 20);
            userNameTxt.clear();
            userNameTxt.sendKeys(username);
            CommonUtil.waitUntilElementIsDisplayed(passWordTxt, 20);
            passWordTxt.clear();          
            passWordTxt.sendKeys(password);
            CommonUtil.waitUntilElementIsDisplayed(loginBtn, 20);
            loginBtn.click();
        }
        
        public void incorrectLogin() 
        { 
        	
            String username=readProperties.getUserName("username");
        	String password=readProperties.getUserName("wrongPassword");
        	CommonUtil.waitUntilElementIsDisplayed(userNameTxt, 20);
            userNameTxt.clear();
            userNameTxt.sendKeys(username);
            CommonUtil.waitUntilElementIsDisplayed(passWordTxt, 20);
            passWordTxt.clear();          
            passWordTxt.sendKeys(password);
            CommonUtil.waitUntilElementIsDisplayed(loginBtn, 20);
            loginBtn.click();
        }

    public boolean checkErrorMessage(){
        CommonUtil.waitUntilElementIsDisplayed(errorMessage, 30);
        return CommonUtil.verifyElementIsVisible(errorMessage);
    }
}
