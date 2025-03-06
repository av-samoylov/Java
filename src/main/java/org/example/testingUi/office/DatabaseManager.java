package org.example.testingUi.office;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static String url = "jdbc:h2:.\\Office";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url);
    }

    public static void setUrl(String newUrl) {
        url = newUrl;
    }
}


