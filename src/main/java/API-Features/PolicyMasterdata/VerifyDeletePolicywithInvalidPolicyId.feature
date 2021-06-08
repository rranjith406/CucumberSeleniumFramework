Feature: Verify Policy deletion API with invalid(non-existing) policyId

@Smoke
Scenario Outline: Verify Policy deletion with non-existing policyId 
	Given I set delete PolicyById API request header 
	When I set delete PolicyById API request URI with "<policyId>" 
	When I send HTTP "DELETE" request for deleting policy details 
	Then I receive HTTP Response code as 510 for Invalid policyId deletion 
	Then I verify response for policy deletion
	
	Examples: 
	|policyId                |
	|607b06c98efec35477fb1a79|
	