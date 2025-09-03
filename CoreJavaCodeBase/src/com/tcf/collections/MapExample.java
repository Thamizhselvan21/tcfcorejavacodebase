package com.tcf.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        // Adding key-value pairs
        students.put(1, "John");
        students.put(2, "Alice");
        students.put(3, "Bob");

        // Displaying the map
        System.out.println("Students Map: " + students);

        // Accessing value by key
        System.out.println("Student with ID 2: " + students.get(2));

        // Updating a value
        students.put(2, "Alicia");
        System.out.println("After updating ID 2: " + students);

        // Removing a key-value pair
        students.remove(3);
        System.out.println("After removing ID 3: " + students);

        // Checking if a key exists
        boolean hasId1 = students.containsKey(1);
        System.out.println("Contains key 1? " + hasId1);

        // Checking if a value exists
        boolean hasValueBob = students.containsValue("Bob");
        System.out.println("Contains value 'Bob'? " + hasValueBob);

        // Checking the size of the map
        int size = students.size();
        System.out.println("Size of the map: " + size);

        // Checking if the map is empty
        boolean isEmpty = students.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);

        // Clearing the map
        students.clear();
        System.out.println("After clearing the map: " + students);
    }
}
