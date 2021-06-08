package com.tmos.api.steps;

import com.tmos.api.utility.APIUtility;
import com.tmos.api.utility.SetServiceHeaderURI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GetGroupHierarchyWithoutUserInfoAPISteps {

	public static String resource;
	@Given("^I set GroupHierarchyWithoutUserInfo API request header$")
	public void i_set_GroupHierarchyWithoutUserInfo_API_request_header() {
		resource = APIUtility.getProperty("GetGroupHierarchyWithoutUserInfo.resource");
		SetServiceHeaderURI.setServiceHeader(resource);
	}

	@When("^I set GroupHierarchyWithoutUserInfo API request URI$")
	public void i_set_GroupHierarchyWithoutUserInfo_API_request_URI() {
		SetServiceHeaderURI.setServiceURI();
	}

	@When("^I send HTTP \"([^\"]*)\" request for getting groupHierarchy without user info details$")
	public void i_send_HTTP_request_for_getting_groupHierarchy_without_user_info_details(String requestType) {
		SetServiceHeaderURI.executeServiceRequest(requestType);
	}

	@Then("^I receive GroupHierarchyWithoutUserInfo Response code as (\\d+)$")
	public void i_receive_GroupHierarchyWithoutUserInfo_Response_code_as(int expectedStatusCode) {
		Assert.assertEquals(APIUtility.getStatusCode(), expectedStatusCode);
	}

}
