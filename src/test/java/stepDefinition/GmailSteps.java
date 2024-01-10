package stepDefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSteps {
    WebDriver driver;

    @Given("I launch the chrome browser")
    public void i_launch_the_chrome_browser() {
        // System.setProperty("webdriver.chrome.driver","/usr/bin/google-chrome");
        driver = new ChromeDriver();
        System.out.println(driver.getTitle());
    }
    @When("I open the gmail homepage")
    public void i_open_the_gmail_homepage() {
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=ASKXGp0T7PK2Ol6FyCQYU7hMKEzXNX4Z7WTg7tGN0AiGMUrv3vDTCOkIMN-KtuFpnXqzKiv-6B5GXQ&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1358495856%3A1703785562600821&theme=glif");

    }
    @Then("I verify the gmail logo is present on gmail homepage.")
    public void i_verify_the_gmail_logo_is_present_on_gmail_homepage() {
      boolean status = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/c-wiz/div/div/div/div")).isDisplayed();
        Assert.assertTrue(status);
    }
    @Then("Close browser")
    public void i_close_the_browser() {
        driver.quit(); //close the current window

    }
}
