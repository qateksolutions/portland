package automation_test.testng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import data_provider.DataProviderClass;
import utilities.ReadConfigFiles;
import utilities.SqlConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestNgMavenExampleTest {
    private static final Logger LOGGER = LogManager.getLogger(TestNgMavenExampleTest.class);

    @Test
    public void run() {
        LOGGER.debug("This is a debug message");
        LOGGER.info("This is info message");
        LOGGER.warn("This is a warning");
        LOGGER.error("This is a error");
        LOGGER.fatal("This is dangerous");
    }

    public void testPropertyFile() {
        String dbUser = ReadConfigFiles.getPropertyValues("DbUser");
        System.out.println("Database User: " + dbUser);
    }

    public void testDatabaseValues() throws SQLException {
        ResultSet resultSet = SqlConnector.readData("Select * from monthly_mortgage");
        while (resultSet.next()) {
            System.out.println("Home Price: " + resultSet.getString("homevalue"));
            System.out.println("Down Payment: " + resultSet.getString("downpayment"));
        }
    }

    //@Test(dataProvider = "MultipleValues", dataProviderClass = DataProviderClass.class)
    public void readMultipleValues(String name, String state, int zipCode) {
        System.out.println("Name is: " + name);
        System.out.println("State name is: " + state);
        System.out.println("Zip Code is: " + zipCode);
    }

}
