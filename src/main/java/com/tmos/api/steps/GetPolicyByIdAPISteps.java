package com.tmos.api.steps;

import org.testng.Assert;

import com.tmos.api.services.GetMachineByIdService;
import com.tmos.api.services.GetPolicyByIdService;
import com.tmos.api.utility.APIUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GetPolicyByIdAPISteps {

	public GetPolicyByIdService getPolicyByIdService;
	public GetPolicyByIdAPISteps()
	{
		getPolicyByIdService = new GetPolicyByIdService();
	}
	
	@Given("^I set get policy by Id API request header$")
	public void i_set_get_policy_by_Id_API_request_header() {
		getPolicyByIdService.addGetPolicyByIdServiceHeader();
	}

	@When("^I set get policy by Id API request URI with \"([^\"]*)\"$")
	public void i_set_get_policy_by_Id_API_request_URI_with(String policyId) {
		getPolicyByIdService.createGetPolicyByIdServiceURI(policyId);
	}

	@When("^I send HTTP \"([^\"]*)\" request for getting policy details$")
	public void i_send_HTTP_request_for_getting_policy_details(String requestType) {
		getPolicyByIdService.executeGetPolicyByIdServiceRequest(requestType);
	}

	@Then("^I receive HTTP Response code as (\\d+) for getting policy details successfully$")
	public void i_receive_HTTP_Response_code_as_for_getting_policy_details_successfully(int expectedStatusCode) {
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}
}
