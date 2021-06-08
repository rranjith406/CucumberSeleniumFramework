package com.tmos.api.steps;

import org.testng.Assert;
import com.tmos.api.utility.APIUtility;
import com.tmos.api.utility.SetServiceHeaderURI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GetSelectedApplicationStylingAPISteps {

	public static String resource;
	
	@Given("^I set getSelectedApplicationStyling API request header$")
	public void i_set_getSelectedApplicationStyling_API_request_header() {
		resource = APIUtility.getProperty("GetSelectedApplicationStyling.resource");
		SetServiceHeaderURI.setServiceHeader(resource);
	}

	@When("^I set getSelectedApplicationStyling API request URI$")
	public void i_set_getSelectedApplicationStyling_API_request_URI() {
		SetServiceHeaderURI.setServiceURI();
	}

	@When("^I send HTTP \"([^\"]*)\" request for getting getSelectedApplicationStyling details$")
	public void i_send_HTTP_request_for_getting_getSelectedApplicationStyling_details(String requestType) {
		SetServiceHeaderURI.executeServiceRequest(requestType);
	}

	@Then("^I receive getSelectedApplicationStyling Response code as (\\d+)$")
	public void i_receive_getSelectedApplicationStyling_Response_code_as(int expectedStatusCode) {
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}
}
