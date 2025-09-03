package com.tcf.jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class JDBCExample {
    public static void main(String[] args) {
        // Establish database connection using DBUtil
        Connection connection = DBUtil.getConnection();

        if (connection != null) {
            try {
                // Create a Statement to execute SQL queries
                Statement statement = connection.createStatement();

                // SQL query to fetch data from a table
                String query = "SELECT * FROM your_table_name"; // Change to your table

                // Execute the query and get the result
                ResultSet resultSet = statement.executeQuery(query);

                // Iterate through the result set and display data
                while (resultSet.next()) {
                    int id = resultSet.getInt("id"); // Replace with your column name
                    String name = resultSet.getString("name"); // Replace with your column name
                    System.out.println("ID: " + id + ", Name: " + name);
                }

                // Close the result set and statement
                resultSet.close();
                statement.close();
            } catch (SQLException e) {
                System.out.println("SQL error: " + e.getMessage());
            } finally {
                // Close the connection
                DBUtil.closeConnection(connection);
            }
        }
    }
}
