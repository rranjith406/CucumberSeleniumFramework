package com.tmos.api.services;

import java.util.HashMap;
import com.tmos.api.utility.APIUtility;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

/**
 * 
 * @author Jyotirmoy Ganguly
 *
 */

public class DeleteMachineService 
{
	public RequestSpecification request;
	private String baseURL;
	private String resource;
	private String deleteMachineServiceURI;
	private String deleteRoleServiceURI;
	private HashMap<String, String> requestHeaderMap;
	
	
	public DeleteMachineService()
	{
		baseURL = APIUtility.getProperty("APIbaseURL");
		resource = APIUtility.getProperty("DeleteMachineAPI.resource");
		request = RestAssured.given();
	}
	
	public void addDeleteMachineServiceHeader()
	{
		requestHeaderMap = new HashMap<String, String>();
		requestHeaderMap.put("Authorization", "Basic YWRtaW46cUgwSVFkbG5EUExnM1BXcnU2dlA=");
		requestHeaderMap.put("Cookie", "JSESSIONID=" + APIUtility.getSessionIDFromUserLoginAPI());
		request.headers(requestHeaderMap);
	}
	
	public void createDeleteMachineServiceURI(String machineId)
	{
		request.pathParam("machineId", machineId);
		deleteMachineServiceURI = baseURL + resource + "/{machineId}";
	}
	
	public void executeDeleteMachineServiceRequest(String requestType)
	{
		APIUtility.executeAPIRequest(requestType, request, deleteMachineServiceURI);
	}
	
	public void createDeleteRoleServiceURI(String roleId)
	{
		request.pathParam("roleId", roleId);
		deleteRoleServiceURI = baseURL + resource + "/{roleId}";
	}
}
