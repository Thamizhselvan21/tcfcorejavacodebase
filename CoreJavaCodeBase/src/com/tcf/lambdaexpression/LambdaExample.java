package com.tcf.lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        // Creating a List of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using lambda expression to iterate through the list
        System.out.println("Using Lambda to print numbers:");
        numbers.forEach(number -> System.out.println(number));
    }
}
