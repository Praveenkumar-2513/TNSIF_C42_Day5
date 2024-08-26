package com.AssignmentMain.java;

import com.praveenkumar.assignment.Dveloper.java.Developer;
import com.praveenkumar.assignment.EmployeeUtilities.java.EmployeeUtilities;
import com.praveenkumar.assignment.Manager.java.Manager;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Praveen", 007, 100000, "IT");
        Developer developer = new Developer("Kumar", 006, 80000, "Java");

        EmployeeUtilities.printManagerDetails(manager);
        EmployeeUtilities.printDeveloperDetails(developer);
    }
}
