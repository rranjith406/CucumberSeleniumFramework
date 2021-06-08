Feature: Verify Policy deletion API 

@Smoke
Scenario Outline: Verify Policy deletion 
	Given I set delete PolicyById API request header 
	When I set delete PolicyById API request URI with "<policyId>" 
	When I send HTTP "DELETE" request for deleting policy details 
	Then I receive HTTP Response code as 200 for policy deletion successful 
	Then I verify response for successful policy deletion
	
	Examples: 
	|policyId                |
	|607b06c98efec35477fb1a79|
	