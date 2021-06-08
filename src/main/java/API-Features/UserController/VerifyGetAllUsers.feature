Feature: Verify get all users information API
@Smoke
Scenario: Verify all user information fetched successfully
	Given I set getAllUsers API request header 
	When I set getAllUsers API request URI
	When I send HTTP "GET" request for getting AllUsers details
	Then I receive getAllUsers Response code as 200