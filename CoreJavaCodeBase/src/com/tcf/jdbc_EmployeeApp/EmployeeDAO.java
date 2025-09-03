package com.tcf.jdbc_EmployeeApp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    // CREATE Operation
    public void addEmployee(Employee employee) {
        String query = "INSERT INTO employees (id, name, department, salary) VALUES (?, ?, ?, ?)";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setString(3, employee.getDepartment());
            preparedStatement.setDouble(4, employee.getSalary());

            preparedStatement.executeUpdate();
            System.out.println("Employee added successfully.");
        } catch (SQLException e) {
            System.out.println("Error during CREATE operation: " + e.getMessage());
        }
    }

    // READ Operation
    public List<Employee> getAllEmployees() {
        String query = "SELECT * FROM employees";
        List<Employee> employeeList = new ArrayList<>();
        try (Connection connection = DBUtil.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Employee employee = new Employee(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("department"),
                        resultSet.getDouble("salary")
                );
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            System.out.println("Error during READ operation: " + e.getMessage());
        }
        return employeeList;
    }

    // UPDATE Operation
    public void updateEmployee(Employee employee) {
        String query = "UPDATE employees SET name = ?, department = ?, salary = ? WHERE id = ?";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getDepartment());
            preparedStatement.setDouble(3, employee.getSalary());
            preparedStatement.setInt(4, employee.getId());

            preparedStatement.executeUpdate();
            System.out.println("Employee updated successfully.");
        } catch (SQLException e) {
            System.out.println("Error during UPDATE operation: " + e.getMessage());
        }
    }

    // DELETE Operation
    public void deleteEmployee(int id) {
        String query = "DELETE FROM employees WHERE id = ?";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Employee deleted successfully.");
        } catch (SQLException e) {
            System.out.println("Error during DELETE operation: " + e.getMessage());
        }
    }
}
