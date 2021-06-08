package Steps;

import Base.BaseUtil;
import Pages.LoginPage;
import Pages.HomePage;
import Utility.CommonUtil;
import Utility.LoggerHelper;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class LoginStepDef  {

    Logger log = LoggerHelper.getLogger(LoginStepDef.class);
    LoginPage loginPage = new LoginPage();
    HomePage HomePage = new HomePage();

    @When("^i Navigate to Login Page and enter the following$")
    public void i_Navigate_to_Login_Page_and_enter_the_following() throws Throwable {
        loginPage.login();
    }

    @When("^I Navigate to Login Page and enter the incorrect credentials$")
    public void i_Navigate_to_Login_Page_and_enter_the_incorrect_credentials() throws Throwable {
        loginPage.incorrectLogin();
    }

//    @And("^click on Login button$")
////    public void clickOnLoginButton(){
////        loginPage.login();
////    }

    @Then("^I should navigate to Home Page$")
    public void iShouldNavigateToHomePage()  {
        CommonUtil.verifyPageContainsText("Home");
        System.out.println("Home Page");
    }

    @And("^I click admin dropdown$")
    public void iClickAdminDropdown() {
        HomePage.clickOnAdminMenu();

    }

    @And("^click on Logout$")
    public void clickOnLogoutButton() {
        HomePage.clickOnLogOut();
        System.out.println("Logout clicked");
    }


//    @Then("^I should navigate to Login page$")
//    public void iShouldNavigateToLoginPage() {
//
//    }

    @Then("^I should get error message$")
    public void iShouldGetErrorMessage()  {
        Assert.assertEquals(loginPage.checkErrorMessage(),true);
    }

//    @When("^Navigate to Login Page and enter the following$")
//    public void navigateToLoginPageAndEnterTheFollowing(DataTable table)  {
//
//        List<Users> users = new ArrayList<Users>();
//        users = table.asList(Users.class);
//        for (Users user : users) {
//            log.info("username "+user.username+" password :"+user.password);
//            loginPage.login();
//        }
//    }

    @When("navigate to Login Page and enter ([^\"]*) and ([^\"]*)")
    public void navigateToLoginPageAndEnterUsernameAndPassword(String username,String password) {
        log.info("username "+username+" password :"+password);
        loginPage.login();
    }



    public class Users {
        public String username;
        public String password;

        public Users(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }
}

