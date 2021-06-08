package com.tmos.api.steps;

import org.testng.Assert;

import com.tmos.api.utility.APIUtility;
import com.tmos.api.utility.SetServiceHeaderURI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GetGroupHierarchyAPISteps {

	public static String resource;
	
	
	@Given("^I set getGroupHierarchy API request header$")
	public void i_set_getGroupHierarchy_API_request_header() {
		resource = APIUtility.getProperty("GetGroupHierarchy.resource");
		SetServiceHeaderURI.setServiceHeader(resource);
	}

	@When("^I set getGroupHierarchy API request URI$")
	public void i_set_getGroupHierarchy_API_request_URI() {
		SetServiceHeaderURI.setServiceURI();
	}

	@When("^I send HTTP \"([^\"]*)\" request for getting group details$")
	public void i_send_HTTP_request_for_getting_group_details(String requestType) {
		SetServiceHeaderURI.executeServiceRequest(requestType);
	}

	@Then("^I receive getGroupHierarchy Response code as (\\d+)$")
	public void i_receive_getGroupHierarchy_Response_code_as(int expectedStatusCode) {
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}
}
