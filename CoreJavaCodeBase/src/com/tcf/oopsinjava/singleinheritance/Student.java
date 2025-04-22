package com.tcf.oopsinjava.singleinheritance;

public class Student extends Citizen {
    private int rollNumber;
    private String course;

    // Constructor using super
    public Student(String name, String address, String nationality, int rollNumber, String course) {
        super(name, address, nationality); // calling constructor of Citizen class
        this.rollNumber = rollNumber;
        this.course = course;
    }

    // Getters
    public int getRollNumber() {
        return rollNumber;
    }

    public String getCourse() {
        return course;
    }

    // Setters
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Display method
    public void displayStudentDetails() {
        super.displayCitizenDetails(); // display base class details
        System.out.println("Student Details:");
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Course      : " + course);
    }
}
