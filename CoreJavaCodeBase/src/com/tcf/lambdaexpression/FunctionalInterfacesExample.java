package com.tcf.lambdaexpression;

import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalInterfacesExample {
    public static void main(String[] args) {
        // Predicate: Test if a number is even
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // Consumer: Print a message
        Consumer<String> greet = message -> System.out.println("Hello, " + message);
        greet.accept("John");

        // Function: Convert a number to its square
        Function<Integer, Integer> square = n -> n * n;
        System.out.println("Square of 5: " + square.apply(5));
    }
}
