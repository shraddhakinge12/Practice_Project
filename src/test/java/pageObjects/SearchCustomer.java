package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomer {
    public WebDriver rdriver;
    public SearchCustomer(WebDriver ldriver){
        rdriver = ldriver;
        PageFactory.initElements(ldriver,this);
    }
    @FindBy(how = How.ID, using = "SearchEmail")
    public WebElement TxtSearchEmail;

    @FindBy(how = How.ID, using = "search-customers")
    @CacheLookup
    public WebElement ButtonSearch;

    @FindBy(how = How.ID, using = "SearchFirstName")
    @CacheLookup
    public WebElement TxtFirstName;

    @FindBy(how = How.ID, using = "SearchLastName")
    @CacheLookup
    public WebElement TxtLastName;

    @FindBy(how = How.ID, using = "SearchMonthOfBirth")
    @CacheLookup
    public WebElement drpdnMonthOfBirth;

    @FindBy(how = How.ID, using = "SearchDayOfBirth")
    @CacheLookup
    public WebElement drpdnDayOfBirth;

    @FindBy(how = How.ID, using = "SearchRegistrationDateFrom")
    @CacheLookup
    public WebElement txtRegistrationDateFrom;

    @FindBy(how = How.ID, using = "SearchRegistrationDateTo")
    @CacheLookup
    public WebElement txtRegistrationDateTo;

    @FindBy(how = How.ID, using = "SearchLastActivityFrom")
    @CacheLookup
    public WebElement txtLastActivityFrom;

    @FindBy(how = How.ID, using = "SearchLastActivityTo")
    @CacheLookup
    public WebElement txtLastActivityTo;

    @FindBy(how = How.ID, using = "SearchCompany")
    @CacheLookup
    public WebElement txtCompany;

    @FindBy(how = How.ID, using = "SearchIpAddress")
    @CacheLookup
    public WebElement txtIpAddress;

    @FindBy(how = How.XPATH, using = "//div[@role='listbox']")
    @CacheLookup
    public WebElement drpdnCustomerRoles;

}
