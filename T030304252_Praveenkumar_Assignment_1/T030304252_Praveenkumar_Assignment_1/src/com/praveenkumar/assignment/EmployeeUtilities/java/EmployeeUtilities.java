package com.praveenkumar.assignment.EmployeeUtilities.java;

import com.praveenkumar.assignment.Dveloper.java.Developer;
import com.praveenkumar.assignment.Employee.java.Employee;
import com.praveenkumar.assignment.Manager.java.Manager;


 // Provides utility methods for working with employees.

public class EmployeeUtilities {
    
    //  Prints employee details.
     
    public static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }

    //Prints manager details
    public static void printManagerDetails(Manager manager) {
        printEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());
    }

    //Prints developer details
    public static void printDeveloperDetails(Developer developer) {
        printEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}
