Feature: Verify group hierarchy API
@Smoke
Scenario: Verify all group hierarchy is fetched successfully
	Given I set getGroupHierarchy API request header 
	When I set getGroupHierarchy API request URI
	When I send HTTP "GET" request for getting group details
	Then I receive getGroupHierarchy Response code as 200