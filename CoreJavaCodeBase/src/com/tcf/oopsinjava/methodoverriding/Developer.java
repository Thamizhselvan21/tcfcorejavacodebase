package com.tcf.oopsinjava.methodoverriding;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(int id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding the displayDetails method
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language : " + programmingLanguage);
    }
}
