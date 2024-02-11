package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import stepDefinition.BaseClass;

import javax.swing.plaf.PanelUI;

public class AddCustomerPage extends BaseClass {
 public WebDriver ldriver; //Initialize the webdriver

 public AddCustomerPage(WebDriver rdriver) {
  ldriver = rdriver;
  PageFactory.initElements(ldriver, this);
  System.out.println("Add Customer page ldriver value"+ldriver);
 }

 By menuCustomers = By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");

 By menuItemCustomers = By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]");

 By btnAddNewCustomer = By.xpath("//a[@class='btn btn-primary']");

 By txtEmail = By.id("Email");

 By txtPassword = By.id("Password");

 By txtFirstName = By.id("FirstName");

 By txtLastName = By.id("LastName");

 By genderMale = By.id("Gender_Male");
 By genderFemale = By.id("Gender_Female");

 By dropDayOfBirth = By.id("DateOfBirth");

 By txtCompanyName = By.id("Company");

 //Select Customer Roles
 By txtCustomerRoles = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
 By listItemAdministrators = By.xpath("//li[contains(text(), 'Administrators')]");
 By listItemForumModerators = By.xpath("//li[contains(text(), 'Forum Moderators')]");
 By listItemGuests = By.xpath("//li[contains(text(), 'Guests']");
 By listItemRegistered = By.xpath("//li[contains(text(), 'Registered']");
 By listItemVendors = By.xpath("//li[contains(text(), 'Vendors']");

 By mgrOfVendors = By.id("VendorId");

 By checkboxActive = By.id("Active");

 By txtAdminComment = By.id("AdminComment");

 By buttonSave = By.xpath("//button[@name='save']");

 //Action Methods

 public String getPageTitle(){
    return ldriver.getTitle();
 }
 public void clickOnCustomersMenu() {
  ldriver.findElement(menuCustomers).click();
 }

 public void clickOnCustomersMenuItem(){
  ldriver.findElement(menuItemCustomers).click();
 }

 public void clickOnAddNewButton(){
  ldriver.findElement(btnAddNewCustomer).click();
 }
 public void setEmail(String email){
  ldriver.findElement(txtEmail).sendKeys(email);
 }
 public void setPassword(String password){
  ldriver.findElement(txtPassword).sendKeys(password);
 }

 public void setCustomerRole(String role) throws InterruptedException {
  ldriver.findElement(txtCustomerRoles).click();
  WebElement listItem;
  Thread.sleep(3000);
  if (role.equals("Administrators")){
   listItem = ldriver.findElement(listItemAdministrators);
  } else if (role.equals("Forum Moderators")) {
   listItem = ldriver.findElement(listItemForumModerators);
  } else if (role.equals("Guests")) {
   listItem = ldriver.findElement(listItemGuests);
  } else if (role.equals("Registered")) {
   listItem = ldriver.findElement(listItemRegistered);
  } else {
   listItem = ldriver.findElement(listItemVendors);
  }
  listItem.click();

//If click action is not working use javascriptexecutor. This will perform click action.
//   JavascriptExecutor js = (JavascriptExecutor)ldriver;
//   js.executeScript("arguments[0].click;", listItem);

 }
 public void setManagerOfVendor(String value){
  Select drp = new Select(ldriver.findElement(mgrOfVendors));
  drp.selectByVisibleText(value);
 }

 public void setGender(String gender){
  if (gender.equals("Male")){
   ldriver.findElement(genderMale).click();
  } else if (gender.equals("Female")) {
   ldriver.findElement(genderFemale).click();
  }else
   ldriver.findElement(genderMale).click(); //Default Male gender selection
 }

 public void setFirstName(String fname){
  ldriver.findElement(txtFirstName).sendKeys(fname);
 }

 public void setLastName(String lname){
  ldriver.findElement(txtLastName).sendKeys(lname);
 }

 public void setDOB(String dob){
  ldriver.findElement(dropDayOfBirth).sendKeys(dob);
 }

 public void setCompanyName(String comname){
  ldriver.findElement(txtCompanyName).sendKeys(comname);
 }

 public void setAdminComment(String adminCmnt){
  ldriver.findElement(txtAdminComment).sendKeys(adminCmnt);
 }

 public void clickOnSave(){
  ldriver.findElement(buttonSave).click();
 }

}