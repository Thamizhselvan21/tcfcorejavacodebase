package com.tcf.oopsinjava.multilevelinheritance;

public class PhoneDemo {
    public static void main(String[] args) {
        // Creating an object of SmartPhone class
        SmartPhone smartPhone = new SmartPhone("Apple", 999.99, "iPhone 14 Pro", "iOS", 12, true);

        // Displaying all details using overridden method
        smartPhone.displayDeviceDetails();
    }
}
