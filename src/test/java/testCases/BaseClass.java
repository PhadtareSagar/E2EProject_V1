package testCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseClass {
     WebDriver driver;
   public Logger logger; //Log4j
    @BeforeClass
    void setup() throws InterruptedException {

        logger= LogManager.getLogger(this.getClass());

        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to("https://automationexercise.com");
        driver.manage().window().maximize();

    }

    @AfterClass
    void tearDown() {
        driver.close();
    }

}
