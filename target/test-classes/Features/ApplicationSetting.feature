Feature: Updating the Title in Application setting page

  @Smoke @Regression
  Scenario: Application Title updation
    When i Navigate to Login Page and enter the following
    Then I should navigate to Home Page
    When i click on Administration
    Then click on Application Settings
    And update the Title "Automation_Tmos" and new title "tmOS-QA"

