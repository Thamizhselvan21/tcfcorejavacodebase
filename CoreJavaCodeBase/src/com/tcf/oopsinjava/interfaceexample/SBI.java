package com.tcf.oopsinjava.interfaceexample;

//Concrete class for SBI Bank implementing the Bank interface
public class SBI implements Bank {
 // Implementing the rateOfInterest method for SBI
 @Override
 public double rateOfInterest() {
     return 7.5;  // SBI has an interest rate of 7.5%
 }
}
