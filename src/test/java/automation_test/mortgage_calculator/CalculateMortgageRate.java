package automation_test.mortgage_calculator;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
import listeners.LoggerForParallelTests;
import listeners.RetryFailedTests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page_objects.Home;
import utilities.DateUtils;
import utilities.ReadConfigFiles;

public class CalculateMortgageRate extends LoggerForParallelTests {
    WebDriver driver;
    private static final Logger LOGGER = LogManager.getLogger(CalculateMortgageRate.class);

    @BeforeMethod
    public void openBrowser() {
        String url = ReadConfigFiles.getPropertyValues("Url");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        LOGGER.info("--------Test: CalculateMortgageRate------------");
        LOGGER.debug("Open the URL: " + url);
        ActOn.browser(driver).openBrowser(url);
    }

    @Test(retryAnalyzer = RetryFailedTests.class)
    public void calculateMortgage() {
        String[] date = DateUtils.returnNextMonth().split("-");
        new Home(driver)
                .typeHomePrice("300000")
                .typeDownPayment("60000")
                .clickDownPaymentInDollar()
                .typeLoanAmount("240000")
                .typeInterestRate("3")
                .typeLoanTermYears("30")
                .selectMonth(date[0])
                .typeYear(date[1])
                .typePropertyTax("5000")
                .typePMI("0.5")
                .typeHomeOwnerInsurance("1000")
                .typeMonthlyHoa("100")
                .selectLoanType("FHA")
                .selectBuyOrRefinance("Buy")
                .clickOnCalculateButton()
                .validateTotalMonthlyPayment("$1,611.85");
    }

    @AfterMethod
    public void closeBrowser() {
        ActOn.browser(driver).closeBrowser();
        LOGGER.info("--------Test End: CalculateMortgageRate------------");
    }
}
