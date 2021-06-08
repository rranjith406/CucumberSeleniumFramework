package com.tmos.api.steps;

import org.testng.Assert;

import com.tmos.api.services.GetUserByIdService;
import com.tmos.api.utility.APIUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VerifyGetUserByIdAPISteps {
	
	GetUserByIdService getUserByIdService;
	
	public VerifyGetUserByIdAPISteps() {
		getUserByIdService = new GetUserByIdService();
	}

	@Given("^I set getUserById API request header$")
	public void i_set_getUserById_API_request_header() {
		getUserByIdService.addGetUserByIdServiceHeader();
	}

	@When("^I set getUserById API request URI with \"([^\"]*)\"$")
	public void i_set_getUserById_API_request_URI_with(String requestType) {
		getUserByIdService.createGetUserByIdServiceURI(requestType);
	}

	@When("^I send HTTP \"([^\"]*)\" request for getting getUserById details$")
	public void i_send_HTTP_request_for_getting_getUserById_details(String userId){
getUserByIdService.executeGetUserByIdServiceRequest(userId);
	}

	@Then("^I receive getUserById Response code as (\\d+)$")
	public void i_receive_getUserById_Response_code_as(int expectedStatusCode){
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}

	@Then("^I verify user details like \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_verify_user_details_like(String arg1, String arg2, String arg3, String arg4, String arg5){
		
	}
}
