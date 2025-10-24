package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountRegistrationPage extends BasePage {

    public AccountRegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement rdbutton_Male_title;

    @FindBy(xpath = "//input[@id='id_gender2']")
    WebElement rdbutton_Female_title;

    @FindBy(xpath = "//input[@id='password']")
    WebElement txtbox_password;

    @FindBy(xpath = "//select[@id='days']")
    WebElement drpdown_days;

    @FindBy(xpath = "//select[@id='months']")
    WebElement drpdown_months;

    @FindBy(xpath = "//select[@id='years']")
    WebElement drpdown_years;

    @FindBy(xpath = "//input[@id='first_name']")
    WebElement txtbox_first_name;

    @FindBy(xpath = "//input[@id='last_name']")
    WebElement txtbox_last_name;

    @FindBy(xpath = "//input[@id='company']")
    WebElement txtbox_company;

    @FindBy(xpath = "//input[@id='address1']")
    WebElement txtbox_address1;

    @FindBy(xpath = "//input[@id='address2']")
    WebElement txtbox_address2;

    @FindBy(xpath = "//select[@id='country']")
    WebElement drpdown_country;

    @FindBy(xpath = "//input[@id='state']")
    WebElement txtbox_state;

    @FindBy(xpath = "//input[@id='city']")
    WebElement txtbox_city;

    @FindBy(xpath = "//input[@id='zipcode']")
    WebElement txtbox_zipcode;

    @FindBy(xpath = "//input[@id='mobile_number']")
    WebElement txtbox_mobile_number;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    WebElement btn_create_acct;

    @FindBy(xpath = "//b[normalize-space()='Account Created!']")
    WebElement txt_confirmation_message;

    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement btn_continue;

    @FindBy(xpath = "//li[10]//a[1]")
    WebElement txt_Loggedin_message;

    @FindBy(xpath = "//a[normalize-space()='Delete Account']")
    WebElement btn_deleteaccount;

    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
    WebElement txt_deleted_message;


    //Action Methods
    public void setMaleTitle() {
        rdbutton_Male_title.click();
    }

    public void setFemaleTitle() {
        rdbutton_Female_title.click();
    }

    public void setPassword(String pwd) {
        txtbox_password.sendKeys(pwd);
    }

    public void setDrpdown_days(String days) {
        Select day = new Select(drpdown_days);
        day.selectByValue(days);
    }

    public void setDrpdown_months(String months) {
        Select day = new Select(drpdown_months);
        day.selectByVisibleText(months);
    }

    public void setDrpdown_years(String years) {
        Select day = new Select(drpdown_years);
        day.selectByVisibleText(years);
    }

    public void setFname(String Fname) {
        txtbox_first_name.sendKeys(Fname);
    }

    public void setLname(String Lname) {
        txtbox_last_name.sendKeys(Lname);
    }

    public void setCompanyname(String company) {
        txtbox_company.sendKeys(company);
    }

    public void setAddress1(String Address1) {
        txtbox_address1.sendKeys(Address1);
    }

    public void setAddress2(String Address2) {
        txtbox_address2.sendKeys(Address2);
    }

    public void setDrpdown_country(String Countries) {
        Select day = new Select(drpdown_country);
        day.selectByValue(Countries);
    }

    public void setState(String States) {
        txtbox_state.sendKeys(States);
    }

    public void setCity(String Cities) {
        txtbox_city.sendKeys(Cities);
    }

    public void setZipcode(String Zipcodes) {
        txtbox_zipcode.sendKeys(Zipcodes);
    }

    public void setMobileNumber(String MobileNumber) {
        txtbox_mobile_number.sendKeys(MobileNumber);
    }

    public void clickCreateAccount() {
        btn_create_acct.click();
    }

    public String getConfirmationMessage() {
        try {
            return (txt_confirmation_message.getText());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void clickContinue() {
        btn_continue.click();
    }

    public String getLoggedinMessage(String Fname) {
        try {
            String logintext = txt_Loggedin_message.getText();
            logintext.concat(Fname);
            return (logintext);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public  void clickDeleteAccount()
    {
        btn_deleteaccount.click();
    }
    public String getDeletedMessage() {
        try {
            return (txt_deleted_message.getText());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

