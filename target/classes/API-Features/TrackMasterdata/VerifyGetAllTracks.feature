Feature: Verify get all tracks API
@Smoke
Scenario: Verify all track details fetched successfully
	Given I set getAllTracks API request header
	When I set getAllTracks API request URI
	When I send HTTP "GET" request for getting all tracks details
	Then I receive getAllTracks Response code as 200