package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGrid_Edge {
    WebDriver driver;
    URL gridUrl;

    @Test
    public void executeInAwsDocker() throws MalformedURLException {
        EdgeOptions edgeOptions = new EdgeOptions();
        gridUrl = new URL("http://100.26.182.142:4444/wd/hub");
        driver = new RemoteWebDriver(gridUrl, edgeOptions);
        driver.get("https://www.espn.com/");
        System.out.println("ESPN Title: " + driver.getTitle());
        driver.quit();
    }
}
