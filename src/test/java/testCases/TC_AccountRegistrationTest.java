package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.AccountRegistrationPage;
import pageObjects.SignupPage;

public class TC_AccountRegistrationTest extends BaseClass
{
    @Test
    void verify_account_registration() throws InterruptedException
    {

                    SignupPage sn = new SignupPage(driver);
                    sn.clickSignupLogin();
                    sn.setUsername("TestSam");
                    sn.setEmail("TestSam789@gmail.com");
                    sn.clickSignup();
                    AccountRegistrationPage an = new AccountRegistrationPage(driver);
                    an.setMaleTitle();
                    an.setPassword("Test@789");
                    an.setDrpdown_days("1");
                    an.setDrpdown_months("March");
                    an.setDrpdown_years("1985");
                    an.setFname("Sam");
                    an.setLname("Test");
                    an.setCompanyname("Test Company Name");
                    an.setAddress1("LondonSquare");
                    an.setAddress2("MJ street");
                    an.setDrpdown_country("India");
                    an.setState("Maharashtra");
                    an.setCity("Pune");
                    an.setZipcode("411085");
                    an.setMobileNumber("1234567890");
                    an.clickCreateAccount();

                    SoftAssert sa = new SoftAssert();
                    Thread.sleep(2000);
                    sa.assertEquals(an.getConfirmationMessage(), "ACCOUNT CREATED!", "Account creation sucessful");
                    an.clickContinue();
                    Thread.sleep(2000);
                    sa.assertEquals(an.getLoggedinMessage("TestSam"), "Logged in as TestSam");
                    an.clickDeleteAccount();
                    Thread.sleep(2000);
                    sa.assertEquals(an.getDeletedMessage(), "ACCOUNT DELETED!", "Account creation deleted");
                    sa.assertAll();
                    an.clickContinue();
            }

        }

