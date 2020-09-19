Feature:  JetBlue Home page Check functionality
          check Jet Blue Home Page functionality

Background:
  Given IM in Jetblue Home Page

 @Regression
 Scenario: check flight under book functionality
   When I click on book
   And I click on flight
   #Then I verify im in flight page

  @Regression
  Scenario:check flightAndHotel under book functionality
    When I click on book
    And I click on flight and hotel
    Then I verify im In flight and hotel page

