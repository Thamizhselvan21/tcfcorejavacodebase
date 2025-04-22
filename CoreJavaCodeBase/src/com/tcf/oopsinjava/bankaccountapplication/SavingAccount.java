package com.tcf.oopsinjava.bankaccountapplication;

//Concrete class for Saving Account
public class SavingAccount extends BankAccount {
 private double interestRate;  // Interest rate for the savings account

 // Constructor to initialize SavingAccount specific details
 public SavingAccount(String accountHolder, String accountNumber, double balance, double interestRate) {
     super(accountHolder, accountNumber, balance);  // Call the parent constructor
     this.interestRate = interestRate;
 }

 // Implementing the abstract method to calculate interest
 @Override
 public void calculateInterest() {
     double interest = getBalance() * interestRate / 100;
     System.out.println("Interest on Savings Account: " + interest);
 }
}
