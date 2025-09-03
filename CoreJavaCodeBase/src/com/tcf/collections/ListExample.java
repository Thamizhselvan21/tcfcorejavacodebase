package com.tcf.collections;
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Displaying elements
        System.out.println("Fruits List: " + fruits);

        // Accessing element
        System.out.println("First fruit: " + fruits.get(0));

        // Adding element at specific index
        fruits.add(1, "Grapes");
        System.out.println("After adding 'Grapes' at index 1: " + fruits);

        // Updating element at specific index
        fruits.set(2, "Pineapple");
        System.out.println("After setting 'Pineapple' at index 2: " + fruits);

        // Removing element by index
        fruits.remove(3);
        System.out.println("After removing element at index 3: " + fruits);

        // Removing element by value
        fruits.remove("Apple");
        System.out.println("After removing 'Apple': " + fruits);

        // Checking if list contains an element
        boolean hasBanana = fruits.contains("Banana");
        System.out.println("Contains 'Banana'? " + hasBanana);

        // Getting the size of the list
        int size = fruits.size();
        System.out.println("Size of the list: " + size);

        // Checking if the list is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);

        // Clearing the list
        fruits.clear();
        System.out.println("After clearing the list: " + fruits);
    }
}
