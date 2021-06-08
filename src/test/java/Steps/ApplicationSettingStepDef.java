package Steps;

import Pages.ApplicationSettingpage;
import Utility.LoggerHelper;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;

public class ApplicationSettingStepDef {
    ApplicationSettingpage applicationSettingpage=new ApplicationSettingpage();
    Logger log = LoggerHelper.getLogger(LoginStepDef.class);

    @When("^i click on Administration$")
    public void i_click_on_Administration() {
        applicationSettingpage.clickOnAdministration();
    }

    @Then("^click on Application Settings$")
    public void click_on_Application_Settings(){
        applicationSettingpage.clickOnAppSettings();
    }

    @Then("^update the Title \"([^\"]*)\" and new title \"([^\"]*)\"$")
    public void update_the_Title_and_new_title(String title, String titleNew) throws Exception{
        applicationSettingpage.updateTitle(title,titleNew );
    }
    }
