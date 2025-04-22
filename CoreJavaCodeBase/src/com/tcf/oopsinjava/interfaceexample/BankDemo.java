package com.tcf.oopsinjava.interfaceexample;

public class BankDemo {
    public static void main(String[] args) {
        // Creating objects of different bank types
        Bank sbiBank = new SBI();  // SBI Bank object
        Bank hdfcBank = new HDFC();  // HDFC Bank object

        // Displaying the rate of interest for each bank
        System.out.println("SBI Bank Rate of Interest: " + sbiBank.rateOfInterest() + "%");
        System.out.println("HDFC Bank Rate of Interest: " + hdfcBank.rateOfInterest() + "%");
    }
}
