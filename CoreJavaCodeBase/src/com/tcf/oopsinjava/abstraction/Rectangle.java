package com.tcf.oopsinjava.abstraction;

//Concrete class for Rectangle
public class Rectangle extends Shape {
 private double length;
 private double width;

 // Constructor to initialize the length and width of the rectangle
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Implementing the abstract method to calculate area
 @Override
 public double calculateArea() {
     return length * width;  // Area of rectangle: length * width
 }

 // Implementing the abstract method to calculate perimeter
 @Override
 public double calculatePerimeter() {
     return 2 * (length + width);  // Perimeter of rectangle: 2 * (length + width)
 }
}
