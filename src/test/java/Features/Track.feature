Feature: Creation of Track in Masterdata

  @Smoke @Regression
  Scenario Outline: Creating the Track with mandatory data
    Given Navigate to TMOS Login Page
    When validate "Home" heading the landing page
    Then  click on "Master Data" Section
    Then  click on "Tracks" section in master data
    Then  click on "Create new track" button
    Then verified the "Edit Track" header
    Then entering "Line" and "track"
    Then Entered all required fields "<Name>","<shortName>"
    Then selected the "ResourceGroup"
    And clicked on "Save" button
    Then verify the "Success" message after track creation

    Examples:
      |Name|shortName|
      |    Track_auto|    Auto Track     |

