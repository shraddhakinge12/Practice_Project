package stepDefinition;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

public class LogIn {

    public WebDriver driver;
    public LoginPage lp;

    @Given("User launch the chrome browser")
    public void user_launch_the_chrome_browser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
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
    public void user_click_on_log_in_button() {
        lp.SubmitButton();
    }
}
