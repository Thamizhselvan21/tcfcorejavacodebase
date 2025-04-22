package com.tcf.oopsinjava.constructor;

public class CustomerDemo {
    public static void main(String[] args) {
        
        // Using default constructor
        Customer c1 = new Customer();
        c1.setCustomerId(1);
        c1.setName("John");
        c1.setEmail("john@example.com");
        c1.setPhone("9876543210");
        c1.setCity("Mumbai");

        // Using parameterized constructor
        Customer c2 = new Customer(2, "Asha", "asha@gmail.com", "9988776655", "Chennai");

        // Using copy constructor
        Customer c3 = new Customer(c2);

        // Print details
        System.out.println("\nCustomer 1:\n" + c1);
        System.out.println("\nCustomer 2:\n" + c2);
        System.out.println("\nCustomer 3 (Copied from Customer 2):\n" + c3);
    }
}
