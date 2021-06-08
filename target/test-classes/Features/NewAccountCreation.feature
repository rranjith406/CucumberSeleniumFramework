Feature: Creation of New Account Functionality

  @Smoke
  Scenario: After login user should be able to create a new Account.
    When Navigate to Login Page and enter the following
      | username           | password  |
      | admin123@gmail.com | Admin@123 |
    And  click on Login button
    Then I should navigate to Home Page
    When expand checking under Banking Accounts
    And  click on new Checking
    And should be able to create a new Account with following details
      | accountType       | accountOwner | accountName | Deposit |
      | Interest Checking | Joint        | Admin       | 23000   |


