package com.tmos.api.services;

import java.util.HashMap;

import com.tmos.api.responsepojo.MachineDetails;
import com.tmos.api.utility.APIUtility;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class GetPolicyByIdService {

	public RequestSpecification request;
	private String baseURL;
	private String resource;
	private String getPolicyByIdServiceURI;
	private HashMap<String, String> requestHeaderMap;
	
	public GetPolicyByIdService()
	{
		baseURL = APIUtility.getProperty("APIbaseURL");
		resource = APIUtility.getProperty("GetPolicyById.resource");
		request = RestAssured.given();
	}
	
	public void addGetPolicyByIdServiceHeader()
	{
		requestHeaderMap = new HashMap<String, String>();
		requestHeaderMap.put("Authorization", "Basic YWRtaW46cUgwSVFkbG5EUExnM1BXcnU2dlA=");
		requestHeaderMap.put("Cookie", "JSESSIONID=" + APIUtility.getSessionIDFromUserLoginAPI());
		request.headers(requestHeaderMap);
	}
	
	public void createGetPolicyByIdServiceURI(String policyId)
	{
		request.pathParam("policyId", policyId);
		getPolicyByIdServiceURI = baseURL + resource + "/{policyId}";
	}
	
	public void createGetMachineByIdServiceURI()
	{
		request.pathParam("policyId", APIUtility.getResponseValueFromJSON("payload"));
		getPolicyByIdServiceURI = baseURL + resource + "/{policyId}";
	}
	
	public void executeGetPolicyByIdServiceRequest(String requestType)
	{
		APIUtility.executeAPIRequest(requestType, request, getPolicyByIdServiceURI);
	}
	
	public void getPolicyDetailsFromResponse()
	{
		//policyDetails = APIUtility.response.getBody().as(MachineDetails.class);
	}
	
}
