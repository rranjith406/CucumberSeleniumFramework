package com.tmos.api.services;

import java.util.Properties;
import com.tmos.api.utility.APIUtility;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class LoginService {

	public RequestSpecification request;
	private String baseURL;
	private String resource;
	private String loginServiceURI;
	private static Properties properties;
	
	public LoginService()
	{
		baseURL = APIUtility.getProperty("APIbaseURL");
		resource = APIUtility.getProperty("UserLogInAPI.resorce");
		request = RestAssured.given();	
	}
	
	public void loginServiceURI()
	{
		loginServiceURI = baseURL + resource;
	}
	
	public void loginServiceRequestBody()
	{
		String userName = APIUtility.getProperty("UserLoginAPI.username");
		String password = APIUtility.getProperty("UserLoginAPI.password");
		String region = APIUtility.getProperty("UserLoginAPI.region");
		RequestSpecification request = RestAssured.given();
		request.header("Content-type","application/json");
		request.body("{\"password\": \"" + password + "\",\"region\": \"" + region + "\",\"username\": \"" + userName + "\"}");
	}
	
	public void executeLoginServiceRequest(String requestType)
	{
		APIUtility.executeAPIRequest(requestType, request, loginServiceURI);
	}
	
	public void verifyResponse() 
	{
		Response response = request.post(loginServiceURI);
		String sessionID = response.getCookies().get("JSESSIONID");
		System.out.println("Status code " + response.statusCode());
	}
}
