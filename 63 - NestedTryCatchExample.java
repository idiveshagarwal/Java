// Package declaration
package com.company;

// Importing Scanner class from java.util package
import java.util.Scanner;

// Class definition
public class NestedTryCatchExample {
    public static void main(String[] args) {
        // Creating an array to store marks
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        
        // Creating a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        
        // Flag to control the loop
        boolean flag = true;
        
        // Loop to repeatedly prompt the user for input
        while (flag) {
            System.out.println("Enter the value of index");
            int ind = sc.nextInt(); // Reading user input
            
            try {
                System.out.println("Welcome to video no 82");
                
                try {
                    System.out.println(marks[ind]); // Printing the value from the array at the given index
                    flag = false; // Exiting the loop if index is valid
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        
        System.out.println("Thanks for using this program"); // Final message
    }
}
