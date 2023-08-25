// Package declaration
package com.company;

// Main class definition
public class FinallyExample {

    // Method to demonstrate finally block
    public static int greet() {
        try {
            int a = 50;
            int b = 10;
            int c = a / b; // Division operation
            return c; // Returning the result of division
        } catch (Exception e) {
            System.out.println(e); // Printing exception details
        } finally {
            System.out.println("Cleaning up resources... This is the end of this function");
        }
        return -1;
    }

    public static void main(String[] args) {
        int k = greet(); // Calling the greet() method
        System.out.println(k); // Printing the result of greet() method
        
        int a = 7;
        int b = 9;
        
        // Loop to demonstrate finally block within a while loop
        while (true) {
            try {
                System.out.println(a / b); // Division operation
            } catch (Exception e) {
                System.out.println(e); // Printing exception details
                break;
            } finally {
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }
        
        try {
            System.out.println(50 / 3); // Division operation
        } finally {
            System.out.println("Yes this is finally");
        }
    }
}
