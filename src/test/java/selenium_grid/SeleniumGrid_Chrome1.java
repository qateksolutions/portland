package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid_Chrome1 {
    WebDriver driver;
    URL gridUrl;

    @Test
    public void executeInAwsDocker() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        gridUrl = new URL("http://100.26.182.142:4444/wd/hub");
        driver = new RemoteWebDriver(gridUrl, chromeOptions);
        driver.get("https://www.mortgagecalculator.org/");
        System.out.println("Mortgage Calculator Title: " + driver.getTitle());
        driver.quit();
    }
}
