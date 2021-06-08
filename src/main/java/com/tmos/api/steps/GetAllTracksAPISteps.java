package com.tmos.api.steps;

import com.tmos.api.utility.APIUtility;
import com.tmos.api.utility.SetServiceHeaderURI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GetAllTracksAPISteps {

	public static String resource;
	
	@Given("^I set getAllTracks API request header$")
	public void i_set_getAllTracks_API_request_header() {
		resource = APIUtility.getProperty("GetAllTracks.resource");
		SetServiceHeaderURI.setServiceHeader(resource);
	}

	@When("^I set getAllTracks API request URI$")
	public void i_set_getAllTracks_API_request_URI() {
		SetServiceHeaderURI.setServiceURI();
	}

	@When("^I send HTTP \"([^\"]*)\" request for getting all tracks details$")
	public void i_send_HTTP_request_for_getting_all_tracks_details(String requestType) {
		SetServiceHeaderURI.executeServiceRequest(requestType);
	}
	
	@Then("^I receive getAllTracks Response code as (\\d+)$")
	public void i_receive_getAllTracks_Response_code_as(int expectedStatusCode) {
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}
}
