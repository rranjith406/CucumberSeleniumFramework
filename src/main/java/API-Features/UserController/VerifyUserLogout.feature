Feature: Verify logout API functionality
@Smoke
Scenario: Verify user is logged out successfully
	Given I set userLogout API request header 
	When I set userLogout API request URI
	When I send HTTP "POST" request to logout
	Then I receive success Logout Response code as 200