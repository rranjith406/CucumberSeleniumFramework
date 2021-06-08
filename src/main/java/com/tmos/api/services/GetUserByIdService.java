package com.tmos.api.services;

import java.util.HashMap;

import com.tmos.api.responsepojo.MachineDetails;
import com.tmos.api.utility.APIUtility;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class GetUserByIdService {

	public RequestSpecification request;
	private String baseURL;
	private String resource;
	private String getUserByIdServiceURI;
	private HashMap<String, String> requestHeaderMap;
	private MachineDetails machineDetails;
	
	
	public GetUserByIdService()
	{
		baseURL = APIUtility.getProperty("APIbaseURL");
		resource = APIUtility.getProperty("GetUserById.resource");
		request = RestAssured.given();
	}
	
	public void addGetUserByIdServiceHeader()
	{
		requestHeaderMap = new HashMap<String, String>();
		requestHeaderMap.put("Authorization", "Basic YWRtaW46cUgwSVFkbG5EUExnM1BXcnU2dlA=");
		requestHeaderMap.put("Cookie", "JSESSIONID=" + APIUtility.getSessionIDFromUserLoginAPI());
		request.headers(requestHeaderMap);
	}
	
	public void createGetUserByIdServiceURI(String userId)
	{
		request.pathParam("userId", userId);
		getUserByIdServiceURI = baseURL + resource + "/{userId}";
	}
	
	/*public void createGetUserByIdServiceURI()
	{
		request.pathParam("machineId", APIUtility.getResponseValueFromJSON("payload"));
		getUserByIdServiceURI = baseURL + resource + "/{userId}";
	}
	*/
	public void executeGetUserByIdServiceRequest(String requestType)
	{
		APIUtility.executeAPIRequest(requestType, request, getUserByIdServiceURI);
	}
	
/*	public void getUserDetailsFromResponse()
	{
		userDetails = APIUtility.response.getBody().as(MachineDetails.class);
	}
	
	public String getMachineName()
	{
		return machineDetails.getName();
	}
	
	public String getShortName()
	{
		return machineDetails.getShortName();
	}
	
	public String getMachineNumber()
	{
		return machineDetails.getMachineNumber();
	}
	
	public double getLatitude()
	{
		return machineDetails.getLatitude();
	}
	
	public double getLongitude()
	{
		return machineDetails.getLongitude();
	}*/
}
