package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import utilities.TestEnvironment;

import java.net.MalformedURLException;

public class SeleniumGrid_Edge {
    WebDriver driver;

    @Test
    public void executeInAwsDocker() throws MalformedURLException {
        driver = TestEnvironment.selectTestExecutionEnvironment();
        driver.get("https://www.espn.com/");
        System.out.println("ESPN Title: " + driver.getTitle());
        driver.quit();
    }
}
