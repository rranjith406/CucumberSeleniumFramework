Feature: Verify get all machines API
@Smoke
Scenario: Verify that all machine details fetched successfully
	Given I set getAllMachines API request header
	When I set getAllMachines API request URI
	When I send HTTP "GET" request for getting getAllMachines details
	Then I receive getAllMachines Response code as 200
