package com.tmos.api.steps;

import org.testng.Assert;

import com.tmos.api.services.GetMachineByIdService;
import com.tmos.api.services.GetTrackByIdService;
import com.tmos.api.utility.APIUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class GetTrackByIdAPISteps {

	public GetTrackByIdService getTrackByIdService;
	public GetTrackByIdAPISteps()
	{
		getTrackByIdService = new GetTrackByIdService();
	}
	
	@Given("^I set get Track by Id API request header$")
	public void i_set_get_Track_by_Id_API_request_header() throws Throwable 
	{
		getTrackByIdService.addGetTrackByIdServiceHeader();
	}
	
	@When("^I set get Track by Id API request URI$")
	public void i_set_get_Track_with_Id_API_request_URI() throws Throwable 
	{
		getTrackByIdService.createGetTrackByIdServiceURI();
	}
	
	@When("^I set get Track by Id API request URI with \"([^\"]*)\"$")
	public void i_set_get_Track_by_Id_API_request_URI(String trackId) throws Throwable 
	{
		getTrackByIdService.createGetTrackByIdServiceURI(trackId);
	}

	@When("^I send HTTP \"([^\"]*)\" request for getting track details$")
	public void i_send_HTTP_request_for_getting_track_details(String requestType) throws Throwable 
	{
		getTrackByIdService.executeGetTrackByIdServiceRequest(requestType);
	}

	@Then("^I receive HTTP Response code as (\\d+) for getting Track details successfully$")
	public void i_receive_HTTP_Response_code_as_for_getting_Track_details_successfully(int expectedStatusCode) throws Throwable 
	{
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}
	@Then("^I verify track details like \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_verify_track_details_like(String expectedName,String expectedShortName,String expectedLine,String expectedTrack ) throws Throwable 
	{
		getTrackByIdService.getTrackDetailsFromResponse();
		Assert.assertEquals(getTrackByIdService.getTrackName(), expectedName);
		Assert.assertEquals(getTrackByIdService.getShortName(), expectedShortName);
		Assert.assertEquals(getTrackByIdService.getLine(), expectedLine);
		Assert.assertEquals(getTrackByIdService.getTrack(), expectedTrack);
		
	}
}
