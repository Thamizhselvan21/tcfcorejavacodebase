package com.tcf.oopsinjava.hierarchicalinheritance;

public class FoodCourt extends Mall {
    private String foodType;
    private int seatingCapacity;

    // Constructor using super() to call parent class constructor
    public FoodCourt(String mallName, String location, String foodType, int seatingCapacity) {
        super(mallName, location);  // Calling Mall constructor
        this.foodType = foodType;
        this.seatingCapacity = seatingCapacity;
    }

    // Getters
    public String getFoodType() {
        return foodType;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    // Setters
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    // Display method for food court details
    public void displayFoodCourtDetails() {
        displayMallDetails(); // Calling base class method
        System.out.println("Food Type      : " + foodType);
        System.out.println("Seating Capacity : " + seatingCapacity);
    }
}
