package com.tcf.oopsinjava.multilevelinheritance;

public class Device {
    private String brand;
    private double price;

    // Constructor
    public Device(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    // Getters
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Display method
    public void displayDeviceDetails() {
        System.out.println("Device Details:");
        System.out.println("Brand   : " + brand);
        System.out.println("Price   : " + price);
    }
}

