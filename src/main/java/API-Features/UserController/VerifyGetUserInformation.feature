Feature: Verify get user information API
@Smoke
Scenario: Verify logged-in user information is fetched successfully
	Given I set getUserInfo API request header 
	When I set getUserInfo API request URI
	When I send HTTP "GET" request for getting user details
	Then I receive getUserInfo Response code as 200