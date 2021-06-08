package com.tmos.api.steps;

import com.tmos.api.utility.APIUtility;
import com.tmos.api.utility.SetServiceHeaderURI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GetAllRoleAPISteps {

	/*GetAllRoleService roleAdminService;
	public GetAllRoleAPISteps() {
		roleAdminService = new GetAllRoleService();
	}*/
	
	private static String resource;
	
	@Given("^I set getAllRole API request header$")
	public void i_set_getAllRole_API_request_header() {
		//roleAdminService.getAllRolesServiceHeader();
		resource = APIUtility.getProperty("GetAllRoles.resource");
		System.out.println("I set getAllRole API request header method executed:"+ resource);
		SetServiceHeaderURI.setServiceHeader(resource);
	}

	@When("^I set getAllRole API request URI$")
	public void i_set_getAllRole_API_request_URI() {
	// roleAdminService.getAllRolesServiceURI();
		SetServiceHeaderURI.setServiceURI();
	}

	@When("^I send HTTP \"([^\"]*)\" request for getting role details$")
	public void i_send_HTTP_request_for_getting_role_details(String requestType) {
		//roleAdminService.executeGetAllRolesServiceRequest(requestType);
		SetServiceHeaderURI.executeServiceRequest(requestType);
	}

	@Then("^I receive getAllRole Response code as (\\d+)$")
	public void i_receive_getAllRole_Response_code_as(int expectedStatusCode) {
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}
}
