Feature: Check verizon Home page
         Check scroll down on verizon Home page
         Check the mouse hover

  Background:
    Given I am in verizon  home page

  @Regression
  Scenario: Check verizon  home page
    Then  I click on store button
    And I verify the page title
    Then I enter  string "43202" in type zipcode box
    And I click on search button
    Then I verify the map page title

  @Regression
  Scenario:  Check scroll down on verizon Home page
    Then  I click on verizon button
    Then I verify that careers appears properly
    Then I scroll down to Find an agent button
    And i verify the page title appears properly

    Scenario: Check the mouse hover on my verizon button
    Then I click on store button
    And I do mouse hover on why verizon button
    Then I verify that the list drops down

#    Scenario:Check the mouse hover on shop button
#    Then I click on store button
#    And I do mouse hover on shop button
#    Then I verify that the list drops down
#
#    Scenario:Check the mouse hover on Support button
#     Then I click on store button




