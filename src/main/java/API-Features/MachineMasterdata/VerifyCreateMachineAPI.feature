Feature: Verify Creation and fetching Machine details
@RegressionDemo
Scenario Outline: Verify Creation and fetching Machine details
	Given I set Machine creation API request header 
	When I set Machine creation API request URI 
	Then I set machine details like "<name>", "<shortName>", "<machineNumber>", "<latitude>", "<longitude>" 
	When I send HTTP "POST" request for Machine creation 
	Then I receive HTTP Response code as 200 for Machine creation 
	Then I verify response for successful machine creation
	
	Given I set get Machine by Id API request header
	When I set get Machine by Id API request URI
	When I send HTTP "GET" request for getting machine details 
	Then I receive HTTP Response code as 200 for getting Machine details successfully 
	Then I verify machine details like "<name>", "<shortName>", "<machineNumber>", "<latitude>", "<longitude>"
	
	
	Examples: 
		|name           |shortName |machineNumber |latitude  |longitude  |
		|JyoTestMachine6|JyoTest6  |77        |1.0      |1.0       |
		
	
		