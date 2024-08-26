package com.Assignment2.Question2;

class Student {
    Student() {
        System.out.println("Student object is created");
    }
}

class Commission {
    String Name;
    String Address;
    String Phone;
    double Sales_amount;
    double commission;

    void acceptDetails(String Name, String Address, String Phone, double Sales_amount) {
        this.Name = Name;
        this.Address = Address;
        this.Phone = Phone;
        this.Sales_amount = Sales_amount;
    }

    void calculateCommission() {
        if (Sales_amount >= 100000) {
            commission = Sales_amount * 0.10;
        } else if (Sales_amount >= 50000 && Sales_amount < 100000) {
            commission = Sales_amount * 0.05;
        } else if (Sales_amount >= 30000 && Sales_amount < 50000) {
            commission = Sales_amount * 0.03;
        } else {
            commission = 0;
        }
    }

    void displayDetails() {
        System.out.println("Name: " + Name);
        System.out.println("Address: " + Address);
        System.out.println("Phone: " + Phone);
        System.out.println("Sales Amount: " + Sales_amount);
        System.out.println("Commission: " + commission);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student student = new Student();

        Commission commission = new Commission();
        commission.acceptDetails("Praveen", "3rd Main St Dubai ", "2513200044", 85000);
        commission.calculateCommission();
        commission.displayDetails();
    }
}
