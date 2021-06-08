Feature: Verify get all groups API
@Smoke
Scenario: Verify all groups fetched successfully
	Given I set getAllGroups API request header 
	When I set getAllGroups API request URI
	When I send HTTP "GET" request for getting groups details
	Then I receive getAllGroups Response code as 200