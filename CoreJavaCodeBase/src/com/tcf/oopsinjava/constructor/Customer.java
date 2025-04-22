package com.tcf.oopsinjava.constructor;

public class Customer {
    
    // Fields
    private int customerId;
    private String name;
    private String email;
    private String phone;
    private String city;

    // 1. Default Constructor
    public Customer() {
        System.out.println("Default constructor called.");
    }

    // 2. Parameterized Constructor
    public Customer(int customerId, String name, String email, String phone, String city) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.city = city;
    }

    // 3. Copy Constructor
    public Customer(Customer other) {
        this.customerId = other.customerId;
        this.name = other.name;
        this.email = other.email;
        this.phone = other.phone;
        this.city = other.city;
    }

    // Getters and Setters

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // toString method
    @Override
    public String toString() {
        return "Customer Details:\n" +
               "ID     : " + customerId + "\n" +
               "Name   : " + name + "\n" +
               "Email  : " + email + "\n" +
               "Phone  : " + phone + "\n" +
               "City   : " + city;
    }
}
