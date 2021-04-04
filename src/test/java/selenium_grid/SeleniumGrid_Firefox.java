package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.TestEnvironment;

import java.net.MalformedURLException;

public class SeleniumGrid_Firefox {
    WebDriver driver;

    @Test
    public void executeInAwsDocker() throws MalformedURLException {
        driver = TestEnvironment.selectTestExecutionEnvironment();
        driver.get("https://www.cnn.com/");
        System.out.println("CNN Title: " + driver.getTitle());
        driver.quit();
    }
}
