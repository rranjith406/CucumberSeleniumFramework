Feature: Verify Role deletion API 

@Smoke
Scenario Outline: Verify Role deletion 
	Given I set delete RoleRoleById API request header 
	When I set delete RoleRoleById API request URI with "<roleId>" 
	When I send HTTP "DELETE" request for deleting role details 
	Then I receive HTTP Response code as 200 for role deletion successful 
	Then I verify response for successful role deletion
	
	Examples: 
	|roleId               |
	|5fbfab7a2497a32e11140fe4|
	