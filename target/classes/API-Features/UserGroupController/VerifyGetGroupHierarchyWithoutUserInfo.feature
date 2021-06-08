Feature: Verify get groups hierarchy API
@Smoke
Scenario: Verify groups hierarchy without user info details fetched successfully
	Given I set GroupHierarchyWithoutUserInfo API request header 
	When I set GroupHierarchyWithoutUserInfo API request URI
	When I send HTTP "GET" request for getting groupHierarchy without user info details
	Then I receive GroupHierarchyWithoutUserInfo Response code as 200