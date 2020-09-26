Feature: Hilton Hotel Home Page functionality Check
  Check Home  Page Hilton Hotel Funtionality

Background:
  Given IM In HiltonHotel home page


@Regression
    Scenario Outline: Find a hotel using search destionation
      When I enter "<destination>" on Where to
      And I enter "<starting date>" on start date
      And I enter "<end date>" on end date
      And I enter "<Number of rooms>"
      And I enter "<Number of Adults>"
      And I enter "<Number of kids>"
      Then  I click Find hotel
#folow format 2020-09-27
      Examples:
      |destination|starting date|end date          |Number of rooms|Number of Adults |Number of kids |
      |    Miami  |   2020-09-27|    2020-09-30   | 1             |       4         |     2         |
  @Regression
      Scenario: explore your trip now check functionality
        When I Scrol down to Explore Now Element
        And I click On Explore Now Element
        Then I verify Im In explore your trip Now Page
  @Regression
        Scenario:video clean stay on home page check functionality
          When I scrol down to the video
          And I play this video
          Then I verify that the video is running
  @Regression
          Scenario: waikola_huwaiWebELment CHECK FUNCTIONALITY
            When I Scrol down waikola_huwaiWebELment
            And I click On waikola_huwaiWebELment Button Image
            Then I verify Im In waikola_huwaiWebElement

  @Regression
            Scenario Outline: Joing Button functionnality check
              When I click on Join
              And I enter "<FirstNAme>" in FirstNameBare
              And I enter "<lastName>" in LastNameBare
             # And I chose "<IdentifierCountry>" in Phone identifierBare
              And I enter "<Phone>"in Phone NUmberBar
              And I enter "<Email>" in EmailBare
              #And I chose "<Country>" In country Bare
              And I enter "<adress>" In adress
              And I enter valid "<zip>" code
              And I enter new "<passeword>" in password
              And I enter "<confirmpassword>" in confirmpsw
              When I click on join for free
            #  Then I verify newaccount registration
#PAssword
            #Must be between 8 and 32 characters
            #Contain one uppercase letter
            #Contain one lowercase letter
            #One number (0-9) or one special character
              Examples:
|FirstNAme|lastName|Phone      |Email         |zip   |adress  |passeword    |confirmpassword|
|  john   |Graham  |529768953  |tred@gmail.com|11204 | 4565 W 15TH |Huricane2020*|Huricane2020*  |

  @Regression
              Scenario: check locations functionality check
                When I click on locations
                And I scroll down to north america
                And I click On north america
                Then I confirm I m in north america
  @Regression
  Scenario: check southAmeric functionality check
    When I click on locations
    And I scroll down to southAmerica
    And I click On southAmerica
    Then I confirm I m in southAmerica
  @Regression
  Scenario: check centralAmerica functionality check
    When I click on locations
    And I scroll down to centralAmerica
    And I click On centralAmerica
    Then I confirm I m in centralAmerica
  @Regression
  Scenario: check europe functionality check
    When I click on locations
    And I scroll down to europe
    And I click On europe
    Then I confirm I m in europe
  @Regression
  Scenario: check Middle East functionality check
    When I click on locations
    And I scroll down to Middle East
    And I click On Middle East
    Then I confirm I m in Middle East
  @Regression
  Scenario: check Africa functionality check
    When I click on locations
    And I scroll down to Africa
    And I click On Africa
    Then I confirm I m in Africa
  @Regression
  Scenario: check Asia functionality check
    When I click on locations
    And I scroll down to Asia
    And I click On Asia
    Then I confirm I m in Asia
  @Regression
  Scenario: check Australia functionality check
    When I click on locations
    And I scroll down to Australia
    And I click On Australia
    Then I confirm I m in Australia

    @Regression
    Scenario: check wedding under meetinglink functionality
      When I click on meeting
      And I confirm Im in newWindow meeting
      And I mouse hover Event buton
      Then I confirm Im in wedding Page
      And I click on wedding

      @Regression
      Scenario:check social functionality button
        When I click on meeting
        And I confirm Im in newWindow meeting
        And I mouse hover Event buton
        Then I click on social button

        @Regression
        Scenario: check Facebook hilton functionality
          When I scroll down to facebook Icon
          And I click on Facebook Icon
          And I switch to the new facebook window
          Then I verify im in faceboo window

  @Regression
  Scenario: check twitter hilton functionality
    When I scroll down to twitter Icon
    And I click on twitter Icon
    And I switch to the new twitter window
    Then I verify im in twitter window

  @Regression
  Scenario: check instagram hilton functionality
    When I scroll down to Instagram Icon
    And I click on instagram Icon
    And I switch to the new instagram window
    Then I verify im in instagram window

    @Regrassion
    Scenario: check offers-members functionality
      When I click on offers
      And I click On member benefits
      Then I verify Im in member benefit




