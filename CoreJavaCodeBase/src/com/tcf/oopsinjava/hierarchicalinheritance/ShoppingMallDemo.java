package com.tcf.oopsinjava.hierarchicalinheritance;

public class ShoppingMallDemo {
	    public static void main(String[] args) {
	        // Creating objects of different stores
	        ClothingStore clothingStore = new ClothingStore("Super Mall", "Downtown", "Nike", 200);
	        FoodCourt foodCourt = new FoodCourt("Super Mall", "Downtown", "Indian Cuisine", 150);
	        ElectronicsStore electronicsStore = new ElectronicsStore("Super Mall", "Downtown", "Samsung", true);

	        // Displaying details of each store
	        System.out.println("Clothing Store Details:");
	        clothingStore.displayClothingStoreDetails();
	        System.out.println("\nFood Court Details:");
	        foodCourt.displayFoodCourtDetails();
	        System.out.println("\nElectronics Store Details:");
	        electronicsStore.displayElectronicsStoreDetails();
	    }
	}


