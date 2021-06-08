Feature: Verify get all Role API
@Smoke
Scenario: Verify all Roles fetched successfully
	Given I set getAllRole API request header 
	When I set getAllRole API request URI
	When I send HTTP "GET" request for getting role details
	Then I receive getAllRole Response code as 200