package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid_Opera {
    WebDriver driver;
    URL gridUrl;

    @Test
    public void executeInAwsDocker() throws MalformedURLException {
        OperaOptions operaOptions = new OperaOptions();
        gridUrl = new URL("http://100.26.182.142:4444/wd/hub");
        driver = new RemoteWebDriver(gridUrl, operaOptions);
        driver.get("https://www.bbc.com/");
        System.out.println("BBC Title: " + driver.getTitle());
        driver.quit();
    }
}
