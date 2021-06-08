Feature: Verify Track deletion API 

@Smoke
Scenario Outline: Verify Track deletion 
	Given I set delete track API request header 
	When I set delete track API request URI with "<trackId>" 
	When I send HTTP "DELETE" request for deleting track details 
	Then I receive HTTP Response code as 200 for track deletion successfully 
	Then I verify response for successful track deletion
	
	Examples: 
	|trackId               |
	|000000000000018500de00de|