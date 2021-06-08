package com.tmos.api.steps;

import com.tmos.api.utility.APIUtility;
import com.tmos.api.utility.SetServiceHeaderURI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GetVersionAPISteps {

	public static String resource;
	@Given("^I set getVersion API request header$")
	public void i_set_getVersion_API_request_header() {
		resource = APIUtility.getProperty("version.resource");
		SetServiceHeaderURI.setServiceHeader(resource);
	}

	@When("^I set getVersion API request URI$")
	public void i_set_getVersion_API_request_URI() {
		SetServiceHeaderURI.setServiceURI();
	}

	@When("^I send HTTP \"([^\"]*)\" request for getting version details$")
	public void i_send_HTTP_request_for_getting_version_details(String requestType) {
		SetServiceHeaderURI.executeServiceRequest(requestType);
	}

	@Then("^I receive version Response code as (\\d+)$")
	public void i_receive_version_Response_code_as(int expectedStatuscode){
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatuscode);
	}

}
