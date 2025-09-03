package com.tcf.studentmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    private List<Student> students = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        Student student = new Student(id, name, course);
        students.add(student);
        System.out.println("Student added successfully!\n");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.\n");
            return;
        }

        System.out.println("Student List:");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
    }

    public void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = scanner.nextInt();

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Student Found: " + s + "\n");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.\n");
    }

    public void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = scanner.nextInt();

        Student studentToDelete = null;
        for (Student s : students) {
            if (s.getId() == id) {
                studentToDelete = s;
                break;
            }
        }

        if (studentToDelete != null) {
            students.remove(studentToDelete);
            System.out.println("Student deleted successfully!\n");
        } else {
            System.out.println("Student with ID " + id + " not found.\n");
        }
    }

    public void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new course: ");
                String newCourse = scanner.nextLine();
                s.setName(newName);
                s.setCourse(newCourse);
                System.out.println("Student updated successfully!\n");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.\n");
    }
}
