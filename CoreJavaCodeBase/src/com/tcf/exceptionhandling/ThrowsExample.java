package com.tcf.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsExample {
    // Method declares that it might throw IOException
    public static void readData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name = reader.readLine();
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        try {
            readData(); // Handling the exception here
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
