package com.tcf.oopsinjava.hierarchicalinheritance;

public class ElectronicsStore extends Mall {
    private String brandName;
    private boolean offersWarranty;

    // Constructor using super() to call parent class constructor
    public ElectronicsStore(String mallName, String location, String brandName, boolean offersWarranty) {
        super(mallName, location);  // Calling Mall constructor
        this.brandName = brandName;
        this.offersWarranty = offersWarranty;
    }

    // Getters
    public String getBrandName() {
        return brandName;
    }

    public boolean isOffersWarranty() {
        return offersWarranty;
    }

    // Setters
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setOffersWarranty(boolean offersWarranty) {
        this.offersWarranty = offersWarranty;
    }

    // Display method for electronics store details
    public void displayElectronicsStoreDetails() {
        displayMallDetails(); // Calling base class method
        System.out.println("Brand Name       : " + brandName);
        System.out.println("Offers Warranty  : " + (offersWarranty ? "Yes" : "No"));
    }
}
