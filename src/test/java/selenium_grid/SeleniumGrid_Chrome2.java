package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.TestEnvironment;

import java.net.MalformedURLException;

public class SeleniumGrid_Chrome2 {
    WebDriver driver;

    @Test
    public void executeInAwsDocker() throws MalformedURLException {
        driver = TestEnvironment.selectTestExecutionEnvironment();
        driver.get("https://www.google.com/");
        System.out.println("Google Title: " + driver.getTitle());
        driver.quit();
    }
}
