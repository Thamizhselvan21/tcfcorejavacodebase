package com.tcf.oopsinjava.multilevelinheritance;

public class SmartPhone extends MobilePhone {
    private int cameraResolution;  // in megapixels
    private boolean is5GEnabled;

    // Constructor using super() to call the parent class constructor
    public SmartPhone(String brand, double price, String model, String operatingSystem, int cameraResolution, boolean is5GEnabled) {
        super(brand, price, model, operatingSystem);  // Calling constructor of MobilePhone class
        this.cameraResolution = cameraResolution;
        this.is5GEnabled = is5GEnabled;
    }

    // Getters
    public int getCameraResolution() {
        return cameraResolution;
    }

    public boolean getIs5GEnabled() {
        return is5GEnabled;
    }

    // Setters
    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public void setIs5GEnabled(boolean is5GEnabled) {
        this.is5GEnabled = is5GEnabled;
    }

    // Display method
    @Override
    public void displayDeviceDetails() {
        super.displayDeviceDetails();  // Calling base class display method
        System.out.println("Camera Resolution : " + cameraResolution + " MP");
        System.out.println("5G Enabled        : " + (is5GEnabled ? "Yes" : "No"));
    }
}
