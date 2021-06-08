package com.tmos.api.steps;

import org.testng.Assert;

import com.tmos.api.utility.APIUtility;
import com.tmos.api.utility.SetServiceHeaderURI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeletePolicyByIdAPISteps {
	
	public static String resource;
	@Given("^I set delete PolicyById API request header$")
	public void i_set_delete_PolicyById_API_request_header() {
		resource = APIUtility.getProperty("DeletePolicyById.resource");
		SetServiceHeaderURI.setServiceHeader(resource);
	}

	@When("^I set delete PolicyById API request URI with \"([^\"]*)\"$")
	public void i_set_delete_PolicyById_API_request_URI_with(String policyId) {
		SetServiceHeaderURI.createByIdServiceURI(policyId);
	}

	@When("^I send HTTP \"([^\"]*)\" request for deleting policy details$")
	public void i_send_HTTP_request_for_deleting_policy_details(String requestType) {
		SetServiceHeaderURI.executeServiceRequestwithParam(requestType);
	}

	@Then("^I receive HTTP Response code as (\\d+) for policy deletion successful$")
	public void i_receive_HTTP_Response_code_as_for_policy_deletion_successful(int expectedStatusCode) {
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}

	@Then("^I verify response for successful policy deletion$")
	public void i_verify_response_for_successful_policy_deletion() {
		Assert.assertEquals(Boolean.parseBoolean(APIUtility.getResponseValueFromJSON("success")), true);
	}
	
	//invalidPolicyId
	@Then("^I receive HTTP Response code as (\\d+) for Invalid policyId deletion$")
	public void i_receive_HTTP_Response_code_as_for_Invalid_policyId_deletion(int expectedStatusCode) {
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}

	@Then("^I verify response for policy deletion$")
	public void i_verify_response_for_policy_deletion() {
		//Assert.assertEquals(Boolean.parseBoolean(APIUtility.getResponseValueFromJSON("entity")), policy);
		
	}
}
