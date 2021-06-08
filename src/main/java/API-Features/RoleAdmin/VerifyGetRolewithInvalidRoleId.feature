Feature: Verify GetRole API with Invalid RoleId

@Smoke
Scenario Outline: Verify role API for invalidRoleId
	Given I set get role by Id API request header
	When I set get role by Id API request URI with "<roleId>"
	When I send HTTP "GET" request for getting rolebyId details 
	Then I receive HTTP Response code as 404 for invalid roleId

Examples:
| roleId 										|
| 5fbfab7a2497a32e11140fe4	|