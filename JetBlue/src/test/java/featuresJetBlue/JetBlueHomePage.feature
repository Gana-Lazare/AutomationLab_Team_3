Feature:  JetBlue Home page Check functionality
          check Jet Blue Home Page functionality

Background:
  Given IM in Jetblue Home Page

 @Regression
 Scenario Outline: check flight under book functionality
   When I click on book
   And I click on flight
   And I send  "<from>" from and submite
   And I send "<destination>" destination and submite
   #Then I verify im in flight page
   Examples:
   |from|destination|
   |New York City|Chicago|

  @Regression
  Scenario:check flightAndHotel under book functionality
    When I click on book
    And I click on flight and hotel
    Then I verify im In flight and hotel page

    Scenario: check travelBankCredit fucntionality
      When i Click on travelBankCredit
      Then I verify Im in travelBankCredit

  Scenario Outline: check checkIn fucntionality
    When i Click on checkIn
    Then I verify Im in checkIn
    And I send "<firstName>" firstname and "<lastname>" lastName
  And I click on confirmationcode
    And I chose flightNumber option
    And I send "<flightNumber>" flight Number
    And I click On departure airport
    And I chose albany airport
    And I click on find flight
    Examples:
    |firstName|lastname|flightNumber|
    |hilton   |grey    |6667564NY   |

  Scenario: check flightTraker fucntionality
    When i Click on flightTraker
    Then I verify Im in flightTraker

  Scenario: check travelAlert fucntionality
    When i Click on travelAlert
    Then I verify Im in travelAlert

  Scenario: check espagnol fucntionality
    When i Click on espagnol
    Then I verify Im in espagnol

    Scenario: check sign in functionality
      When I click on sign In
      And I send "<email>" email
      And I send "<password>" password
      Then I click on signinsubmite

      Scenario: check join our emaillist
        When i scroll Down to join our emaillist
        And I click on join our emaillist
        Then I verify Im in join our emaillist Page

  Scenario: check DowloadJetBlueAPP
    When i scroll Down to DowloadJetBlueAPP
    And I click on join our DowloadJetBlueAPP
    Then I verify Im in join our DowloadJetBlueAPP Page

  Scenario: check facebookicon
    When i scroll Down to facebookicon
    And I click on join our facebookicon
    Then I verify Im in join our facebookIcon Page

  Scenario: check instagram
    When i scroll Down to instagram
    And I click on join our instagram
    Then I verify Im in join our instagram Page

  Scenario: check twitter
    When i scroll Down to twitter
    And I click on join our twitter
    Then I verify Im in join our twitter Page

  Scenario: check youtube
    When i scroll Down to youtube
    And I click on join our youtube
    Then I verify Im in join our youtube Page

  Scenario: check jetblueSwag
    When i scroll Down to jetblueSwag
    And I click on jetblueSwag
    Then I verify Im in jetblueSwag Page

  Scenario: check ourCompagny
    When i scroll Down to ourCompagny
    And I click on join our ourCompagny
    Then I verify Im in ourCompagnyPage

  Scenario: check ourPlanes
    When i scroll Down to ourPlanes
    And I click on ourPlanes
    Then I verify Im ourPlanes Page

  Scenario: check partnerAirlines
    When i scroll Down to partnerAirlines
    And I click on partnerAirlines
    Then I verify Im partnerAirlines Page

  Scenario: check youtube
    When i scroll Down to youtube
    And I click on join our youtube
    Then I verify Im in join our youtube Page

  Scenario: check investorRelations
    When i scroll Down to investorRelations
    And I click on investorRelations
    Then I verify Im in investorRelations Page

  Scenario: check travelAgents
    When i scroll Down to travelAgents
    And I click on travelAgents
    Then I verify Im in travelAgents Page

  Scenario: check careers
    When i scroll Down to careers
    And I click on careers
    Then I verify Im in careers Page

  Scenario: check timetables
    When i scroll Down to timetables
    And I click on timetables
    Then I verify Im in timetables Page

  Scenario: check siteMap
    When i scroll Down to siteMap
    And I click on siteMap
    Then I verify Im in siteMap Page

  Scenario: check contactUs
    When i scroll Down to contactUs
    And I click on contactUs
    Then I verify Im in contactUs Page

