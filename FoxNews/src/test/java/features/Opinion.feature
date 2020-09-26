Feature:  FoxNews SearchBox Functionality check
          FoxNews Opinion Button check
          FoxNews Opinion page functionality check
          FoxNews Opinion Tech Functionality check
          FoxNews Opinion Security Functionality check
          FoxNews Opinion Innovation Functionality check
          FoxNews Opinion Natural Science Functionality check
          FoxNews Opinion Drones Functionality check
          FoxNews Opinion Computers Functionality check
          FoxNews Opinion Video Games Functionality check
          FoxNews Opinion Military Tech Functionality check
          FoxNews Opinion Science Functionality check
          FoxNews Opinion Archaeology Functionality check
          FoxNews Opinion Air & Space Functionality check
          FoxNews Opinion Planet Earth Functionality check
          FoxNews Opinion Wild Nature Functionality check


  Background:
    Given I am in foxNews homepage




  @Retesting
  Scenario Outline:FoxNews SearchBox Functionality check with multiple products
    And I enter "<titleName>" in searchBox
    When I click searchButton
    Then I verify "<verifyTitle>" is appear properly
    Examples:
      | titleName  | verifyTitle |
      | Trump      | \"Trump\"   |
      | Algeria    | \"Algeria\" |
      | Corona     | \"Corona\"  |
      | New York   | \"New York\"|



  @Regression
  Scenario: FoxNews Opinion Button check
    And I click on opinion button
#    Then I am in opinion Home page
    Then I verify opinion is appear properly
    And I verify page title as Fox News

  @Regression
  Scenario: FoxNews Opinion Tech Functionality check
    And I click on opinion button
#    Then I am in opinion Home page
    And I click on Tech Button
    Then I verify Tech is appear properly


  @Regression
  Scenario: FoxNews Opinion Security Functionality check
    And I click on opinion button
#    Then I am in opinion Home page
    And I click on Security Button
    Then I verify Security appear properly


  @Regression
  Scenario: FoxNews Opinion Innovation Functionality check
    And I click on opinion button
#    Then I am in opinion Home page
    And I click on Innovation Button
    Then I verify Innovation appear properly

  @Regression
  Scenario: FoxNews Opinion Natural Science Functionality check
    And I click on opinion button
#    Then I am in opinion Home page
    And I click on Natural Science Button
    Then I verify Natural Science appear properly

  @Regression
  Scenario: FoxNews Opinion Drones Functionality check
    And I click on opinion button
#    Then I am in opinion Home page
    And I click on Drones Button
    Then I verify Drones appear properly

  @Regression
  Scenario: FoxNews Opinion Computers Functionality check
    And I click on opinion button
#    Then I am in opinion Home page
    And I click on Computers Button
    Then I verify Computers appear properly

  @Regression
  Scenario: FoxNews Opinion Video Games Functionality check
    And I click on opinion button
#    Then I am in opinion Home page
    And I click on Video Games Button
    Then I verify Video Games appear properly

  @Regression
  Scenario: FoxNews Opinion Military Tech Functionality check
    And I click on opinion button
#    Then I am in opinion Home page
    And I click on Military Tech Button
    Then I verify Military Tech appear properly

  @Regression
  Scenario: FoxNews Opinion Science Functionality check
    And I click on opinion button
#    Then I am in opinion Home page
    And I click on Science Button
    Then I verify Science appear properly

  @Regression
  Scenario: FoxNews Opinion Archaeology Functionality check
    And I click on opinion button
#    Then I am in opinion Home page
    And I click on Archaeology Button
    Then I verify Archaeology appear properly

  @Regression
  Scenario: FoxNews Opinion Air & Space Functionality check
    And I click on opinion button
#    Then I am in opinion Home page
    And I click on Air & Space Button
    Then I verify Air & Space appear properly

  @Regression
  Scenario: FoxNews Opinion Planet Earth Functionality check
    And I click on opinion button
#    Then I am in opinion Home page
    And I click on Planet Earth Button
    Then I verify Planet Earth appear properly

  @Regression
  Scenario: FoxNews Opinion Wild Nature Functionality check
    And I click on opinion button
#    Then I am in opinion Home page
    And I click on Wild Nature Button
    Then I verify Wild Nature appear properly



