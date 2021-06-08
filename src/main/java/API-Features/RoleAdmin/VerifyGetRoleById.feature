Feature: Fetch role details and verify

@Smoke
Scenario Outline: Verify role details fetched succesfully 
	Given I set get role by Id API request header
	When I set get role by Id API request URI with "<roleId>"
	When I send HTTP "GET" request for getting rolebyId details 
	Then I receive HTTP Response code as 200 for getting role details successfully 
#	Then I verify policy details like "<name>", "<shortName>", "<machineNumber>", "<latitude>", "<longitude>"
	
#	Examples: 
#		|machineId               |name               |shortName     |machineNumber|latitude  |longitude  |
#		|6009747f32b1a867cf33cfbc|JyoTestMachine6    |JyoTest6      |66      |1.0       |1.0       |

Examples:
| roleId 										|
| 600555f177b00710eace0dac	|