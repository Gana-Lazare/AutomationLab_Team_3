Feature: FoxNews Login functionality check

  Background:
    Given I am in foxNews homepage
    Then I click on login Button


  Scenario: FoxNews Login functionality check with valid data
    And I enter a valid username
    And I enter a valid password
    When I click login Button
    Then I verify if My Account appear properly

    Scenario: FoxNews Login functionality check with invalid data
      And I enter a invalid username
      And I enter a valid password
      When I click login Button
      Then I verify if Invalid login credentials appear properly

      Scenario: FoxNews Login functionality check with invalid data
        And I enter a valid username
        And I enter a invalid password
        When I click login Button
        Then I verify if Invalid login credentials appear properly

        Scenario: FoxNews Login functionality check with invalid data
          And I enter a invalid username
          And I enter a invalid password
          When I click login Button
          Then I verify if Invalid login credentials appear properly