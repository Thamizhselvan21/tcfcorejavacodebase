package com.tcf.oopsinjava.singleinheritance;

public class SlinheritanceDemo {
	    public static void main(String[] args) {
	        // Creating a student object using constructor
	        Student student = new Student("Karthik", "Chennai", "Indian", 101, "Computer Science");

	        // Displaying all details
	        student.displayStudentDetails();

	        // Example use of getter
	        System.out.println("\nAccessing values using getters:");
	        System.out.println("Name   : " + student.getName());
	        System.out.println("Course : " + student.getCourse());
	    }
	}


