Feature: Check liberty mutual home page functionality
  Check liberty Mutual button

  Background:
    Given I am in liberty mutual home page


  Scenario: Check liberty mutual home page
    Then  I click on liberty Mutual button
    Then I click on Business Insurance button
    And I verify the liberty Mutual page title


  Scenario: check search box
    Then  I click on liberty Mutual button
    And I enter  string "policy" in search box
    Then I verify the policy page title

  Scenario: check Business Insurance button
    Then I click on Business Insurance button
    And i verify the Business Insurance page title

  Scenario: check coverage button
    Then I click on coverage button
    And I verify coverage page title


  Scenario: check coverage button
    Then I click on coverage button
    And I verify coverage page title

  Scenario: check Industries button
    Then I click on Industries button
    And I verify Industries page title

  Scenario: check claims button
    Then I click on claims button
    And I verify claims page title

  Scenario: check Services button
    Then I click on Services button
    And I verify Services page title

  Scenario: check Business size button
    Then I click on Business size button
    And I verify Business size page title




#  Scenario: I am in liberty mutual home page
#
#      Then  I click on liberty Mutual button
#      Then I click on Business Insurance button
#      And I do mouse hover on About liberty mutual Button
#      Then I verify that careers appears properly
#      Then I scroll down to Find an agent button
#      And I verify that More Button appears properly
#      Then I click on more button
#      And i verify the page title appears properly
#      Then I enter the a valid "<Zipcode>"
#      And I enter  "<Address>"
#      And I enter "<City>"
#      And I enter "<State>"
#
#      |Zipcode       | Street Address  | City      | State   |
#      | 11101        | 1234 Djaounna   | New York  | NY      |
#      | 43202        | 11222 isser     | Bronx     | NY      |
#      | 43235        | 22333 Legata    | Columbus  | OH      |
#      | 43202        | 11222 SiMustapha| Alger     | BM      |


#    Then  I click on Go button
#    And I verify that list of Agent displays