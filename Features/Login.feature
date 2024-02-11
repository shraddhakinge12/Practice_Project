Feature: Login
  Scenario: Successful login with valid credentials
    Given User launch the chrome browser
    When User open the given url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And User click on Log in Button
    Then Page title should be "Dashboard / nopCommerce administration"
    When User click on Log Out icon
    Then Page title should be "Your store. Login"

  Scenario Outline:Login Data Driven
    Given User launch the chrome browser
    When User open the given url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters Email as "<email>" and Password as "<password>"
    And User click on Log in Button
    Then Page title should be "Dashboard / nopCommerce administration"
    When User click on Log Out icon
    Then Page title should be "Your store. Login"

    Examples:
      | email | password |
      | admin@yourstore.com | admin |
      | admin123@yourstore.com | admin12 |
      | admin1@yourstore.com | admin1 |
