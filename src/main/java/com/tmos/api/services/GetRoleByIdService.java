package com.tmos.api.services;

import java.util.HashMap;

import com.tmos.api.utility.APIUtility;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class GetRoleByIdService {

	public RequestSpecification request;
	private String baseURL;
	private String resource;
	private String GetRoleByIdServiceURI;
	private HashMap<String, String> requestHeaderMap;
	
	public GetRoleByIdService()
	{
		baseURL = APIUtility.getProperty("APIbaseURL");
		resource = APIUtility.getProperty("GetRoleById.resource");
		request = RestAssured.given();
	}
	
	public void getRoleByIdServiceHeader()
	{
		requestHeaderMap = new HashMap<String, String>();
		requestHeaderMap.put("Content-type", "application/json");
		requestHeaderMap.put("Authorization", "Basic YWRtaW46cUgwSVFkbG5EUExnM1BXcnU2dlA=");
		requestHeaderMap.put("Cookie", "JSESSIONID=" + APIUtility.getSessionIDFromUserLoginAPI());
		request.headers(requestHeaderMap);
	}
	
	public void getRoleByIdServiceURI()
	{
		GetRoleByIdServiceURI = baseURL + resource;
	}
	
	public void executeGetRoleByIdServiceRequest(String requestType)
	{
		APIUtility.executeAPIRequest(requestType, request, GetRoleByIdServiceURI);
	}
}
