Feature: Login and Logout Functionality

  @Smoke @Regression
  Scenario: Login with correct username and password
    When i Navigate to Login Page and enter the following
  
    
    Then I should navigate to Home Page
    And I click admin dropdown
    And click on Logout
    Then I should navigate to Login page

  Scenario: Login with invalid username and password
    When I Navigate to Login Page and enter the incorrect credentials
    Then I should get error message
