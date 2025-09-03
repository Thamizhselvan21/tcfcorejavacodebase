package com.tcf.jdbc_crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_CRUD_Operations {

    // CREATE Operation (Insert a new record)
    public void create(int id, String name) {
        String query = "INSERT INTO your_table_name (id, name) VALUES (?, ?)";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            // Set the values in the query
            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);

            // Execute the query
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Inserted " + rowsAffected + " row(s).");

        } catch (SQLException e) {
            System.out.println("Error during INSERT operation: " + e.getMessage());
        }
    }

    // READ Operation (Fetch records from the table)
    public void read() {
        String query = "SELECT * FROM your_table_name";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            // Iterate through the result set and print each record
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

        } catch (SQLException e) {
            System.out.println("Error during SELECT operation: " + e.getMessage());
        }
    }

    // UPDATE Operation (Update an existing record)
    public void update(int id, String newName) {
        String query = "UPDATE your_table_name SET name = ? WHERE id = ?";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            // Set the new values in the query
            preparedStatement.setString(1, newName);
            preparedStatement.setInt(2, id);

            // Execute the update
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Updated " + rowsAffected + " row(s).");

        } catch (SQLException e) {
            System.out.println("Error during UPDATE operation: " + e.getMessage());
        }
    }

    // DELETE Operation (Delete a record from the table)
    public void delete(int id) {
        String query = "DELETE FROM your_table_name WHERE id = ?";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            // Set the ID to delete
            preparedStatement.setInt(1, id);

            // Execute the delete
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println("Deleted " + rowsAffected + " row(s).");

        } catch (SQLException e) {
            System.out.println("Error during DELETE operation: " + e.getMessage());
        }
    }

    
}
