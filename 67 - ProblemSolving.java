// Package declaration
package com.company;

// Importing Scanner class from java.util package
import java.util.Scanner;

// Main class definition
public class ProblemSolving {
    public static void main(String[] args) {
        // Problem 1
        // Syntax Error - int a = 7; (missing semicolon)
        int age = 78;
        int year_born = 2000 - 78; // Logical error: This should be "2000 - age"
        // System.out.println(6/0); // Arithmetic error: Division by zero

        // Problem 2
        try {
            int a = 666 / 0; // This will throw an ArithmeticException
        } catch (IllegalArgumentException e) {
            System.out.println("HeHe"); // This catch block will not execute
        } catch (ArithmeticException e) {
            System.out.println("Haha"); // This catch block will execute
        }

        // Problem 3
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i < 5) {
            try {
                System.out.println("Enter the value of index");
                index = sc.nextInt(); // Reading user input
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid Index"); // Handling exception
                i++;
            }
        }
        if (i >= 5) {
            System.out.println("Error"); // Printing error message if input is repeatedly invalid
        }
    }
}
