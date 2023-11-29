package com.Day8;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1,y1 co-ordinates of line1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter x2,y2 co-ordinates of line1: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of line1: " + length1);

        System.out.println("Enter x1,y1 co-ordinates of line2: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        System.out.println("Enter x2,y2 co-ordinates of line2: ");
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();

        double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.println("Length of line2: " + length2);

        Double len1 = Double.valueOf(length1);
        Double len2 = Double.valueOf(length2);
    }
}
