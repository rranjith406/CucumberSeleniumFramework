Feature: Verify get selected application styling API
@Smoke
Scenario: Verify that get selected application styling details fetched successfully
	Given I set getSelectedApplicationStyling API request header
	When I set getSelectedApplicationStyling API request URI
	When I send HTTP "GET" request for getting getSelectedApplicationStyling details
	Then I receive getSelectedApplicationStyling Response code as 200