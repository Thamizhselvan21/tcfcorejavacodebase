package com.tcf.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt"); // Creates or overwrites output.txt
            writer.write("Hello, this is a file writing example.\n");
            writer.write("We are learning Java File Handling!");
            writer.close();
            System.out.println("Data successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
