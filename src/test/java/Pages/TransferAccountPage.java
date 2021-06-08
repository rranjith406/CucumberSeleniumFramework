package Pages;

import Base.BaseUtil;
import Utility.CommonUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.Callable;

public class TransferAccountPage extends BaseUtil {
    @FindBy(id = "fromAccount")
    private WebElement selectFromAccount;
    @FindBy(id = "toAccount")
    private WebElement selectToAccount;
    @FindBy(id = "amount")
    private WebElement amountTxtBox;
    @FindBy(xpath = "//button[contains(text(), 'Submit')]")
    private WebElement submitBtn;
    @FindBy(xpath = "//*[contains(text(), 'Transfer Between Accounts')]")
    private WebElement transferBetweenText;
    @FindBy(xpath = "//*[@class='card-title text-light' and contains(text(), 'Transactions')]")
    private WebElement transactionText;


      public TransferAccountPage() {
        PageFactory.initElements(driver, this);
    }

    public void fillDetailsForFundTransfer(String fromAccount, String toAccount, String amount) {
        CommonUtil.selectDropDownByValue(selectFromAccount, fromAccount);
        CommonUtil.selectDropDownByValue(selectToAccount, toAccount);
        amountTxtBox.clear();
        amountTxtBox.sendKeys(amount);
    }

    public void clickOnSubmitBtn() {
        CommonUtil.waitUntilElementIsDisplayed(submitBtn, 10);
        submitBtn.click();
     }

     public boolean verifyElementPresent () {
         return CommonUtil.isElementPresent(transferBetweenText);
     }

     public boolean verifyTransactionText() {
          CommonUtil.scrollByVisibleElement(transactionText);
          return CommonUtil.verifyPageContainsText("Transactions");
     }

}


