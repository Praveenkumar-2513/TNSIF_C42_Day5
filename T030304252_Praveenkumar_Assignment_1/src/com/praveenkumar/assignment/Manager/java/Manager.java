package com.praveenkumar.assignment.Manager.java;

import com.praveenkumar.assignment.Employee.java.Employee;

public class Manager extends Employee {
	// Additional attribute for Manager
    private String department;
    
    // Constructor
    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }
    
 // Getter and Setter methods for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

