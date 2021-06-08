Feature: Verify get all available permissions API
@Smoke
Scenario: Verify all available permissions fetched successfully
	Given I set getAllAvailablePermissionInfo API request header 
	When I set getAllAvailablePermissionInfo API request URI
	When I send HTTP "GET" request for getting permissions details
	Then I receive getAllAvailablePermissionInfo Response code as 200