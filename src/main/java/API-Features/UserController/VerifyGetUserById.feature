Feature: Fetch User details and verify

@Smoke
Scenario Outline: Verify User details fetched succesfully 
	Given I set getUserById API request header
	When I set getUserById API request URI with "<userId>"
	When I send HTTP "GET" request for getting getUserById details 
	Then I receive getUserById Response code as 200
	Then I verify user details like "<userId>", "<name>", "<login>", "<policyId>", "<policyName>"
	
	Examples: 
		|userId               		|name    |login   |policyId                   |policyName   |
		|5f8d71eb8031602096b87afc	|NewUser |NewUser |5f71c983a3533669e9a3e9a7   |APITesting   |