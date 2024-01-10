Feature: Login
  Scenario: Successful login with valid credentials
    Given User launch the chrome browser
    When User open the given url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And User click on Log in Button
    And Close browser