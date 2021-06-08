package com.tmos.api.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//import org.apache.log4j.Logger;

import com.tmos.api.utility.APIUtility;



public class APISetupTeardown {
	//Logger log = LoggerHelper.getLogger(APISetupTeardown.class);

	@Before
	public void setUp(Scenario scenarios) throws Exception 
	{
		//Extent Report Setup
		
		//Loading property file
		APIUtility.loadPropertyFile();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			try {

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
