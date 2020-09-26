Feature: Check jetBlue home page functionality
         Check jetBlue button

  Background:
    Given I am in jetBlue home page


  Scenario: Check jetBlue home page
    Then  I click on TrueBlue button
    And T verify the TrueBlue page title


  Scenario: check Earning Points button
      Then I click on Earning Points button
      And I verify the Earning Points page title

  Scenario: check Flights Hotel button
    Then I click on Flight Hotel button
    And I verify the Flights Hotel page title



  Scenario: Check Reason to join  button
    Then  I click on Reason to join button
    And T verify the Reason to join page title


  Scenario: check Using Points button
    Then I click on Using Points button
    And I verify the Using Points page title

  Scenario: check join today button
    Then I click on join today button
    And I verify the join today page title