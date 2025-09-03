package com.tcf.lambdaexpression;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using lambda expression to implement the functional interface
        MyFunctionalInterface hello = (name) -> {
            System.out.println("Hello, " + name + "!");
        };

        // Calling the abstract method
        hello.sayHello("John");

        // Calling the default method
        hello.sayGoodbye();
    }
}
