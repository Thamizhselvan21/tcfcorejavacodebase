package com.tcf.oopsinjava.multilevelinheritance;

public class MobilePhone extends Device {
    private String model;
    private String operatingSystem;

    // Constructor using super() to call the parent class constructor
    public MobilePhone(String brand, double price, String model, String operatingSystem) {
        super(brand, price);  // Calling constructor of Device class
        this.model = model;
        this.operatingSystem = operatingSystem;
    }

    // Getters
    public String getModel() {
        return model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    // Setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    // Display method
    @Override
    public void displayDeviceDetails() {
        super.displayDeviceDetails(); // Calling base class display method
        System.out.println("Model             : " + model);
        System.out.println("Operating System  : " + operatingSystem);
    }
}
