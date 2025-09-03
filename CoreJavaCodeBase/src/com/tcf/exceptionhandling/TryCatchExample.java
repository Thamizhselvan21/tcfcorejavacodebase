package com.tcf.exceptionhandling;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int number = 10 / 0; // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        }

        System.out.println("Program continues after try-catch block.");
    }
}
