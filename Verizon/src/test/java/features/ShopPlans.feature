Feature:
  Verizon Shop Button check
  Background:
    Given I am in Verizon homepage
    And I click on Shop Button
  @Regression
  Scenario: Verizon Shop Button check
    Then I verify Deals is appear properly
    And I verify page title as Shop
