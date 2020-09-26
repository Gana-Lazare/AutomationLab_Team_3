Feature: Aetna Homepage Functionality Check
         Search button check
#         Check login functionality
#         Check register functionality
#         Check Aetna.com button functionality
#         Check For Providers button functionality
#         Check For Employers button functionality
#         Check For Agents/Brokers button functionality
#         Check For Partners button functionality
#         Check For Partners button
#         Check Careers button
#         Check About Us button


  Background:
    Given I am in Aetna Homepage
    Then  I click on Expplore Aetna Site
  @Regression
  Scenario: Aetna HomePage Check
    And I verify the Expplore Aetna page title


#    Then I click on For Agents Brokers


  @Regression
  Scenario:Search button check
    Then  I click on search button
    And  I enter search text "provider"
    And  I click on submit
    Then I verify the provider page title

#  Scenario: check login functionality
#    Then I click on login1 button
#    Then i verify the login page title
#    And I click on member button
#    Then I verify the member page title
#    And I click on login2 button
#    Then I enter a valid user name
#    Then I enter a valid password
#    And I click on secure login button

#
#  Scenario: check register functionality
#    Then I click login button
#    And I click on member button
#    Then I verify the member page title
#    And I click on register button
#    Then I select member iD option
#    And I enter String " member ID" and submit
#
#         |member ID        |  2243223        | 334665      | 344555     |
#         |full first name  | Rabah           | Khaled      | David      |
#         |full last name   | Lamri           | Sami        | Mimou      |
#         | date of berth   | 01/10/1977      | 02/02/1989  |03/03/1989  |
#         |zip code         | 43202           | 45432       | 433398     |
#
#
#    Then I click on continue button
#    Then i verify the page title5

#    Scenario:Check Aetna.com button
#      Then I click on Aetna.com Button
#      And I verify the page title
#
#  Scenario:Check For Providers button
#    Then I click on For Providers Button
#    And I verify the page title
#
#  Scenario:Check For Employers button
#    Then I click on For Employers Button
#    And I verify the page title
#
#  Scenario:Check For Agents/Brokers button
#    Then I click on For Agents Brokers Button
#    And I verify the page title
#
#  Scenario:Check For Partners button
#    Then I click on For Partners Button
#    And I verify the page title
#
#  Scenario:Check Careers button
#    Then I click on Careers Button
#    And I verify the Careers page title
#
#  Scenario:Check About Us button
#    Then I click on About Us Button
#    And I verify the page title
