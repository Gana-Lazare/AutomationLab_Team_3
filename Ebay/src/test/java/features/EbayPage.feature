Feature: check Ebay Home page Functionality

Ebay search functionality


  Background:
    Given I am in Ebay homepage

#  @SmokeTest @Regression
  Scenario: Ebay SearchBox Functionality check with valid data
    And I enter Hand sanitizer in searchBox
    When I click searchButton
    Then I verify Hand Sanitizer is appear properly
    And I verify page title as Hand sanitizer


  Scenario: Ebay SearchBox Functionality check with valid data1
    And I enter "Hand Sanitizer" in searchBox
    When I click searchButton
    Then I verify "\"Hand Sanitizer1\"" is appear properly
    And I verify page title as Hand sanitizer

