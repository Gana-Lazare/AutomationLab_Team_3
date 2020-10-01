Feature: check foxNews home page functionality
  Background:
  Given I am in fox news home page


    Scenario: check business button
      Then I click on business button
      And I verify the business page title

      Scenario: Check personal Finance button
        Then I click on personal Finance button
        And I verify the personal Finance page title

  Scenario: Check morning With Maria button
    Then I click on morning With Maria button
    And I verify the morning With Maria page title

  Scenario: Check soccer button
    Then I click on soccer button
    And I verify the soccer page title

  Scenario: Check election Button button
    Then I click on election Button button
    And I verify the election Button page title

  Scenario: Check economy button button
    Then I click on economy button button
    And I verify the economy button page title


