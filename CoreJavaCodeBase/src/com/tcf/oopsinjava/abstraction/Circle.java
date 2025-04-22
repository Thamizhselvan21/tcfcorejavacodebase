package com.tcf.oopsinjava.abstraction;

//Concrete class for Circle
public class Circle extends Shape {
 private double radius;

 // Constructor to initialize the radius of the circle
 public Circle(double radius) {
     this.radius = radius;
 }

 // Implementing the abstract method to calculate area
 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;  // Area of circle: π * r^2
 }

 // Implementing the abstract method to calculate perimeter
 @Override
 public double calculatePerimeter() {
     return 2 * Math.PI * radius;  // Perimeter of circle: 2 * π * r
 }
}
