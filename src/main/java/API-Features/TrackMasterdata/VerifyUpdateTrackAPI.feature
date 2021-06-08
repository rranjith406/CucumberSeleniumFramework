Feature: Verify Update Track API functionality 

@Smoke
Scenario Outline: Verify Update Track details successfully
	Given I set Update track details API request header
	When I set Update track API request URI with "<trackId>"
	When I set updated track details with "<name>", "<shortName>", "<line>", "<track>" 
	When I send HTTP "PUT" request for updating track details 
	Then I receive HTTP Response code as 200 for updating track details successfully
	Then I verify response for successful track updation
	
#	Given I set get Machine by Id API request header
#	When I set get Machine by Id API request URI with "<machineId>"
#	When I send HTTP "GET" request for getting machine details 
#	Then I receive HTTP Response code as 200 for getting Machine details successfully 
#	Then I verify machine details like "<name>", "<shortName>", "<machineNumber>", "<latitude>", "<longitude>"
	
	Examples:
		|trackId               |name    |shortName 	|line		|track  |
	|000000000000018500160016|Demo    |Demo      	|21     |21     |