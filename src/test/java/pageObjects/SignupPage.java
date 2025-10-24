package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage{

    public SignupPage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement btn_signup_login_loc;
    @FindBy(xpath = "//input[@data-qa='signup-name']")
    WebElement txt_signupname_loc;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement txt_signupemail_loc;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    WebElement btn_signup_loc;

//Action Methods

    public  void setUsername(String username)
    {
        txt_signupname_loc.sendKeys(username);
    }
    public  void setEmail(String email)
    {
        txt_signupemail_loc.sendKeys(email);
    }

    public  void clickSignupLogin()
    {
        btn_signup_login_loc.click();
    }

    public  void clickSignup()
    {
        btn_signup_loc.click();
    }

}