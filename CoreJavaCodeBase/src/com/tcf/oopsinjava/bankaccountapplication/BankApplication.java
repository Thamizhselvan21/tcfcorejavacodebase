package com.tcf.oopsinjava.bankaccountapplication;

public class BankApplication {
    public static void main(String[] args) {
        // Creating objects for Saving and Checking accounts
        BankAccount savingAccount = new SavingAccount("Alice", "SA123", 5000.0, 4.5);  // 4.5% interest
        BankAccount checkingAccount = new CheckingAccount("Bob", "CA123", 2000.0, 1000.0);  // 1000 overdraft limit

        // Display details and perform operations for Saving Account
        System.out.println("Saving Account:");
        savingAccount.displayAccountDetails();
        savingAccount.deposit(1500);
        savingAccount.withdraw(2000);
        savingAccount.calculateInterest();

        // Display details and perform operations for Checking Account
        System.out.println("\nChecking Account:");
        checkingAccount.displayAccountDetails();
        checkingAccount.deposit(500);
        checkingAccount.withdraw(2500);  // With overdraft
        checkingAccount.calculateInterest();
    }
}
