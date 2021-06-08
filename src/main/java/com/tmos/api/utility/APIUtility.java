package com.tmos.api.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * 
 * @author Jyotirmoy Ganguly
 *
 */

public class APIUtility 
{
	private static FileInputStream fileInputStream;
	private static Properties properties;
	private static final String apiPropertyFilePath = "src/main/java/API-Resources/APIDetails.properties";
	public static Response response;
	
	
	public static void loadPropertyFile()
	{
		try
		{
			fileInputStream = new FileInputStream(new File(apiPropertyFilePath));
			properties = new Properties();
			properties.load(fileInputStream);
		}
		catch(IOException e)
		{
			throw new RuntimeException(e.getMessage());
		}
		catch(Exception e)
		{
			throw new RuntimeException("Unable to load property file " + e.getMessage());
		}
	}
	
	public static String getProperty(String property)
	{
		try
		{
			return properties.getProperty(property);
		}
		catch(Exception e)
		{
			throw new RuntimeException("Given Property not found " + e.getMessage());
		}
	}
	
	public static void executeAPIRequest(String requestType, RequestSpecification request, String requestEndPoint)
	{
		try
		{
			if(request != null && requestEndPoint != null)
			{
				switch(requestType)
				{
					case "GET":
						request.log().all();
						response = request.get(requestEndPoint);
						break;
					case "POST":
						request.log().all();
						response = request.post(requestEndPoint);	
						break;
					case "PUT":
						request.log().all();
						response = request.put(requestEndPoint);
						break;
					case "DELETE":
						request.log().all();
						response = request.delete(requestEndPoint);
						break;
				}
			}
			System.out.println("Response Body : " + response.getBody().asString());
			
			
		}
		catch(Exception e)
		{
			throw new RuntimeException("API Request Failure" + e.getMessage());
		}
	}
	
	public static int getStatusCode()
	{
		 if (response != null) 
		 {
			 System.out.println("Status code : " + response.getStatusCode());
			 return response.getStatusCode();
		 } 
		 else 
			 throw new RuntimeException("API Response Failure");
	}
	
	public static String getResponseValueFromJSON(String key)
	{
		String responseValue = null;
		try
		{
			String responseString = response.getBody().asString();
			JsonPath jsonpath = new JsonPath(responseString);
			if(jsonpath.get(key) instanceof String)
			{
				responseValue = jsonpath.get(key);
			}
			else if(jsonpath.get(key) instanceof Integer)
			{
				responseValue = String.valueOf(jsonpath.get(key));
			}
			else if(jsonpath.get(key) instanceof Boolean)
			{
				responseValue = Boolean.toString(jsonpath.get(key));
			}
		}
		catch(Exception e)
		{
			 throw new RuntimeException("Unable to get value for given key as " + key + e.getMessage());
		}
		return responseValue;
	}
	
	public static String getSessionIDFromUserLoginAPI()
	{
		try
		{
			String userName = getProperty("UserLoginAPI.username");
			String password = getProperty("UserLoginAPI.password");
			String region = getProperty("UserLoginAPI.region");
			RequestSpecification request = RestAssured.given();
			request.header("Content-type","application/json");
			request.body("{\"password\": \"" + password + "\",\"region\": \"" + region + "\",\"username\": \"" + userName + "\"}");
			String userLoginAPIURI = getProperty("APIbaseURL") + getProperty("UserLogInAPI.resorce");
			Response response = request.post(userLoginAPIURI);
			String sessionID = response.getCookies().get("JSESSIONID");
			System.out.println("Status code " + response.statusCode());
			return sessionID;
		}
		catch(Exception e)
		{
			throw new RuntimeException("User Login Failed " + e.getMessage());
		}
	}
}
