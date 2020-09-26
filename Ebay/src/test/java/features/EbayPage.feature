Feature: check Ebay Home page Functionality
         Ebay SearchBox Functionality check with valid data1
         Check ebay.com button
         Ebay search functionality


  Background:
    Given I am in Ebay homepage

 @SmokeTest @Regression
  Scenario: Ebay SearchBox Functionality check with valid data
    And I enter Hand sanitizer in searchBox
    When I click searchButton
    Then I verify Hand Sanitizer is appear properly
    And I verify page title as Hand sanitizer




#//====================================




  Scenario:Check ebay.com button
    Then I click on Home & Garden Button
    And I verify the page title

  Scenario:Check baby Gear button
    Then I click on baby Gear Button
    And I verify the page title

  Scenario:Check Bedding button
    Then I click on Bedding Button
    And I verify the page title

  Scenario:Check crafts button
    Then I click on crafts Button
    And I verify the page title

  Scenario:Check FoodBeverages button
    Then I click on FoodBeverages Button
    And I verify the page title

  Scenario:Check furniture button
    Then I click furniture Button
    And I verify the page title

  Scenario:Check homeDecor button
    Then I click on homeDecor Button
    And I verify the page title
