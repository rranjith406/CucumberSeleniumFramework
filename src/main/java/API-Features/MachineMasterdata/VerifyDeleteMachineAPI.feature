Feature: Verify Machine deletion API 

@RegressionDemo
Scenario Outline: Verify Machine deletion 
	Given I set delete machine API request header 
	When I set delete machine API request URI with "<machineId>" 
	When I send HTTP "DELETE" request for deleting machine details 
	Then I receive HTTP Response code as 200 for machine deletion successfully 
	Then I verify response for successful machine deletion
	
	Examples: 
	|machineId               |
	|60bb905fccb0a42849c82a08|
	