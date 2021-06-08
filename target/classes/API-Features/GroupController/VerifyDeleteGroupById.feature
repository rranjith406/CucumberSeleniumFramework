Feature: Verify Group deletion API 

@Smoke
Scenario Outline: Verify Group deletion 
	Given I set delete GroupById API request header 
	When I set delete GroupById API request URI with "<groupId>" 
	When I send HTTP "DELETE" request for deleting group details 
	Then I receive HTTP Response code as 200 for group deletion successful 
	Then I verify response for successful group deletion
	
	Examples: 
	|groupId                 |
	|607b04768efec35477fb1a77|
	