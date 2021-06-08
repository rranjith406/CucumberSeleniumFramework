package com.tmos.api.steps;

import org.testng.Assert;

import com.tmos.api.services.UpdateMachineDetailsService;
import com.tmos.api.services.UpdateTrackDetailsService;
import com.tmos.api.utility.APIUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Jyotirmoy Ganguly
 *
 */

public class UpdateTrackDetailsAPISteps {

	public UpdateTrackDetailsService updateTrackDetailsService;
	public UpdateTrackDetailsAPISteps()
	{
		updateTrackDetailsService = new UpdateTrackDetailsService();
	}
	@Given("^I set Update track details API request header$")
	public void i_set_Update_track_details_API_request_header_with() throws Throwable 
	{
		updateTrackDetailsService.addUpdateTrackServiceHeader();
	}

	@When("^I set Update track API request URI with \"([^\"]*)\"$")
	public void i_set_Update_track_API_request_URI(String trackID) throws Throwable 
	{
		updateTrackDetailsService.updateTrackServiceURI(trackID);
	}

	@When("^I set updated track details with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_set_updated_track_details_with(String name, String shortName, double line, double track) throws Throwable 
	{
		updateTrackDetailsService.updateTrackServiceRequestBody(name, shortName, line, track);
	}

	@When("^I send HTTP \"([^\"]*)\" request for updating track details$")
	public void i_send_HTTP_request_for_updating_track_details(String requestType) throws Throwable 
	{
		updateTrackDetailsService.executeUpdateTrackServiceRequest(requestType);
	}

	@Then("^I receive HTTP Response code as (\\d+) for updating track details successfully$")
	public void i_receive_HTTP_Response_code_as_for_updating_track_details_successfully(int expectedStatusCode) throws Throwable 
	{
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}

	@Then("^I verify response for successful track updation$")
	public void i_verify_response_for_track_updation() throws Throwable 
	{
		Assert.assertEquals(Boolean.parseBoolean(APIUtility.getResponseValueFromJSON("success")), true);
	}
}
