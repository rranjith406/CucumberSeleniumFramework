package com.tmos.api.services;

import java.util.HashMap;

import com.tmos.api.requestpojo.MachineDetails;
import com.tmos.api.requestpojo.TrackDetails;
import com.tmos.api.requestpojo.UserGroup;
import com.tmos.api.utility.APIUtility;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

/**
 * 
 * @author Jyotirmoy Ganguly
 *
 */

public class UpdateTrackDetailsService {

	public RequestSpecification request;
	private String baseURL;
	private String resource;
	private String UpdateTrackServiceURI;
	private HashMap<String, String> requestHeaderMap;
	private TrackDetails trackDetails;
	private UserGroup userGroup;
	
	
	public UpdateTrackDetailsService()
	{
		baseURL = APIUtility.getProperty("APIbaseURL");
		resource = APIUtility.getProperty("UpdateTrackAPI.resource");
		request = RestAssured.given();
		trackDetails = new TrackDetails();
		userGroup = new UserGroup();
	}
	
	public void addUpdateTrackServiceHeader()
	{
		requestHeaderMap = new HashMap<String, String>();
		requestHeaderMap.put("Content-type", "application/json");
		requestHeaderMap.put("Authorization", "Basic YWRtaW46cUgwSVFkbG5EUExnM1BXcnU2dlA=");
		requestHeaderMap.put("Cookie", "JSESSIONID=" + APIUtility.getSessionIDFromUserLoginAPI());
		request.headers(requestHeaderMap);
	}
	
	public void updateTrackServiceURI(String trackId)
	{
		request.pathParam("trackId", trackId);
		UpdateTrackServiceURI = baseURL + resource + "/{trackId}";
	}
	
	public void updateTrackServiceRequestBody(String name, String shortName, double line, double track)
	{
		trackDetails.setName(name);
		trackDetails.setShortName(shortName);
		trackDetails.setLine(line);
		trackDetails.setTrack(track);
		userGroup.set_id("123456789012345678901234");
		userGroup.setName("ROOT");
		userGroup.setRoot(false);
		trackDetails.setUserGroup(userGroup);
		request.body(trackDetails);
	}
	
	public void executeUpdateTrackServiceRequest(String requestType)
	{
		APIUtility.executeAPIRequest(requestType, request, UpdateTrackServiceURI);
	}
}
