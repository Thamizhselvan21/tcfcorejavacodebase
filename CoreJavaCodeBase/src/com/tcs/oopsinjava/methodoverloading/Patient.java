package com.tcs.oopsinjava.methodoverloading;

public class Patient {

    // Fields
    private int patientId;
    private String name;
    private int age;
    private String gender;
    private String disease;

    // Getter and Setter methods
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    // Method Overloading: registerPatient()

    // Method 1: Register with ID and name
    public void registerPatient(int id, String name) {
        this.patientId = id;
        this.name = name;
        System.out.println("Patient registered with ID and Name.");
    }

    // Method 2: Register with ID, name, and age
    public void registerPatient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
        System.out.println("Patient registered with ID, Name, and Age.");
    }

    // Method 3: Register with all details
    public void registerPatient(int id, String name, int age, String gender, String disease) {
        this.patientId = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.disease = disease;
        System.out.println("Patient registered with full details.");
    }

    // Display method
    public String toString() {
        return "Patient Details:\n" +
               "ID      : " + patientId + "\n" +
               "Name    : " + name + "\n" +
               "Age     : " + age + "\n" +
               "Gender  : " + gender + "\n" +
               "Disease : " + disease;
    }
}
