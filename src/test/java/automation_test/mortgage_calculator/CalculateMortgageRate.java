package automation_test.mortgage_calculator;

import listeners.BaseClass;
import listeners.RetryFailedTests;
import org.testng.annotations.Test;
import page_objects.Home;
import utilities.DateUtils;

public class CalculateMortgageRate extends BaseClass {
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
}
