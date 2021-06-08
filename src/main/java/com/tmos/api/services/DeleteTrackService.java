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

public class DeleteTrackService {

	public RequestSpecification request;
	private String baseURL;
	private String resource;
	private String deleteTrackServiceURI;
	private HashMap<String, String> requestHeaderMap;
	
	
	public DeleteTrackService()
	{
		baseURL = APIUtility.getProperty("APIbaseURL");
		resource = APIUtility.getProperty("DeleteTrackAPI.resource");
		request = RestAssured.given();
	}
	
	public void addDeleteTrackServiceHeader()
	{
		requestHeaderMap = new HashMap<String, String>();
		requestHeaderMap.put("Authorization", "Basic YWRtaW46cUgwSVFkbG5EUExnM1BXcnU2dlA=");
		requestHeaderMap.put("Cookie", "JSESSIONID=" + APIUtility.getSessionIDFromUserLoginAPI());
		request.headers(requestHeaderMap);
	}
	
	public void createDeleteTrackServiceURI(String trackId)
	{
		request.pathParam("trackId", trackId);
		deleteTrackServiceURI = baseURL + resource + "/{trackId}";
	}
	
	public void executeDeleteTrackServiceRequest(String requestType)
	{
		APIUtility.executeAPIRequest(requestType, request, deleteTrackServiceURI);
	}
}
