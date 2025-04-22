package com.tcf.oopsinjava.abstraction;

public class ShapeDemo {
    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle
        Shape circle = new Circle(5);  // Circle with radius 5
        Shape rectangle = new Rectangle(4, 6);  // Rectangle with length 4 and width 6

        // Displaying details for Circle
        System.out.println("Circle Details:");
        circle.displayShapeDetails();

        System.out.println("\nRectangle Details:");
        rectangle.displayShapeDetails();
    }
}
