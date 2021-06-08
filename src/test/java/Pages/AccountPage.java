package Pages;

import Base.BaseUtil;
import Utility.CommonUtil;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends BaseUtil {
    @FindBy(xpath="//input[@id='name']")
    private WebElement accountName;
    @FindBy(xpath="//input[@id='openingBalance']")
    private WebElement Deposit;
    @FindBy(xpath="//button[@type='submit' and @class='btn btn-primary btn-sm']")
    private WebElement submitBtn;
    @FindBy(xpath="//input[@type='radio'][@id='Standard Checking']")
    private WebElement standardAccType;
    @FindBy(xpath="//input[@type='radio'][@id='Interest Checking']")
    private WebElement interestAccType;
    @FindBy(xpath="//input[@type='radio'][@id='Individual']")
    private WebElement singleAccOwner;
    @FindBy(xpath="//input[@type='radio'][@id='Joint']")
    private WebElement jointAccOwner;


    public AccountPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectAccType(String accountType){
        if(accountType.equals("Standard Checking")){
            CommonUtil.selectRadioButton(standardAccType);
        }
        else if (accountType.equals("Interest Checking"))
        {
            CommonUtil.selectRadioButton(interestAccType);
        }

    }


    public void selectOwnership(String accountOwner){
        if(accountOwner.equals("Individual")){
            CommonUtil.selectRadioButton(singleAccOwner);
        }
        else if(accountOwner.equals("Joint")){
            CommonUtil.selectRadioButton(jointAccOwner);
        }

    }
    public void submit(){
        submitBtn.click();
    }


    public void fillAccountDetails(String accountType,
                                   String accountOwner,
                                   String accountNm,
                                   int deposit)
    {
        selectAccType(accountType);
        selectOwnership(accountOwner);
        accountName.sendKeys(accountNm);
        Deposit.sendKeys(String.valueOf(deposit));

    }
}
