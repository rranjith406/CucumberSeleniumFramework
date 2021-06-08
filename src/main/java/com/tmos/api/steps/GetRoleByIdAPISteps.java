package com.tmos.api.steps;

import org.testng.Assert;
import com.tmos.api.services.GetRoleByIdService;
import com.tmos.api.utility.APIUtility;
import com.tmos.api.utility.SetServiceHeaderURI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GetRoleByIdAPISteps {

	GetRoleByIdService getRoleByIdService;
	
	public GetRoleByIdAPISteps() {
		getRoleByIdService = new GetRoleByIdService();
	}
	public static String resource;
	@Given("^I set get role by Id API request header$")
	public void i_set_get_role_by_Id_API_request_header() {
		//getRoleByIdService.getRoleByIdServiceHeader();
		resource=APIUtility.getProperty("GetRoleById.resource");
		SetServiceHeaderURI.setServiceHeader(resource);
	}

	@When("^I set get role by Id API request URI with \"([^\"]*)\"$")
	public void i_set_get_role_by_Id_API_request_URI_with(String roleId) {
		//getRoleByIdService.getRoleByIdServiceURI();
		SetServiceHeaderURI.createByIdServiceURI(roleId);
	}
	
	@When("^I send HTTP \"([^\"]*)\" request for getting rolebyId details$")
	public void i_send_HTTP_request_for_getting_roleById_details(String requestType) {
		//getRoleByIdService.executeGetRoleByIdServiceRequest(requestType);
		SetServiceHeaderURI.executeServiceRequestwithParam(requestType);
	}

	@Then("^I receive HTTP Response code as (\\d+) for getting role details successfully$")
	public void i_receive_HTTP_Response_code_as_for_getting_role_details_successfully(int expectedStatusCode){
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}
	
	//invalidRoleId
	@Then("^I receive HTTP Response code as (\\d+) for invalid roleId$")
	public void i_receive_HTTP_Response_code_as_for_invalid_roleId(int expectedStatusCode) {
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}


}
