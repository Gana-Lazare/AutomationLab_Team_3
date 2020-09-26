Feature: Check Liberty Mutual Home Page Functionality


Background:
  Given IM in LibertyMutual Home Page

  Scenario Outline:check auto insurance for zip code
    When  I select Auto
    And I send zip code
    And I click on price
    And close popo Window Alert
    Then I verify Im in auto page
    And I send "<streetAdress>" bare
    When i send "<appartementNumber>" apt
    And click saveandContinue
    Then I verify Im in Personal Information page

    Examples:
    |streetAdress|appartementNumber|
    |1234 west 45th stret|APT1     |

Scenario:check car under Shop Insurance
  When I click on shopInsurance
  And I click on Car
  Then I verify Im in Car Page

  Scenario:check motocycle under Shop Insurance
    When I click on shopInsurance
    And I click on motocycle
    Then I verify Im in motocycle Page

  Scenario:check boatAndWaterCraft under Shop Insurance
    When I click on shopInsurance
    And I click on boatAndWaterCraft
    Then I verify Im in boatAndWaterCraft Page

  Scenario:check anticAndClassicCar under Shop Insurance
    When I click on shopInsurance
    And I click on anticAndClassicCar
    Then I verify Im in anticAndClassicCar Page

  Scenario:check AtvAndOfRoadVehicul under Shop Insurance
    When I click on shopInsurance
    And I click on AtvAndOfRoadVehicul
    Then I verify Im in AtvAndOfRoadVehicul Page

  Scenario:check recreationalVehicule under Shop Insurance
    When I click on shopInsurance
    And I click on recreationalVehicule
    Then I verify Im in recreationalVehicule Page

  Scenario:check umberella under Shop Insurance
    When I click on shopInsurance
    And I click on umberella
    Then I verify Im in umberella Page

  Scenario:check home under Proprety
    When I click on shopInsurance
    And I click on home
    Then I verify Im in home Page

  Scenario:check renters under Proprety
    When I click on shopInsurance
    And I click on renters
    Then I verify Im in renters Page

  Scenario:check condo under Proprety
    When I click on shopInsurance
    And I click on condo
    Then I verify Im in condo Page

  Scenario:check landlord under Proprety
    When I click on shopInsurance
    And I click on landlord
    Then I verify Im in landlord Page

  Scenario:check mobilehome under Proprety
    When I click on shopInsurance
    And I click on mobilehome
    Then I verify Im in mobilehome Page

  Scenario:check flood under Proprety
    When I click on shopInsurance
    And I click on flood
    Then I verify Im in flood Page

  Scenario:check umberellaProprety under Proprety
    When I click on shopInsurance
    And I click on umberellaProprety
    Then I verify Im in umberellaProprety Page

    Scenario: check login functionality
      When I click on login
      And I try to login
      |troy@gmail.com|1248*|
      And I click on submite

      Scenario Outline: check search bare functionality
        When I click on search on home page
        And I send "<searchKey>" searchKey
        Then i verify i get the right result
        Examples:
        |searchKey|
        |car insurance|
        |custom vehicle|
        |truck insurance|

        Scenario: check claimCenter functionality
          When I click on claim Button
          And I click on claimCenter Button
          Then I verify im in claimCenter

  Scenario: check howTomanageYourClaim functionality
    When I click on claim Button
    And I click on howTomanageYourClaim Button
    Then I verify im in howTomanageYourClaim

  Scenario: check fileAclaimAgainstLibertymutual functionality
    When I click on claim Button
    And I click on fileAclaimAgainstLibertymutual Button
    Then I verify im in fileAclaimAgainstLibertymutual

  Scenario: check fileAnAutoGlassClaim functionality
    When I click on claim Button
    And I click on fileAnAutoGlassClaim Button
    Then I verify im in fileAnAutoGlassClaim

    Scenario: