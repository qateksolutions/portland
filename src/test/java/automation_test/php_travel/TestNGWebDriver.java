package automation_test.php_travel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGWebDriver {
    private static final Logger LOGGER = LogManager.getLogger(TestNGWebDriver.class);
    WebDriver driver;

    @BeforeMethod
    public void browserInitialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        LOGGER.info("------Test Case: PHP TRAVEL---------");
        driver.get("https://phptravels.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void verifyHomePageTitle() {
        String title = "PHPTRAVELS booking script and system for hotels airline flights tours cars online application - PHPTRAVELS";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, title);
    }

    @AfterMethod
    public void closeBrowser() {
        LOGGER.info("------End Test Case: PHP TRAVEL---------");
        driver.quit();
    }
}
