package com.tcf.jdbc_EmployeeApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    // Database URL, username, and password
    private static final String DB_URL = "jdbc:mysql://localhost:3306/employee_db";
    private static final String DB_USERNAME = "root"; // Change to your MySQL username
    private static final String DB_PASSWORD = "password"; // Change to your MySQL password

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Load and register MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Database connection error: " + e.getMessage());
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}
