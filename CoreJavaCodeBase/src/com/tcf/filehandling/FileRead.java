package com.tcf.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("output.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String line;
            System.out.println("Reading content from file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
