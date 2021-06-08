package com.tmos.api.steps;

import org.testng.Assert;

import com.tmos.api.services.CreateMachineService;
import com.tmos.api.utility.APIUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Jyotirmoy Ganguly
 *
 */

public class CreateMachineAPISteps {
	public CreateMachineService createMachineService;

	public CreateMachineAPISteps() {
		createMachineService = new CreateMachineService();
	}

	@Given("^I set Machine creation API request header$")
	public void i_set_Machine_creation_API_request_header() throws Throwable {
		createMachineService.addCreateMachineServiceHeader();
	}

	@When("^I set Machine creation API request URI$")
	public void i_set_Machine_creation_API_request_URI() throws Throwable {
		createMachineService.createMachineServiceURI();
	}

	@Then("^I set machine details like \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_set_machine_details_like(String name, String shortName, String machineNumber, String latitude,
			String longitude) throws Throwable {
		createMachineService.createMachineServiceRequestBody(name, shortName, machineNumber, latitude, longitude);
	}

	@When("^I send HTTP \"([^\"]*)\" request for Machine creation$")
	public void i_send_HTTP_request_Machine_creation(String requestType) throws Throwable {
		createMachineService.executeCreateMachineServiceRequest(requestType);
	}

	@Then("^I receive HTTP Response code as (\\d+) for Machine creation$")
	public void i_receive_HTTP_Response_code_as_for_Machine_creation(int expectedStatusCode) throws Throwable {
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}

	@Then("^I verify response for successful machine creation$")
	public void i_verify_response_for_Machine_creation() throws Throwable {
		Assert.assertEquals(Boolean.parseBoolean(APIUtility.getResponseValueFromJSON("success")), true);
	}
}
