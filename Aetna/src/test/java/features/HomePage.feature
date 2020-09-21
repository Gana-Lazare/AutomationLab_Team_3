Feature: Aetna Homepage Functionality Check
  Background:
    Given I am in Aetna Homepage
    Then  I click on Expplore Aetna Site

  Scenario: Aetna HomePage Check
    And I verify the page title
    Then I click on For Agents Brokers

  Scenario:
     Then  I click on search button
     And  I enter search text "provider" and submit
     Then I verify the page title

