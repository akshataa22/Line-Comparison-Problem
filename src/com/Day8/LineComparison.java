package com.Day8;

import java.util.Scanner;

class LineComparison {
    private double x1, y1, x2, y2;

    public LineComparison(double x1, double y1, double x2, double y2) {     //constructor
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
    }

    public double calculateLength() {
            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter x1, y1 coordinates of line1:");
    double x1 = sc.nextDouble();
    double y1 = sc.nextDouble();

    System.out.println("Enter x2, y2 coordinates of line1:");
    double x2 = sc.nextDouble();
    double y2 = sc.nextDouble();

    System.out.println("Enter x1, y1 coordinates of line2:");
    double x3 = sc.nextDouble();
    double y3 = sc.nextDouble();

    System.out.println("Enter x2, y2 coordinates of line2:");
    double x4 = sc.nextDouble();
    double y4 = sc.nextDouble();

    LineComparison line1 = new LineComparison(x1, y1, x2, y2);
    LineComparison line2 = new LineComparison(x3, y3, x4, y4);

    double length1 = line1.calculateLength();
    double length2 = line2.calculateLength();

    System.out.println("Length of line1: " + length1);
    System.out.println("Length of line2: " + length2);

    if (length1 == length2) {
        System.out.println("Length of two lines are equal.");
    } else {
        System.out.println("Not equal.");
    }

    // Using compare-to method
        int result = Double.compare(length1, length2);
    System.out.println(result);
    if (result == 0) {
        System.out.println("Length of two lines are equal.");
    } else {
        System.out.println("Not equal.");
    }
    }
}