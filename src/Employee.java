/**
 * Employee Class
 * Represents a staff member working in the theme park.
 * Extends Person to include job-specific details.
 */
public class Employee extends Person {

    // Employee-specific instance variables
    private String jobTitle;
    private double salary;

    // Default Constructor
    public Employee() {
        super(); // Initialize Person part
        this.jobTitle = "Staff";
        this.salary = 0.0;
    }

    // Parameterized Constructor
    public Employee(String id, String name, int age, String jobTitle, double salary) {
        super(id, name, age); // Pass details to Person class
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getters and Setters

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        // Check salary validity
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }
}
