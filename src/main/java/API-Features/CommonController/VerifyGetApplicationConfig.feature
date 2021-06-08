Feature: Verify get application config API
@Smoke
Scenario: Verify that get application config details fetched successfully
	Given I set getApplicationConfig API request header
	When I set getApplicationConfig API request URI
	When I send HTTP "GET" request for getting getApplicationConfig details
	Then I receive getApplicationConfig Response code as 200
