package com.tmos.api.services;

import java.util.HashMap;

import com.tmos.api.utility.APIUtility;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class DeleteRoleByIdService {

	public RequestSpecification request;
	private String baseURL;
	private String resource;
	private String deleteRoleServiceURI;
	private HashMap<String, String> requestHeaderMap;
	
	
	public DeleteRoleByIdService()
	{
		baseURL = APIUtility.getProperty("APIbaseURL");
		resource = APIUtility.getProperty("DeleteRoleById.resource");
		request = RestAssured.given();
	}
	
	public void addDeleteRoleByIdServiceHeader()
	{
		requestHeaderMap = new HashMap<String, String>();
		requestHeaderMap.put("Authorization", "Basic YWRtaW46cUgwSVFkbG5EUExnM1BXcnU2dlA=");
		requestHeaderMap.put("Cookie", "JSESSIONID=" + APIUtility.getSessionIDFromUserLoginAPI());
		request.headers(requestHeaderMap);
	}
	
	public void createDeleteRoleByIdServiceURI(String roleId)
	{
		request.pathParam("roleId", roleId);
		deleteRoleServiceURI = baseURL + resource + "/{roleId}";
	}
	
	public void executeDeleteRoleByIdServiceRequest(String requestType)
	{
		APIUtility.executeAPIRequest(requestType, request, deleteRoleServiceURI);
	}
}
