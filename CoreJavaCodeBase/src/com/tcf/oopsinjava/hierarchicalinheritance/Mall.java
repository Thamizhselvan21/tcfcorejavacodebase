package com.tcf.oopsinjava.hierarchicalinheritance;

public class Mall {
    private String mallName;
    private String location;

    // Constructor
    public Mall(String mallName, String location) {
        this.mallName = mallName;
        this.location = location;
    }

    // Getters
    public String getMallName() {
        return mallName;
    }

    public String getLocation() {
        return location;
    }

    // Setters
    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Display method for common mall details
    public void displayMallDetails() {
        System.out.println("Mall Name   : " + mallName);
        System.out.println("Location    : " + location);
    }
}
