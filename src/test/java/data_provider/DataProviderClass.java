package data_provider;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider(name = "RealAprRates")
    public Object[][] storeRealAprRates() {
        return new Object[][] {
                {"200000", "15000", "3", "3.130%"}
        };
    }

}
