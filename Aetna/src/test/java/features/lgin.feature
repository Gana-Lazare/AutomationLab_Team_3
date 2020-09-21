Feature: login button functionality
  Background:
    Given I am in aetna home page

  Scenario: login buton functionality
    Then I click on Expplore Aetna Site
    And I verify the page title
    Then I click on For Partners
    And I Scroll down to the end of the page
    And I verify the last element is visible
#
#Scenario: Take screen Shot
#    Then I click on Expplore Aetna Site
#    And I take screen shot to the page
