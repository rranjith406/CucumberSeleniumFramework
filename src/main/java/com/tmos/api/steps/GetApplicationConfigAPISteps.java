package com.tmos.api.steps;

import org.testng.Assert;
import com.tmos.api.utility.APIUtility;
import com.tmos.api.utility.SetServiceHeaderURI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GetApplicationConfigAPISteps {

	public static String resource;
	
	@Given("^I set getApplicationConfig API request header$")
	public void i_set_getApplicationConfig_API_request_header() {
		resource = APIUtility.getProperty("GetApplicationConfig.resource");
		SetServiceHeaderURI.setServiceHeader(resource);
	}

	@When("^I set getApplicationConfig API request URI$")
	public void i_set_getApplicationConfig_API_request_URI() {
		SetServiceHeaderURI.setServiceURI();
	}

	@When("^I send HTTP \"([^\"]*)\" request for getting getApplicationConfig details$")
	public void i_send_HTTP_request_for_getting_getApplicationConfig_details(String requestType) {
		SetServiceHeaderURI.executeServiceRequest(requestType);
	}

	@Then("^I receive getApplicationConfig Response code as (\\d+)$")
	public void i_receive_getApplicationConfig_Response_code_as(int expectedStatusCode) {
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}
}
