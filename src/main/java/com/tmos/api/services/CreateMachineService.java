package com.tmos.api.services;

import java.util.HashMap;

import com.tmos.api.requestpojo.MachineDetails;
import com.tmos.api.requestpojo.UserGroup;
import com.tmos.api.utility.APIUtility;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

/**
 * 
 * @author
 *
 */

public class CreateMachineService 
{
	public RequestSpecification request;
	private String baseURL;
	private String resource;
	private String CreateMachineServiceURI;
	private HashMap<String, String> requestHeaderMap;
	private MachineDetails machineDetails;
	private UserGroup userGroup;
	
	public CreateMachineService()
	{
		baseURL = APIUtility.getProperty("APIbaseURL");
		resource = APIUtility.getProperty("CreateMachineAPI.resource");
		request = RestAssured.given();
		machineDetails = new MachineDetails();
		userGroup = new UserGroup();
	}
	
	public void addCreateMachineServiceHeader()
	{
		requestHeaderMap = new HashMap<String, String>();
		requestHeaderMap.put("Content-type", "application/json");
		requestHeaderMap.put("Authorization", "Basic YWRtaW46cUgwSVFkbG5EUExnM1BXcnU2dlA=");
		requestHeaderMap.put("Cookie", "JSESSIONID=" + APIUtility.getSessionIDFromUserLoginAPI());
		request.headers(requestHeaderMap);
	}
	
	public void createMachineServiceURI()
	{
		CreateMachineServiceURI = baseURL + resource;
	}
	
	public void createMachineServiceRequestBody(String name, String shortName, String machineNumber, String latitude, String longitude)
	{
		machineDetails.setName(name);
		machineDetails.setShortName(shortName);
		machineDetails.setMachineNumber(machineNumber);
		machineDetails.setImage(null);
		machineDetails.setLatitude(Double.parseDouble(latitude));
		machineDetails.setLongitude(Double.parseDouble(longitude));
		machineDetails.setStrId(null);
		machineDetails.setArtificialData(false);
		userGroup.set_id("123456789012345678901234");
		userGroup.setName("ROOT");
		userGroup.setRoot(false);
		machineDetails.setUserGroup(userGroup);
		request.body(machineDetails);
	}
	
	public void executeCreateMachineServiceRequest(String requestType)
	{
		APIUtility.executeAPIRequest(requestType, request, CreateMachineServiceURI);
	}
}
