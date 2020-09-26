Feature: WatchTv Button on the home page FoxNews
  Check WatchTv Button functionality

  Background:
    Given Im in Fox News Home Page
    And I click on WatchTV Button
@Regression
  Scenario: Watch Tv Button  functionality Check
    Then I Verify Im in Watch TV Homepage
  @Regression
  Scenario: Im in Watch Tv and use FoxNews Homep page Button
    And I click On fox News Home Page
    Then I verify Im in Fox News Home Page
  @Regression
  Scenario: Im in watch tv Page and check Fox for business
    And I click on FoxBusiness
    Then I verify Im in FoxFor Business Page
  @Regression
  Scenario:  Im in watch Tv Page and check Fox News Radio
    And I click on FoxNews Radio
    Then I verify Im in Fox News Radio Page
  @Regression
  Scenario: Im in watch Tv and check Fox Nation
    And I click on  Fox Nation
    Then I verify Im in Fox Nation Page
  @Regression
  Scenario: Im in watch Tv and Check Fox News Flash
    And I click on Fox NEws Flash
    Then I verify Im in fox News Flash

  @Regression
  Scenario:  Im in watch Tv and check show clips
    And I click on show clips
    Then I verify Im in show Clips

  @Regression
  Scenario: Im in watch Tv and check New Clips
    And I click on News Clips
    Then I verify Im In News Clips
  @Regression
  Scenario:IM in watch Tv and Check Facebook link on icon
    And I click on facebook Icon
    Then I verify facebook Window Pop up

  @Regression
  Scenario:IM in watch Tv and Check Twitter link on icon
    And I click on Twitter Icon
    Then I verify Twitter Window Pop Up
    @Regression
    Scenario: Im in Watch Tv and check scroll down and check scroll to top button
      And scroll down to scroll to top button
      Then click on button
      And check im on top of Page
  @Regression
  Scenario Outline:check login functionality
    Given Im in Fox News Home Page
    Then  I click en log in
    And I enter "<email>" and "<password>"
    Then  i wil try to login
    Examples:
      |email     |password|
      |emailtest@gmail.com|foxpsw|
  @Regression
  Scenario:fox news2
    Given Im in Fox News Home Page
    Then  I click en log in
    And I click on create an account
    And I file the form given
      |foxtest@gmail.com|foxtest|Lazare|Gana|
  @SmokeTest
  Scenario:fox news3
    Given Im in Fox News Home Page
    Then  I click en log in
    And I click on create an account
    And I file the form given
      |email           |password|FN  |LN   |
      |test@hotmail.fr|1467|Lazare|Gana|





