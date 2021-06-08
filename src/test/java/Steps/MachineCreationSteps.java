package Steps;

import Pages.MasterData_Machine;
import Pages.TMOSHomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Pages.LoginPage;
public class MachineCreationSteps
{
	public LoginPage loginPage;
	public TMOSHomePage tmosHomePage;
	public MasterData_Machine masterData_Machine;

	public MachineCreationSteps()
	{
		loginPage = new LoginPage();
		tmosHomePage=new TMOSHomePage();
		masterData_Machine=new MasterData_Machine();
	}
	@Given("^I navigate to TMOS Login Page$")
	public void i_navigate_to_TMOS_Login_Page() throws Throwable {
		loginPage.login();

	}

	@When("^I validate \"([^\"]*)\" heading the landing page$")
	public void i_validate_the_landing_page_title_as(String Home) throws Throwable {
		tmosHomePage.verifyHomeHeadingDisplayed();
	}

	@Then("^I click on \"([^\"]*)\" Section$")
	public void i_click_on_Section(String masterData) throws Throwable {
		tmosHomePage.clickOnMasterData();
	}

	@Then("^I click on \"([^\"]*)\" section in master data$")
	public void i_click_on_section(String arg1) throws Throwable {
     masterData_Machine.machineClick();
	}

	@Then("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String arg1) throws Throwable {
		masterData_Machine.machineCreateBtnClick();
	   	}

	@Then("^I verified the \"([^\"]*)\" header$")
	public void i_verified_the_header(String arg1) throws Throwable {
	   masterData_Machine.validateEditMachine();
	}

	@Then("^I Entered all required fields \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void i_Entered_all_required_fields(String name, String shortName, String machineNumber, String latitute, String longitude) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		masterData_Machine.enterMachineCreationDeatils(name,shortName,machineNumber,latitute,longitude);
	}

	@Then("^select the \"([^\"]*)\"$")
	public void select_the(String arg1) throws Throwable {
	   masterData_Machine.selectingResourceGroup();
	}

	@Then("^click on \"([^\"]*)\" button$")
	public void click_on_button(String arg1) throws Throwable {
	  masterData_Machine.clickSaveButton();
	}


}
