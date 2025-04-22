package com.tcf.oopsinjava.encapsulation;

public class PersonDemo {
    public static void main(String[] args) {
        // Create a Person object
        Person person1 = new Person();

        // Set details using setter methods
        person1.setId(1001);
        person1.setName("Asha");
        person1.setAge(24);
        person1.setGender("Female");
        person1.setCity("Hyderabad");

        // Display details using toString()
        System.out.println(person1);
    }
}
