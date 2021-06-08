package com.tmos.api.steps;

import org.testng.Assert;

import com.tmos.api.utility.APIUtility;
import com.tmos.api.utility.SetServiceHeaderURI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GetAllPoliciesAPISteps {

	private static String resource;
	
	@Given("^I set getAllPolicies API request header$")
	public void i_set_getAllPolicies_API_request_header() {
		resource = APIUtility.getProperty("GetAllPolicies.resource");
		SetServiceHeaderURI.setServiceHeader(resource);
	}

	@When("^I set getAllPolicies API request URI$")
	public void i_set_getAllPolicies_API_request_URI() {
		SetServiceHeaderURI.setServiceURI();
	}

	@When("^I send HTTP \"([^\"]*)\" request for getting getAllPolicies details$")
	public void i_send_HTTP_request_for_getting_getAllPolicies_details(String requestType) {
		SetServiceHeaderURI.executeServiceRequest(requestType);
	}

	@Then("^I receive getAllPolicies Response code as (\\d+)$")
	public void i_receive_getAllPolicies_Response_code_as(int expectedStatusCode) {
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}
}
