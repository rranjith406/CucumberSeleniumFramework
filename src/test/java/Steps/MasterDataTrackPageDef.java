package Steps;
import Base.BaseUtil;
import Pages.LoginPage;
import Pages.MasterData_Machine;
import Pages.MasterData_Track;
import Pages.TMOSHomePage;
import Pages.HomePage;
import Utility.CommonUtil;
import Utility.LoggerHelper;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

import Pages.HomePage;
import Pages.LoginPage;
import Utility.LoggerHelper;

public class MasterDataTrackPageDef 
	{
		public LoginPage loginPage;
		public TMOSHomePage tmosHomePage;
		public MasterData_Track masterData_track;
		public MasterData_Machine masterData_Machine;
		

		public MasterDataTrackPageDef()
		{
			loginPage = new LoginPage();
			tmosHomePage=new TMOSHomePage();
			masterData_track=new MasterData_Track();
			masterData_Machine=new MasterData_Machine();
		}
		@Given("^Navigate to TMOS Login Page$")
		public void navigate_to_TMOS_Login_Page() throws Throwable {
			loginPage.login();
		}

		@When("^validate \"([^\"]*)\" heading the landing page$")
		public void validate_heading_the_landing_page(String arg1) throws Throwable {
			tmosHomePage.verifyHomeHeadingDisplayed();

		}

		@Then("^click on \"([^\"]*)\" Section$")
		public void click_on_Section(String arg1) throws Throwable {
			tmosHomePage.clickOnMasterData();
		}

		@Then("^click on \"([^\"]*)\" section in master data$")
		public void click_on_section_in_master_data(String arg1) throws Throwable {
			masterData_track.clickTrack();
			masterData_track.clickNewCreateButton();
		}

		@Then("^verified the \"([^\"]*)\" header$")
		public void verified_the_header(String arg1) throws Throwable {
			masterData_track.verifyTrackHeader();
		}

		@Then("^entering \"([^\"]*)\" and \"([^\"]*)\"$")
		public void entering_and(String Line, String Track) throws Throwable {
			masterData_track.tracklineAndTRack();
		}

		@Then("^Entered all required fields \"([^\"]*)\",\"([^\"]*)\"$")
		public void entered_all_required_fields(String Name, String shortName) throws Throwable {
			masterData_track.trackNameAndShortName(Name,shortName);
		}

		@Then("^selected the \"([^\"]*)\"$")
		public void selected_the(String arg1) throws Throwable {
			masterData_track.selectingTrackResourceGroup();
		}

		@Then("^clicked on \"([^\"]*)\" button$")
		public void clicked_on_button(String arg1) throws Throwable {
			masterData_track.trackSave();
		}
		@Then("^verify the \"([^\"]*)\" message after track creation$")
		public void verify_the_message_after_track_creation(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		}

	}
