package stepDefinition;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

public class LogIn extends BaseClass{

    @Given("User launch the chrome browser")
    public void user_launch_the_chrome_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        this.driver = driver;
        lp = new LoginPage(driver);
    }

    @When("User open the given url {string}")
    public void user_open_the_given_url(String url) {
        driver.get(url);
    }

    @When("User enters Email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String email, String password) {
//        System.out.println("The webelement is Email"+driver.findElements(By.xpath("//input[@id='Email']")).size());
//        lp.EmailTxt=driver.findElement(By.xpath("//input[@id='Email']"));
        lp.Email(email);
        lp.Password(password);
    }

    @When("User click on Log in Button")
    public void user_click_on_log_in_button() throws InterruptedException {
        lp.SubmitButton();
        Thread.sleep(3000);
    }

    @Then("Page title should be {string}")
    public void page_title_should_be(String title) {
        if (driver.getPageSource().contains("Login was unsuccessful.")){
            driver.close();
            Assert.assertTrue(false);
        }
        else {
            Assert.assertEquals(title, driver.getTitle());
        }
    }
    @When("User click on Log Out icon")
    public void user_click_on_log_out_icon() throws InterruptedException {
            lp.LogOut();
            Thread.sleep(3000);
    }
}