Feature: Hilton Hotel Home Page functionality Check
  Check Home  Page Hilton Hotel Funtionality

Background:
  Given IM In HiltonHotel home page

    Scenario Outline: Find a hotel using search destionation
      Given IM In HiltonHotel home page
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

      Scenario: explore your trip now check functionalityz
        When I Scrol down to Explore Now Element
        And I click On Explore Now Element
        Then I verify Im In explore your trip Now Page

        Scenario:video clean stay on home page check functionality
          When I scrol down to the video
          And I play this video
          Then I verify that the video is running

          Scenario: waikola_huwaiWebELment CHECK FUNCTIONALITY
            When I Scrol down waikola_huwaiWebELment
            And I click On waikola_huwaiWebELment Button Image
            Then I verify Im In waikola_huwaiWebElement
