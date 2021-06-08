package com.tmos.api.services;

import java.util.HashMap;

import com.tmos.api.responsepojo.MachineDetails;
import com.tmos.api.utility.APIUtility;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

/**
 * 
 * @author Jyotirmoy Ganguly
 *
 */

public class GetMachineByIdService 
{
	public RequestSpecification request;
	private String baseURL;
	private String resource;
	private String getMachineByIdServiceURI;
	private HashMap<String, String> requestHeaderMap;
	private MachineDetails machineDetails;
	
	
	public GetMachineByIdService()
	{
		baseURL = APIUtility.getProperty("APIbaseURL");
		resource = APIUtility.getProperty("GetMachineByIdAPI.resource");
		request = RestAssured.given();
	}
	
	public void addGetMachineByIdServiceHeader()
	{
		requestHeaderMap = new HashMap<String, String>();
		requestHeaderMap.put("Authorization", "Basic YWRtaW46cUgwSVFkbG5EUExnM1BXcnU2dlA=");
		requestHeaderMap.put("Cookie", "JSESSIONID=" + APIUtility.getSessionIDFromUserLoginAPI());
		request.headers(requestHeaderMap);
	}
	
	public void createGetMachineByIdServiceURI(String machineId)
	{
		request.pathParam("machineId", machineId);
		getMachineByIdServiceURI = baseURL + resource + "/{machineId}";
	}
	
	public void createGetMachineByIdServiceURI()
	{
		request.pathParam("machineId", APIUtility.getResponseValueFromJSON("payload"));
		getMachineByIdServiceURI = baseURL + resource + "/{machineId}";
	}
	
	public void executeGetMachineByIdServiceRequest(String requestType)
	{
		APIUtility.executeAPIRequest(requestType, request, getMachineByIdServiceURI);
	}
	
	public void getMachineDetailsFromResponse()
	{
		machineDetails = APIUtility.response.getBody().as(MachineDetails.class);
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
	}
}
