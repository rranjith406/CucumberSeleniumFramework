Feature: Verify application version API
@Smoke
Scenario: Verify that application version details fetched successfully
	Given I set getVersion API request header
	When I set getVersion API request URI
	When I send HTTP "GET" request for getting version details
	Then I receive version Response code as 200
