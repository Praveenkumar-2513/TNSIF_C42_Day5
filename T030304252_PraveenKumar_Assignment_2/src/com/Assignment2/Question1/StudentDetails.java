package com.Assignment2.Question1;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name with initial: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your roll number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter your grade: ");
        String grade = scanner.next();

        System.out.print("Enter your percentage: ");
        double percentage = scanner.nextDouble();

        scanner.close();

        System.out.println("Full Name with Initial: " + fullName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("Percentage: " + percentage + "%");
    }
}
