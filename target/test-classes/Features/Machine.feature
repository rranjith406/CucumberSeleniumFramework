Feature: Creation of Machine in Masterdata

  @Smoke @Regression
  Scenario Outline: Creating the machine with mandatory data
    Given I navigate to TMOS Login Page
    When I validate "Home" heading the landing page
    Then  I click on "Master Data" Section
    Then  I click on "Machine" section in master data
    Then I click on "Create new machine" button
    Then I verified the "Edit machine" header
    Then  I Entered all required fields "<Name>","<shortName>","<MachineNumber>","<Latitude>","<Lontitude>"
    Then select the "ResourceGroup"
    And click on "Save" button

    Examples:
    |Name|shortName|MachineNumber|Latitude|Lontitude|
    |    Automation_machine|    Auto machine     |1234              |   12     |      12   |




