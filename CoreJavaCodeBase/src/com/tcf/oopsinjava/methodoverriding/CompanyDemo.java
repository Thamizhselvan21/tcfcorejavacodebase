package com.tcf.oopsinjava.methodoverriding;

public class CompanyDemo{
    public static void main(String[] args) {
        
        // Creating different types of employees
        Employee emp1 = new Manager(1, "Asha", 90000, "HR");
        Employee emp2 = new Developer(2, "Rahul", 80000, "Java");

        // Method overriding in action
        System.out.println("--- Manager Info ---");
        emp1.displayDetails();  // Manager version of displayDetails()

        System.out.println("\n--- Developer Info ---");
        emp2.displayDetails();  // Developer version of displayDetails()
    }
}
