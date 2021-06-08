package com.tmos.api.steps;

import com.tmos.api.utility.APIUtility;
import com.tmos.api.utility.SetServiceHeaderURI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GetUserInformationAPISteps {
	
	public static String resource;
	@Given("^I set getUserInfo API request header$")
	public void i_set_getUserInfo_API_request_header() {
		resource = APIUtility.getProperty("GetUserInformation.resource");
		SetServiceHeaderURI.setServiceHeader(resource);
	}

	@When("^I set getUserInfo API request URI$")
	public void i_set_getUserInfo_API_request_URI() {
		SetServiceHeaderURI.setServiceURI();
	}

	@When("^I send HTTP \"([^\"]*)\" request for getting user details$")
	public void i_send_HTTP_request_for_getting_user_details(String requestType) {
		SetServiceHeaderURI.executeServiceRequest(requestType);
	}

	@Then("^I receive getUserInfo Response code as (\\d+)$")
	public void i_receive_getUserInfo_Response_code_as(int expectedStatusCode) {
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}

}
