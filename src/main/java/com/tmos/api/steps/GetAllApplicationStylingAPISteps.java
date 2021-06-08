package com.tmos.api.steps;

import com.tmos.api.utility.APIUtility;
import com.tmos.api.utility.SetServiceHeaderURI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GetAllApplicationStylingAPISteps {

	public static String resource;
	@Given("^I set getAllApplicationStyling API request header$")
	public void i_set_getAllApplicationStyling_API_request_header() {
		resource = APIUtility.getProperty("GetAllApplicationStyling.resource");
		SetServiceHeaderURI.setServiceHeader(resource);
	}

	@When("^I set getAllApplicationStyling API request URI$")
	public void i_set_getAllApplicationStyling_API_request_URI(){
		SetServiceHeaderURI.setServiceURI();
	}

	@When("^I send HTTP \"([^\"]*)\" request for getting AllApplicationStyling details$")
	public void i_send_HTTP_request_for_getting_AllApplicationStyling_details(String requestType) {
		SetServiceHeaderURI.executeServiceRequest(requestType);
	}

	@Then("^I receive getAllApplicationStyling Response code as (\\d+)$")
	public void i_receive_getAllApplicationStyling_Response_code_as(int expectedStatusCode) {
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}
}
