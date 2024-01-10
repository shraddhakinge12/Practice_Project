Feature: Login

  Scenario: Gmail logo present on the gmail homepage
    Given I launch the chrome browser
    When I open the gmail homepage
    Then I verify the gmail logo is present on gmail homepage.
    And Close browser