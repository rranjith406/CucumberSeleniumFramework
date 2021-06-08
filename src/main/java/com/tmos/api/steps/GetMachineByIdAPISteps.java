package com.tmos.api.steps;

import org.testng.Assert;

import com.tmos.api.services.GetMachineByIdService;
import com.tmos.api.utility.APIUtility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GetMachineByIdAPISteps 
{
	public GetMachineByIdService getMachineByIdService;
	public GetMachineByIdAPISteps()
	{
		getMachineByIdService = new GetMachineByIdService();
	}
	
	@Given("^I set get Machine by Id API request header$")
	public void i_set_get_Machine_by_Id_API_request_header() throws Throwable 
	{
		getMachineByIdService.addGetMachineByIdServiceHeader();
	}
	
	@When("^I set get Machine by Id API request URI$")
	public void i_set_get_Machine_with_Id_API_request_URI() throws Throwable 
	{
		getMachineByIdService.createGetMachineByIdServiceURI();
	}

	@When("^I set get Machine by Id API request URI with \"([^\"]*)\"$")
	public void i_set_get_Machine_by_Id_API_request_URI(String machineID) throws Throwable 
	{
		getMachineByIdService.createGetMachineByIdServiceURI(machineID);
	}

	@When("^I send HTTP \"([^\"]*)\" request for getting machine details$")
	public void i_send_HTTP_request_for_getting_machine_details(String requestType) throws Throwable 
	{
		getMachineByIdService.executeGetMachineByIdServiceRequest(requestType);
	}

	@Then("^I receive HTTP Response code as (\\d+) for getting Machine details successfully$")
	public void i_receive_HTTP_Response_code_as_for_getting_Machine_details_successfully(int expectedStatusCode) throws Throwable 
	{
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}
	@Then("^I verify machine details like \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void i_verify_machine_details_like(String expectedName, String expectedShortName, String expectedMachineNumber, String expectedLatitude, String expectedLongitude) throws Throwable 
	{
		getMachineByIdService.getMachineDetailsFromResponse();
		Assert.assertEquals(getMachineByIdService.getMachineName(), expectedName);
		Assert.assertEquals(getMachineByIdService.getShortName(), expectedShortName);
		Assert.assertEquals(getMachineByIdService.getMachineNumber(), expectedMachineNumber);
		Assert.assertEquals(String.valueOf(getMachineByIdService.getLatitude()), expectedLatitude);
		Assert.assertEquals(String.valueOf(getMachineByIdService.getLongitude()), expectedLongitude);
	}
}
