package com.tcf.exceptionhandling;

public class FinallyExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Index out of bounds.");
        } finally {
            System.out.println("Finally block always executes.");
        }

        System.out.println("Program continues after try-catch-finally block.");
    }
}
