package automation_test.parameterized;

import command_providers.ActOn;
import io.github.bonigarcia.wdm.WebDriverManager;
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
import utilities.SqlConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CalculateMonthlyMortgageParameterized {
    WebDriver driver;
    private static final Logger LOGGER = LogManager.getLogger(CalculateMonthlyMortgageParameterized.class);

    @BeforeMethod
    public void openBrowser() {
        String url = ReadConfigFiles.getPropertyValues("Url");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        LOGGER.info("--------Test: CalculateMortgageRate------------");
        LOGGER.debug("Open the URL: " + url);
        ActOn.browser(driver).openBrowser(url);
    }

    @Test
    public void calculateMortgage() throws SQLException {
        ResultSet rs = SqlConnector.readData("Select * from monthly_mortgage");
        String[] date = DateUtils.returnNextMonth().split("-");
        while (rs.next()) {
            new Home(driver)
                    .typeHomePrice(rs.getString("homevalue"))
                    .typeDownPayment(rs.getString("downpayment"))
                    .clickDownPaymentInDollar()
                    .typeLoanAmount(rs.getString("loanamount"))
                    .typeInterestRate(rs.getString("interestrate"))
                    .typeLoanTermYears(rs.getString("loanterm"))
                    .selectMonth(date[0])
                    .typeYear(date[1])
                    .typePropertyTax(rs.getString("propertytax"))
                    .typePMI(rs.getString("pmi"))
                    .typeHomeOwnerInsurance(rs.getString("homeownerinsurance"))
                    .typeMonthlyHoa(rs.getString("monthlyhoa"))
                    .selectLoanType(rs.getString("loantype"))
                    .selectBuyOrRefinance(rs.getString("buyorrefi"))
                    .clickOnCalculateButton()
                    .validateTotalMonthlyPayment(rs.getString("totalmonthlypayment"));
        }
    }

    @AfterMethod
    public void closeBrowser() {
        LOGGER.info("--------Test End: CalculateMortgageRate------------");
        ActOn.browser(driver).closeBrowser();
    }
}

