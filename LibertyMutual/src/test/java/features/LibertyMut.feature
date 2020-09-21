Feature: Check liberty mutual home page functionality

  Background:
    Given I am in liberty mutual home page

  Scenario: Check liberty mutual home page
      Then  I click on liberty Mutual button
      Then I click on Business Insurance button
      And I verify the page title
      Then I enter  string "policy" in search box
      And I click on search button
      Then I verify the page title

  Scenario: I am in liberty mutual home page
      Then  I click on liberty Mutual button
      Then I click on Business Insurance button
      And I do mouse hover on About liberty mutual Button
      Then I verify that careers appears properly
      Then I scroll down to Find an agent button
      And I verify that More Button appears properly
      Then I click on more button
      And i verify the page title appears properly
      Then I enter the a valid "<Zipcode>"
      And I enter  "<Address>"
      And I enter "<City>"

      |Zipcode       | Street Address  | City      | State   |
      | 11101        | 1234 Djaounna   | New York  | NY      |
      Then  I click on Go button
      And I verify that list of Agent displays