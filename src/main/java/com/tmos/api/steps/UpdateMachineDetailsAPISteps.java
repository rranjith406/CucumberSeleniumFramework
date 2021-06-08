package com.tmos.api.steps;
import org.testng.Assert;

import com.tmos.api.services.UpdateMachineDetailsService;
import com.tmos.api.utility.APIUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author Jyotirmoy Ganguly
 *
 */

public class UpdateMachineDetailsAPISteps 
{
	public UpdateMachineDetailsService updateMachineDetailsService;
	public UpdateMachineDetailsAPISteps()
	{
		updateMachineDetailsService = new UpdateMachineDetailsService();
	}
	@Given("^I set Update Machine details API request header$")
	public void i_set_Update_Machine_details_API_request_header_with() throws Throwable 
	{
		updateMachineDetailsService.addUpdateMachineServiceHeader();
	}

	@When("^I set Update Machine API request URI with \"([^\"]*)\"$")
	public void i_set_Update_Machine_API_request_URI(String machineID) throws Throwable 
	{
		updateMachineDetailsService.updateMachineServiceURI(machineID);
	}

	@When("^I set updated machine details with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_set_updated_machine_details_with(String name, String shortName, String machineNumber, String latitude, String longitude) throws Throwable 
	{
		updateMachineDetailsService.updateMachineServiceRequestBody(name, shortName, machineNumber, latitude, longitude);
	}

	@When("^I send HTTP \"([^\"]*)\" request for updating machine details$")
	public void i_send_HTTP_request_for_updating_machine_details(String requestType) throws Throwable 
	{
		updateMachineDetailsService.executeUpdateMachineServiceRequest(requestType);
	}

	@Then("^I receive HTTP Response code as (\\d+) for updating Machine details successfully$")
	public void i_receive_HTTP_Response_code_as_for_updating_Machine_details_successfully(int expectedStatusCode) throws Throwable 
	{
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}

	@Then("^I verify response for successful machine updation$")
	public void i_verify_response_for_Machine_updation() throws Throwable 
	{
		Assert.assertEquals(Boolean.parseBoolean(APIUtility.getResponseValueFromJSON("success")), true);
	}
}
