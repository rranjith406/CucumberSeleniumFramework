/*package Steps;


import Base.BaseUtil;
import Pages.*;
import Utility.CommonUtil;
import Utility.LoggerHelper;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class AccountStepDef {
    Logger log = LoggerHelper.getLogger(LoginStepDef.class);
    AccountPage accountPage = new AccountPage();
    HomePage homePage = new HomePage();
    TransferAccountPage transferAccountPage = new TransferAccountPage();

    private int initialCount = homePage.verifyInitialNotificationCount();


    @When("^expand checking under Banking Accounts$")
    public void expand_checking_under_Banking_Accounts() {
        homePage.clickOnBankAccount();
    }

    @When("^click on new Checking$")
    public void click_on_new_Checking() {
        homePage.createANewAccount();

    }

    @Then("^should be able to create a new Account with following details$")
    public void should_be_able_to_create_a_new_Account_with_following_details(DataTable table) {
        List<Account> accountDetails;
        accountDetails = table.asList(Account.class);
        for (Account A : accountDetails) {
            new AccountPage().fillAccountDetails(A.accountType, A.accountOwner, A.accountName, A.deposit);
            final int initialDeposit = A.deposit;
            final String owner = A.accountName;
            new AccountPage().submit();
        }
    }

    @When("^should be able to verify the created Account by increased notification Count$")
    public void should_be_able_to_verify_the_created_Account_by_increased_notification_Count() {
        int afterCount = homePage.verifyAfterNotificationCount();
        if (!(afterCount > initialCount)) {
            Assert.fail("Account has not created");
        }

    }

    @Then("^I should be able to see the link \"([^\"]*)\"$")
    public void i_should_be_able_to_see_the_link(String link) throws Throwable {
       Assert.assertTrue(homePage.verifyLinkPresent());
    }

    @Then("^I should navigate to Transfer Between Account$")
    public void i_should_navigate_to_Transfer_Between_Account() throws Throwable {
        Assert.assertTrue(transferAccountPage.verifyElementPresent());
    }

    @When("^I select the ([^\"]*), ([^\"]*) and enter ([^\"]*)$")
    public void i_select_the_and_enter(String fromAcc, String ToAcc, String amount) throws Throwable {
        transferAccountPage.fillDetailsForFundTransfer(fromAcc, ToAcc, amount);
    }

    @When("^I click on submit button$")
    public void i_click_on_submit_button() throws Throwable {
        transferAccountPage.clickOnSubmitBtn();
    }

    @Then("^I should navigate to transaction check page$")
    public void i_should_navigate_to_transaction_check_page() throws Throwable {
        Assert.assertTrue(transferAccountPage.verifyTransactionText());
    }

    @When("^I click on link Transfer Link$")
    public void i_click_on_link_Transfer_Link() throws Throwable {
        homePage.clickOnTransferLink();

    }

    @When("^I click on link Between Accounts$")
    public void i_click_on_link_Between_Accounts() throws Throwable {
        homePage.clickOnBetweenLink();
    }

    public class Account {
        public String accountType;
        public String accountOwner;
        public String accountName;
        public int deposit;


        Account(String accountType, String accountOwner, String accountName, int deposit) {
            this.accountType = accountType;
            this.accountOwner = accountOwner;
            this.accountName = accountName;
            this.deposit = deposit;
        }
    }

}

*/