Feature: Verify get all application styles API
@Smoke
Scenario: Verify get all application styles fetched successfully
	Given I set getAllApplicationStyling API request header
	When I set getAllApplicationStyling API request URI
	When I send HTTP "POST" request for getting AllApplicationStyling details
	Then I receive getAllApplicationStyling Response code as 200
