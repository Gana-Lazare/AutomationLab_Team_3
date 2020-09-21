Feature: Check FoxNews Functionalities

  Background:
  Given I am in FoxNews Home page

    Scenario:
      Then I click on entertainment Button
      And I verify the page title
      Then I click on 2020 Election Button
      And I verify the page title appears correctly
