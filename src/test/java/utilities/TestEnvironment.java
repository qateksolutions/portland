package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class TestEnvironment {
    private static WebDriver driver;
    private static URL awsEc2Instance;
    private static final Logger LOGGER = LogManager.getLogger(TestEnvironment.class);

    public static WebDriver selectTestExecutionEnvironment() {
        String environment = System.getProperty("environment") == null ? "local" : System.getProperty("environment");
        String browser = System.getProperty("browser") == null ? "chrome" : System.getProperty("browser");

        try {
            awsEc2Instance = new URL("");
        } catch (Exception e) {
            LOGGER.error("AWS Instant Exception is: " + e.getMessage());
        }

        if (environment.equals("remote") && browser.equals("chrome")) {
            LOGGER.info("Executing test in remote with chrome headless browser");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("headless");
            driver = new RemoteWebDriver(awsEc2Instance, chromeOptions);
        } else {
            LOGGER.info("Executing test in local with chrome browser");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        return driver;
    }
}
