package com.Assignment2.Question3;

import java.util.Scanner;

class Circle {
    double Radius;
    String Colour;

    void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        Radius = scanner.nextDouble();
        System.out.print("Enter the colour of the circle: ");
        Colour = scanner.next();
        scanner.close();
    }

    void calcArea() {
        double Area = 3.14 * Radius * Radius;
        System.out.println("Radius: " + Radius);
        System.out.println("Colour: " + Colour);
        System.out.println("Area of the circle: " + Area);
    }
}

public class Members {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.getInput();
        circle.calcArea();
    }
}
