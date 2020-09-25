Feature: check home page functionality


  Background:
    Given Im in Verizon Home Page

  Scenario: check smartphones functionality under shop
    When I mouse over shop
    And I click on smartphone
    Then I verify Im in page page

  Scenario: check G5phones functionality
    When I mouse over shop
    And I click on  G5phones element
    Then I verify Im in G5phones webpage

  Scenario:  check otherphones functionality
    When I mouse over shop
    And  i CLICK on otherphones element
    Then I verify Im in otherphoneswebpage

  Scenario:  check accessories functionality
    When I mouse over shop
    And i click on accessories element
    Then I verify Im in accessories page

  Scenario:  check tradeYourPhone functionality
    When I mouse over shop
    And i click on tradeYourPhone element
    Then I verify Im in tradeYourPhone page

  Scenario:  check bringYourOwnDevice functionality
    When I mouse over shop
    And i click on bringYourOwnDevice element
    Then I verify Im in bringYourOwnDevice page

  Scenario:  check tablets functionality
    When I mouse over shop
    And i click on tablets element
    Then I verify Im in tablets page

  Scenario:  check connectedSmartWatche functionality
    When I mouse over shop
    And i click on connectedSmartWatche element
    Then I verify Im in connectedSmartWatche page

  Scenario:  check plansunlimited functionality
    When I mouse over shop
    And i click on plansunlimited element
    Then I verify Im in plansunlimited page

  Scenario:  check planssharedData functionality
    When I mouse over shop
    And i click on planssharedData element
    Then I verify Im in planssharedData page

  Scenario:  check plansprepaid functionality
    When I mouse over shop
    And i click on plansprepaid element
    Then I verify Im in plansprepaid page

  Scenario:  check planssingledevice functionality
    When I mouse over shop
    And i click on planssingledevice element
    Then I verify Im in planssingledevice page

  Scenario:  check plansthoseWhoServe functionality
    When I mouse over shop
    And i click on plansthoseWhoServe element
    Then I verify Im in plansthoseWhoServe page

  Scenario:  check planskidsPlans functionality
    When I mouse over shop
    And i click on planskidsPlans element
    Then I verify Im in planskidsPlans page


  Scenario:  check plansstudent functionality
    When I mouse over shop
    And i click on plansstudent element
    Then I verify Im in plansstudent page

  Scenario:  check plansotherplans functionality
    When I mouse over shop
    And i click on plansotherplans element
    Then I verify Im in plansotherplans page

  Scenario:  check plansdBrinYourOwnDevice functionality
    When I mouse over shop
    And i click on plansdBrinYourOwnDevice element
    Then I verify Im in plansdBrinYourOwnDevice page

  Scenario: check smartphones under siteMap getting list of smartphones
    When I scroll to site map
    And I click on site map
    And I get the list of smartphones

  Scenario:  check my account under sign in  functionality
    When I mouse over signin
    And I click n my account
    Then I verify Im in my account page

  Scenario: check register under sign in functionality
    When I mouse over signin
    And I click on Register
    Then I verify Im in register page


  Scenario: check prepaidInstantPay button under Sign In functionality
    When I mouse over signin
    And I click on prepaidInstantPay
    Then  I verify Im in prepaidInstantPay

    Scenario Outline: check search button functionality  
      When I click on search Button
      And I type "<searchkey>" on search bar
      Then I verify in parthresearchVerify is correct
      Examples:
      |searchkey|
      |how to subscript|



  Scenario Outline: check devices functionality under shop
    When I mouse over shop
    And I click on "<devices>" element
    Then I verify Im in "<devicespage>" page

    Examples:
      | devices                     | devicespage                                                                                                                                                                                                                            |
#smartphones
      |                             |                                                                                                                                                                                                                                        |
      | "/*[@id="gnav20-Shop-L3-1\" | https://www.verizon.com/smartphones/?adobe_mc=MCMID%3D13354807219508001731320662505102754890%7CMCORGID%3D843F02BE53271A1A0A490D4C%2540AdobeOrg%7CTS%3D1600228617&mboxSession=2b20bb09e7e34b3b974971be12f59963&wireless_gn_exp=0-129904 |
#5Gphones
      | //*[@id="gnav20-Shop-L3-2"] | https://www.verizon.com/5g/phones/?adobe_mc=MCMID%3D13354807219508001731320662505102754890%7CMCORGID%3D843F02BE53271A1A0A490D4C%2540AdobeOrg%7CTS%3D1600228653&mboxSession=2b20bb09e7e34b3b974971be12f59963&wireless_gn_exp=0-129904   |


