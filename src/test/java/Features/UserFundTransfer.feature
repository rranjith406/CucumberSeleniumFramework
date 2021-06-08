 Feature: Fund transfer Functionality

   @Smoke
   Scenario Outline: After login user user should be able to do fund transfer
     When Navigate to Login Page and enter the following
       | username | password |
       | admin123@gmail.com    | Admin@123  |
     And  click on Login button
     Then I should navigate to Home Page
     When I click on link Transfer Link
     Then I should be able to see the link "Between Accounts"
#     When I click on link Between Accounts
     Then I should navigate to Transfer Between Account
     When I select the <From Account>, <To Account> and enter <Amount>
     And I click on submit button
     Then I should navigate to transaction check page

     Examples:
     |From Account|To Account |Amount |
     |  26381          | 26399          |    50  |
     |  26399          | 26381          |    80  |


