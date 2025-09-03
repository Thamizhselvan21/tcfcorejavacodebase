package com.tcf.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);  // Duplicate, will not be added
        numbers.add(40);

        // Displaying elements
        System.out.println("Numbers Set: " + numbers);

        // Removing an element
        numbers.remove(30);
        System.out.println("After removing 30: " + numbers);

        // Checking if set contains an element
        boolean hasTwenty = numbers.contains(20);
        System.out.println("Contains 20? " + hasTwenty);

        // Checking the size of the set
        int size = numbers.size();
        System.out.println("Size of the set: " + size);

        // Checking if the set is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is the set empty? " + isEmpty);

        // Clearing the set
        numbers.clear();
        System.out.println("After clearing the set: " + numbers);
    }
}
