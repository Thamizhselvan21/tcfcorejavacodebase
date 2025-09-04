package com.tcf.oopsinjava.methodoverloading;

public class PatientDemo {
    public static void main(String[] args) {

        Patient p1 = new Patient();
        p1.registerPatient(101, "Anu");
        System.out.println(p1);

        Patient p2 = new Patient();
        p2.registerPatient(102, "Rahul", 45);
        System.out.println(p2);

        Patient p3 = new Patient();
        p3.registerPatient(103, "Neha", 30, "Female", "Fever");
        System.out.println(p3);
    }
}
