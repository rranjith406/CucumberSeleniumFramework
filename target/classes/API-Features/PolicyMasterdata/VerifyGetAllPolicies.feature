Feature: Verify get all policies API
@Smoke
Scenario: Verify that get all policies API details fetched successfully
	Given I set getAllPolicies API request header
	When I set getAllPolicies API request URI
	When I send HTTP "GET" request for getting getAllPolicies details
	Then I receive getAllPolicies Response code as 200
