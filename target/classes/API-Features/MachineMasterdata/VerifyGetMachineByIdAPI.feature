Feature: Fetch machine details and verify

@RegressionDemo
Scenario Outline: Verify Machine details fetched succesfully 
	Given I set get Machine by Id API request header
	When I set get Machine by Id API request URI with "<machineId>"
	When I send HTTP "GET" request for getting machine details 
	Then I receive HTTP Response code as 200 for getting Machine details successfully 
	Then I verify machine details like "<name>", "<shortName>", "<machineNumber>", "<latitude>", "<longitude>"
	
	Examples: 
		|machineId               |name               |shortName     |machineNumber|latitude  |longitude  |
	|60b9c65d3923fc6bbfafc132|JyoTestMachine6    |JyoTest6      |06      |12.0       |12.0       |