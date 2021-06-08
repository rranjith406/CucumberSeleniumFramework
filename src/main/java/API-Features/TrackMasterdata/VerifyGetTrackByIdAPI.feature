Feature: Fetch track details and verify

  @Smoke
  Scenario Outline: Verify Track details fetched succesfully
    Given I set get Track by Id API request header
    When I set get Track by Id API request URI with "<trackId>"
    When I send HTTP "GET" request for getting track details
    Then I receive HTTP Response code as 200 for getting Track details successfully
    Then I verify track details like "<line>", "<track>", "<name>", "<shortName>"

    Examples: 
   |  trackId 								 | line | track | name      | shortName |
   |000000000000027a00010001   |   1 |    1 	| APITest 		| APITest  |
