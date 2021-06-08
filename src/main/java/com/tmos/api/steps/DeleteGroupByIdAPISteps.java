package com.tmos.api.steps;

import org.testng.Assert;

import com.tmos.api.utility.APIUtility;
import com.tmos.api.utility.SetServiceHeaderURI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteGroupByIdAPISteps {

	public static String resource;
	@Given("^I set delete GroupById API request header$")
	public void i_set_delete_RoleGroupById_API_request_header() {
		resource = APIUtility.getProperty("DeleteGroupById.resource");
		SetServiceHeaderURI.setServiceHeader(resource);
	}

	@When("^I set delete GroupById API request URI with \"([^\"]*)\"$")
	public void i_set_delete_RoleGroupById_API_request_URI_with(String groupId) {
		SetServiceHeaderURI.createByIdServiceURI(groupId);
	}

	@When("^I send HTTP \"([^\"]*)\" request for deleting group details$")
	public void i_send_HTTP_request_for_deleting_group_details(String requestType) {
		SetServiceHeaderURI.executeServiceRequestwithParam(requestType);
	}

	@Then("^I receive HTTP Response code as (\\d+) for group deletion successful$")
	public void i_receive_HTTP_Response_code_as_for_group_deletion_successful(int expectedStatusCode) {
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}

	@Then("^I verify response for successful group deletion$")
	public void i_verify_response_for_successful_group_deletion() {
		Assert.assertEquals(Boolean.parseBoolean(APIUtility.getResponseValueFromJSON("success")), true);
	}

}
