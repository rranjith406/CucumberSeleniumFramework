package com.tmos.api.steps;

import com.tmos.api.services.LoginService;
import com.tmos.api.utility.APIUtility;
import com.tmos.api.utility.SetServiceHeaderURI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LoginLogoutAPISteps {

	public static String resource;
	
	LoginService loginService = new LoginService();
	
	//LOGIN
	@Given("^I set login API request header$")
	public void i_set_login_API_request_header() {	
	}

	@When("^I set login API request URI$")
	public void i_set_login_API_request_URI() {
		loginService.loginServiceURI();
	}

	@Then("^I set request body details$")
	public void i_set_request_body_details() {
		loginService.loginServiceRequestBody();
	}

	@When("^I send HTTP \"([^\"]*)\" request$")
	public void i_send_HTTP_request(String requestType) {
		loginService.executeLoginServiceRequest(requestType);
	}

	@Then("^I receive HTTP Response code as (\\d+)$")
	public void i_receive_HTTP_Response_code_as(int expectedStatusCode) {
		loginService.verifyResponse();
		//Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}

	
	//LOGOUT
	@Given("^I set userLogout API request header$")
	public void i_set_userLogout_API_request_header() {
		resource = APIUtility.getProperty("UserLogout.resource");
		SetServiceHeaderURI.setServiceHeader(resource);
	}

	@When("^I set userLogout API request URI$")
	public void i_set_userLogout_API_request_URI() {
		SetServiceHeaderURI.setServiceURI();
	}

	@When("^I send HTTP \"([^\"]*)\" request to logout$")
	public void i_send_HTTP_request_to_logout(String requestType) {
		SetServiceHeaderURI.executeServiceRequest(requestType);
	}

	@Then("^I receive success Logout Response code as (\\d+)$")
	public void i_receive_success_Logout_Response_code_as(int expectedStatusCode) {
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}
	
}
