Feature: check verizon Home page
  Background:
    Given I am in verizon  home page

  Scenario: Check verizon  home page

    Then  I click on store button
    And I verify the page title
    Then I enter  string "43202" in type zipcode box
    And I click on search button
    Then I verify the page title

  Scenario:  Check verizon  home page

    Then  I click on verizon button
    Then I verify that careers appears properly
    Then I scroll down to Find an agent button
    And i verify the page title appears properly

