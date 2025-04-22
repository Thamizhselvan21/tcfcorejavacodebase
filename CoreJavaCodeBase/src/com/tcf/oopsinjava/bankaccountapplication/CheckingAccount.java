package com.tcf.oopsinjava.bankaccountapplication;

//Concrete class for Checking Account
public class CheckingAccount extends BankAccount {
 private double overdraftLimit;  // Overdraft limit for the checking account

 // Constructor to initialize CheckingAccount specific details
 public CheckingAccount(String accountHolder, String accountNumber, double balance, double overdraftLimit) {
     super(accountHolder, accountNumber, balance);  // Call the parent constructor
     this.overdraftLimit = overdraftLimit;
 }

 // Implementing the abstract method to calculate interest (no interest for CheckingAccount)
 @Override
 public void calculateInterest() {
     System.out.println("Checking Account does not earn interest.");
 }

 // Overriding the withdraw method to support overdraft
 @Override
 public void withdraw(double amount) {
     if (amount <= getBalance() + overdraftLimit) {
         double newBalance = getBalance() - amount;
         System.out.println("Withdrew: " + amount + ", New Balance: " + newBalance);
     } else {
         System.out.println("Exceeded overdraft limit");
     }
 }
}
