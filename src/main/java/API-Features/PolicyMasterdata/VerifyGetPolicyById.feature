Feature: Fetch policy details and verify

@Smoke
Scenario Outline: Verify Policy details fetched succesfully 
	Given I set get policy by Id API request header
	When I set get policy by Id API request URI with "<policyId>"
	When I send HTTP "GET" request for getting policy details 
	Then I receive HTTP Response code as 200 for getting policy details successfully 
#	Then I verify policy details like "<name>", "<shortName>", "<machineNumber>", "<latitude>", "<longitude>"
	
#	Examples: 
#		|machineId               |name               |shortName     |machineNumber|latitude  |longitude  |
#		|6009747f32b1a867cf33cfbc|JyoTestMachine6    |JyoTest6      |66      |1.0       |1.0       |

Examples:
| policyId 									|
| 5f70a4dacf0920520c500ba6	|