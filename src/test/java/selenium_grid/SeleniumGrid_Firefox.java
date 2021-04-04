package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid_Firefox {
    WebDriver driver;
    URL gridUrl;

    @Test
    public void executeInAwsDocker() throws MalformedURLException {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        gridUrl = new URL("http://100.26.182.142:4444/wd/hub");
        driver = new RemoteWebDriver(gridUrl, firefoxOptions);
        driver.get("https://www.cnn.com/");
        System.out.println("CNN Title: " + driver.getTitle());
        driver.quit();
    }
}
