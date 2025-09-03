package com.tcf.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsExample {
    public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Using filter, map, and reduce in a single pipeline
        Optional<Integer> result = numbers.stream()
                                          .filter(n -> n % 2 == 0) // Filter even numbers
                                          .map(n -> n * n)          // Square the numbers
                                          .reduce((a, b) -> a + b); // Sum all the squared numbers

        // If result is present, print it
        result.ifPresent(r -> System.out.println("Sum of squares of even numbers: " + r));
        
        // Other operations separately for demonstration
        
        // Using map to square each number
        List<Integer> squaredNumbers = numbers.stream()
                                               .map(n -> n * n)
                                               .collect(java.util.stream.Collectors.toList());
        System.out.println("Squared Numbers: " + squaredNumbers);
        
        // Using filter to get even numbers
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(java.util.stream.Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);
        
        // Using reduce to calculate the sum of numbers
        Optional<Integer> sum = numbers.stream()
                                       .reduce((a, b) -> a + b);
        sum.ifPresent(s -> System.out.println("Sum: " + s));
    }
}
