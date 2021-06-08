package com.tmos.api.steps;

import org.testng.Assert;

import com.tmos.api.services.DeleteTrackService;
import com.tmos.api.utility.APIUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Jyotirmoy Ganguly
 *
 */

public class DeleteTrackAPISteps {

	public DeleteTrackService deleteTrackService;
	public DeleteTrackAPISteps()
	{
		deleteTrackService = new DeleteTrackService();
	}
	
	@Given("^I set delete track API request header$")
	public void i_set_delete_track_API_request_header() throws Throwable 
	{
		deleteTrackService.addDeleteTrackServiceHeader();
	}

	@When("^I set delete track API request URI with \"([^\"]*)\"$")
	public void i_set_delete_track_API_request_URI_with(String trackId) throws Throwable 
	{
		deleteTrackService.createDeleteTrackServiceURI(trackId);
	}

	@When("^I send HTTP \"([^\"]*)\" request for deleting track details$")
	public void i_send_HTTP_request_for_deleting_track_details(String requestType) throws Throwable 
	{
		deleteTrackService.executeDeleteTrackServiceRequest(requestType);
	}

	@Then("^I receive HTTP Response code as (\\d+) for track deletion successfully$")
	public void i_receive_HTTP_Response_code_as_for_track_deletion_successfully(int expectedStatusCode) throws Throwable 
	{
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}

	@Then("^I verify response for successful track deletion$")
	public void i_verify_response_for_successful_track_deletion() throws Throwable 
	{
		Assert.assertEquals(Boolean.parseBoolean(APIUtility.getResponseValueFromJSON("success")), true);
	}

}
