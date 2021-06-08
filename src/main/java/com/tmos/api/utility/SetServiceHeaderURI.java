package com.tmos.api.utility;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class SetServiceHeaderURI {

	public static RequestSpecification request;
	private static String baseURL;
	public static String resourceReceived;
	private static String GetServiceURI;
	private static String ParamServiceURI;
	private static HashMap<String, String> requestHeaderMap;
	
	public static void setServiceHeader(String resource)
	{
		baseURL = APIUtility.getProperty("APIbaseURL");
		resourceReceived = resource;
		request = RestAssured.given();
		requestHeaderMap = new HashMap<String, String>();
		requestHeaderMap.put("Content-type", "application/json");
		requestHeaderMap.put("Authorization", "Basic YWRtaW46cUgwSVFkbG5EUExnM1BXcnU2dlA=");
		requestHeaderMap.put("Cookie", "JSESSIONID=" + APIUtility.getSessionIDFromUserLoginAPI());
		request.headers(requestHeaderMap);
	}
	
	public static void setServiceURI()
	{
		GetServiceURI = baseURL + resourceReceived;
	}
	
	public static void executeServiceRequest(String requestType)
	{
		APIUtility.executeAPIRequest(requestType, request, GetServiceURI);
	}
	
	public static void createByIdServiceURI(String paramId)
	{
		request.pathParam("paramId", paramId);
		ParamServiceURI = baseURL + resourceReceived + "/{paramId}";
	}
	
	public static void executeServiceRequestwithParam(String requestType)
	{
		APIUtility.executeAPIRequest(requestType, request, ParamServiceURI);
	}
	
}
