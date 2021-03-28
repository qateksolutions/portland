package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

public class SqlConnector {
    private static final Logger LOGGER = LogManager.getLogger(SqlConnector.class);
    private static final String Url = "jdbc:postgresql://localhost:5432/mortgage_calculator";

    private static Connection dbConnect() {
        String user = ReadConfigFiles.getPropertyValues("DbUser");
        LOGGER.debug("DB User Name: " + user);
        String password = ReadConfigFiles.getPropertyValues("DbPassword");
        LOGGER.debug("DB User Password: " + password);

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(Url, user, password);
        } catch (SQLException e) {
            LOGGER.error("SQL Connection exception: " + e.getMessage());
        }
        return conn;
    }

    public static ResultSet readData(String SQL) {
        ResultSet rs = null;
        try {
            Connection conn = dbConnect();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(SQL);
        } catch (SQLException e) {
            LOGGER.error("SQL ResultSet exception: " + e.getMessage());
        }
        return rs;
    }
}
