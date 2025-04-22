package com.tcf.oopsinjava.abstraction;

//Abstract class for Shape
public abstract class Shape {
 // Abstract method for calculating area
 public abstract double calculateArea();

 // Abstract method for calculating perimeter
 public abstract double calculatePerimeter();

 // Method to display shape details
 public void displayShapeDetails() {
     System.out.println("Area: " + calculateArea());
     System.out.println("Perimeter: " + calculatePerimeter());
 }
}
