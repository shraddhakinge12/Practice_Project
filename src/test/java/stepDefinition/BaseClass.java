package stepDefinition;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;

public class BaseClass {
    public WebDriver driver;
    public LoginPage lp;
    public AddCustomerPage addCust;

    //Generate random string for unique emailid for every customer.
    public static String randomStrng(){
        String generatedString1 = RandomStringUtils.randomAlphabetic(5);
        return (generatedString1);
    }

}
