package automation_test.mortgage_calculator;

import listeners.BaseClass;
import listeners.RetryFailedTests;
import org.testng.annotations.Test;
import page_objects.Home;

public class CalculateRates extends BaseClass {
    @Test(retryAnalyzer = RetryFailedTests.class)
    public void calculateRealApr() {
        new Home(driver)
                .mouseHoverToRates()
                .navigateToRealApr()
                .typeHomePrice("200000")
                .typeDownPayment("15000")
                .selectDownPaymentInDollar()
                .typeInterestRate("3")
                .clickOnCalculateButton()
                .validateAprRate("3.130%");
    }
}
