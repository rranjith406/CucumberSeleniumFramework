package com.tmos.api.steps;

import org.testng.Assert;

import com.tmos.api.services.DeleteMachineService;
import com.tmos.api.utility.APIUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Jyotirmoy Ganguly
 *
 */

public class DeleteMachineAPISteps 
{

	public DeleteMachineService deleteMachineService;
	public DeleteMachineAPISteps()
	{
		deleteMachineService = new DeleteMachineService();
	}
	
	@Given("^I set delete machine API request header$")
	public void i_set_delete_machine_API_request_header() throws Throwable 
	{
		deleteMachineService.addDeleteMachineServiceHeader();
	}

	@When("^I set delete machine API request URI with \"([^\"]*)\"$")
	public void i_set_delete_machine_API_request_URI_with(String machineId) throws Throwable 
	{
		deleteMachineService.createDeleteMachineServiceURI(machineId);
	}

	@When("^I send HTTP \"([^\"]*)\" request for deleting machine details$")
	public void i_send_HTTP_request_for_deleting_machine_details(String requestType) throws Throwable 
	{
		deleteMachineService.executeDeleteMachineServiceRequest(requestType);
	}

	@Then("^I receive HTTP Response code as (\\d+) for machine deletion successfully$")
	public void i_receive_HTTP_Response_code_as_for_machine_deletion_successfully(int expectedStatusCode) throws Throwable 
	{
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}

	@Then("^I verify response for successful machine deletion$")
	public void i_verify_response_for_successful_machine_deletion() throws Throwable 
	{
		Assert.assertEquals(Boolean.parseBoolean(APIUtility.getResponseValueFromJSON("success")), true);
	}
}
