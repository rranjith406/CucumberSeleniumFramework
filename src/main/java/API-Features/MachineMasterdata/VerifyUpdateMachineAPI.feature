Feature: Verify Update Machine API functionality 

@RegressionDemo
Scenario Outline: Verify Update Machine details successfully
	Given I set Update Machine details API request header
	When I set Update Machine API request URI with "<machineId>"
	When I set updated machine details with "<name>", "<shortName>", "<machineNumber>", "<latitude>", "<longitude>" 
	When I send HTTP "PUT" request for updating machine details 
	Then I receive HTTP Response code as 200 for updating Machine details successfully
	Then I verify response for successful machine updation
	
	Given I set get Machine by Id API request header
	When I set get Machine by Id API request URI with "<machineId>"
	When I send HTTP "GET" request for getting machine details 
	Then I receive HTTP Response code as 200 for getting Machine details successfully 
	Then I verify machine details like "<name>", "<shortName>", "<machineNumber>", "<latitude>", "<longitude>"
	
	Examples:
		|machineId               |name            |shortName  |machineNumber|latitude  |longitude  |
	|60b9c65d3923fc6bbfafc132|JyoTestMachine6    |JyoTest6      |06      |12.0       |12.0       |