package stepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import pageObjects.AddCustomerPage;

import java.sql.SQLOutput;

public class AddNewCustomer extends BaseClass{

    @Then("User can view Dashboard")
    public void user_can_view_dashboard() {
        System.out.println("Verifying dashboard title");
        addCust = new AddCustomerPage(driver);
        Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());
    }
    @When("User click on Customers menu")
    public void user_click_on_customers_menu() throws InterruptedException {
        Thread.sleep(3000);
        addCust.clickOnCustomersMenu();
    }
    @When("User click on customers menu item")
    public void user_click_on_customers_menu_item() throws InterruptedException {
        Thread.sleep(2000);
        addCust.clickOnCustomersMenuItem();
    }
    @When("User click on Add new button")
    public void user_click_on_add_new_button() throws InterruptedException {
        addCust.clickOnAddNewButton();
        Thread.sleep(2000);
    }
    @Then("User can view Add new Customer page")
    public void user_can_view_add_new_customer_page() {
        Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
    }
    @When("User enter customer info")
    public void user_enter_customer_info() throws InterruptedException {
        String email = randomStrng()+"@gmail.com";
        addCust.setEmail(email);
        addCust.setPassword("Test@123");
        addCust.setFirstName("Shraddha");
        addCust.setLastName("Testing");
        addCust.setGender("Female");
        addCust.setDOB("12/09/1990");
        addCust.setCompanyName("TestingExpert");
        addCust.setCustomerRole("Guest");
        Thread.sleep(2000);
        addCust.setAdminComment("This customer is created for testing purpose through automation script");

    }
    @When("User click on Save button")
    public void user_click_on_save_button() throws InterruptedException {
        addCust.clickOnSave();
        Thread.sleep(3000);
    }
    @Then("User can view confirmation message {string}")
    public void user_can_view_confirmation_message(String msg) {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer had been added successfully."));
    }


}
