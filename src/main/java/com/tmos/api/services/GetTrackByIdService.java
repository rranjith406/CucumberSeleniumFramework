package com.tmos.api.services;

import java.util.HashMap;

import com.tmos.api.requestpojo.TrackDetails;
import com.tmos.api.responsepojo.MachineDetails;
import com.tmos.api.utility.APIUtility;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class GetTrackByIdService {

	public RequestSpecification request;
	private String baseURL;
	private String resource;
	private String getTrackByIdServiceURI;
	private HashMap<String, String> requestHeaderMap;
	private TrackDetails trackDetails;
	
	
	public GetTrackByIdService()
	{
		baseURL = APIUtility.getProperty("APIbaseURL");
		resource = APIUtility.getProperty("GetTrackByIdAPI.resource");
		request = RestAssured.given();
	}
	
	public void addGetTrackByIdServiceHeader()
	{
		requestHeaderMap = new HashMap<String, String>();
		requestHeaderMap.put("Authorization", "Basic YWRtaW46cUgwSVFkbG5EUExnM1BXcnU2dlA=");
		requestHeaderMap.put("Cookie", "JSESSIONID=" + APIUtility.getSessionIDFromUserLoginAPI());
		request.headers(requestHeaderMap);
	}
	
	public void createGetTrackByIdServiceURI(String trackId)
	{
		request.pathParam("trackId", trackId);
		getTrackByIdServiceURI = baseURL + resource + "/{trackId}";
	}
	
	public void createGetTrackByIdServiceURI()
	{
		request.pathParam("trackId", APIUtility.getResponseValueFromJSON("payload"));
		getTrackByIdServiceURI = baseURL + resource + "/{trackId}";
	}
	
	public void executeGetTrackByIdServiceRequest(String requestType)
	{
		APIUtility.executeAPIRequest(requestType, request, getTrackByIdServiceURI);
	}
	
	public void getTrackDetailsFromResponse()
	{
		trackDetails = APIUtility.response.getBody().as(TrackDetails.class);
	}
	
	public String getTrackName()
	{
		return trackDetails.getName();
	}
	
	public String getShortName()
	{
		return trackDetails.getShortName();
	}
	
	public double getLine()
	{
		return trackDetails.getLine();
	}
	
	public double getTrack()
	{
		return trackDetails.getTrack();
	}
}
