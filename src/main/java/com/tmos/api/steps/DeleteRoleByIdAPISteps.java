package com.tmos.api.steps;

import org.testng.Assert;

import com.tmos.api.services.DeleteMachineService;
import com.tmos.api.services.DeleteRoleByIdService;
import com.tmos.api.services.DeleteTrackService;
import com.tmos.api.utility.APIUtility;
import com.tmos.api.utility.SetServiceHeaderURI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteRoleByIdAPISteps {

	public DeleteRoleByIdService deleteRoleByIdService;
	public static String resource;
	public DeleteRoleByIdAPISteps()
	{
		deleteRoleByIdService = new DeleteRoleByIdService();
	}

	@Given("^I set delete RoleRoleById API request header$")
	public void i_set_delete_RoleRoleById_API_request_header() {
		//deleteRoleByIdService.addDeleteRoleByIdServiceHeader();
		resource = APIUtility.getProperty("DeleteRoleById.resource");
		SetServiceHeaderURI.setServiceHeader(resource);
	}

	@When("^I set delete RoleRoleById API request URI with \"([^\"]*)\"$")
	public void i_set_delete_RoleRoleById_API_request_URI_with(String roleId) {
		//deleteRoleByIdService.createDeleteRoleByIdServiceURI(roleId);
		SetServiceHeaderURI.createByIdServiceURI(roleId);
	}

	@When("^I send HTTP \"([^\"]*)\" request for deleting role details$")
	public void i_send_HTTP_request_for_deleting_role_details(String requestType) {
		//deleteRoleByIdService.executeDeleteRoleByIdServiceRequest(requestType);
		SetServiceHeaderURI.executeServiceRequestwithParam(requestType);
	}

	@Then("^I receive HTTP Response code as (\\d+) for role deletion successful$")
	public void i_receive_HTTP_Response_code_as_for_role_deletion_successful(int expectedStatusCode) {
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}

	@Then("^I verify response for successful role deletion$")
	public void i_verify_response_for_successful_role_deletion() {
		Assert.assertEquals(Boolean.parseBoolean(APIUtility.getResponseValueFromJSON("success")), true);
	}
}
