Feature: Customer
  Scenario: Add a new customer
    Given User launch the chrome browser
    When User open the given url "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And User click on Log in Button
    Then User can view Dashboard
    When User click on Customers menu
    And User click on customers menu item
    And User click on Add new button
    Then User can view Add new Customer page
    When User enter customer info
    And User click on Save button
    Then User can view confirmation message "The new customer had been added successfully."
    And Close browser


    Scenario: Search customer using email id
      Given User launch the chrome browser
      When User open the given url "https://admin-demo.nopcommerce.com/login"
      And User enters Email as "admin@yourstore.com" and Password as "admin"
      And User click on Log in Button
      Then User can view Dashboard
      When User click on Customers menu
      And User click on customers menu item
      Then User enter given email id in email field "test12@gmail.com"
      And User click on search button
      Then User verify the result.
      And Close browser