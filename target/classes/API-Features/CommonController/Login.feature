Feature: Verify user Login API
@Smoke
Scenario: Verify user Login is successful
	#Given I set login API request header 
	When I set login API request URI
	Then I set request body details
	When I send HTTP "POST" request
	Then I receive HTTP Response code as 200