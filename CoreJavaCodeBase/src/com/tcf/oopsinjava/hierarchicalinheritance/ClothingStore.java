package com.tcf.oopsinjava.hierarchicalinheritance;

public class ClothingStore extends Mall {
    private String clothingBrand;
    private int numOfItems;

    // Constructor using super() to call parent class constructor
    public ClothingStore(String mallName, String location, String clothingBrand, int numOfItems) {
        super(mallName, location);  // Calling Mall constructor
        this.clothingBrand = clothingBrand;
        this.numOfItems = numOfItems;
    }

    // Getters
    public String getClothingBrand() {
        return clothingBrand;
    }

    public int getNumOfItems() {
        return numOfItems;
    }

    // Setters
    public void setClothingBrand(String clothingBrand) {
        this.clothingBrand = clothingBrand;
    }

    public void setNumOfItems(int numOfItems) {
        this.numOfItems = numOfItems;
    }

    // Display method for clothing store details
    public void displayClothingStoreDetails() {
        displayMallDetails(); // Calling base class method
        System.out.println("Clothing Brand : " + clothingBrand);
        System.out.println("Number of Items : " + numOfItems);
    }
}
