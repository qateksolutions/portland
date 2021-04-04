package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.TestEnvironment;

import java.net.MalformedURLException;

public class SeleniumGrid_Chrome3 {
    WebDriver driver;

    @Test
    public void executeInAwsDocker() throws MalformedURLException {
        driver = TestEnvironment.selectTestExecutionEnvironment();
        driver.get("https://www.yahoo.com/");
        System.out.println("Yahoo Title: " + driver.getTitle());
        driver.quit();
    }
}
