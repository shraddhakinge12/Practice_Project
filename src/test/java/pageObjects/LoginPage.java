package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginPage {
    public  WebDriver rdriver;
    public LoginPage(WebDriver ldriver){
        rdriver = ldriver;
        PageFactory.initElements(ldriver,this);
     }

     @FindBy(xpath="//input[@id='Email']")
     public WebElement EmailTxt;

     @FindBy(how = How.ID, using = "Password")
     WebElement PasswordTxt;

     @FindBy(xpath = "//button[@type='submit']")
     @CacheLookup
     WebElement Login_Button;

     @FindBy(xpath = "//label[@for='RememberMe']")
     @CacheLookup
     WebElement Remember_me;

     @FindBy(how = How.XPATH, using = "//a[normalize-space()='Logout']")
     @CacheLookup
     WebElement Logout_Label;


     public void Email(String uname){
          EmailTxt.clear();
          EmailTxt.sendKeys(uname);
     }
     public void Password(String pwd){
         PasswordTxt.clear();
         PasswordTxt.sendKeys(pwd);

     }
     public void SubmitButton(){
         Login_Button.click();
     }

     public void LogOut(){
         Logout_Label.click();
     }



}
