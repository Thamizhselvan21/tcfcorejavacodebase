package com.tcf.lambdaexpression;

public class LambdaWithFunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using lambda expression to implement the operation interface for addition
        Operation addition = (a, b) -> a + b;

        // Using lambda expression to implement the operation interface for multiplication
        Operation multiplication = (a, b) -> a * b;

        // Performing operations
        System.out.println("Addition result: " + addition.performOperation(5, 3));
        System.out.println("Multiplication result: " + multiplication.performOperation(5, 3));
    }
}
