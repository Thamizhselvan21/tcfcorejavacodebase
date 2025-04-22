package com.tcf.oopsinjava.bankaccountapplication;

//Abstract class for Bank Account
public abstract class BankAccount {
 private String accountHolder;
 private String accountNumber;
 private double balance;

 // Constructor to initialize the account details
 public BankAccount(String accountHolder, String accountNumber, double balance) {
     this.accountHolder = accountHolder;
     this.accountNumber = accountNumber;
     this.balance = balance;
 }

 // Getter methods for encapsulation
 public String getAccountHolder() {
     return accountHolder;
 }

 public String getAccountNumber() {
     return accountNumber;
 }

 public double getBalance() {
     return balance;
 }

 // Method to deposit money into the account
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: " + amount);
     } else {
         System.out.println("Amount must be positive");
     }
 }

 // Method to withdraw money from the account
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrew: " + amount);
     } else {
         System.out.println("Insufficient balance");
     }
 }

 // Abstract method to calculate interest (if any)
 public abstract void calculateInterest();

 // Method to display account details
 public void displayAccountDetails() {
     System.out.println("Account Holder: " + accountHolder);
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Current Balance: " + balance);
 }
}
