package com.tcf.jdbc_EmployeeApp;

import java.util.List;

public class EmployeeApp {

    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO();

        // CREATE - Add Employees
        employeeDAO.addEmployee(new Employee(1, "John Doe", "Engineering", 50000));
        employeeDAO.addEmployee(new Employee(2, "Jane Smith", "HR", 45000));

        // READ - Get all Employees
        List<Employee> employees = employeeDAO.getAllEmployees();
        System.out.println("All Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // UPDATE - Update an Employee
        Employee updatedEmployee = new Employee(1, "Johnathan Doe", "Engineering", 55000);
        employeeDAO.updateEmployee(updatedEmployee);

        // DELETE - Delete an Employee
        employeeDAO.deleteEmployee(2);

        // READ again to see updated records
        employees = employeeDAO.getAllEmployees();
        System.out.println("All Employees after update and delete:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
