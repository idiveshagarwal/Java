package com.company;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {

        // Question 1: The code calculates the sum of three integers (a, b, and c) and prints the result to the console.
        // int a = 4;
        // int b = 17;
        // int c = 6;
        // int sum = a + b + c;
        // System.out.println(sum);

        // Question 2: The code calculates the CGPA (Cumulative Grade Point Average) based on three subject scores (subject1, subject2, and subject3). The result is divided by 30, and the CGPA is printed to the console.
        // float subject1 = 45;
        // float subject2 = 95;
        // float subject3 = 48;
        // float cgpa = (subject1 + subject2 + subject3) / 30;
        // System.out.println(cgpa);

        // Question 3: The code prompts the user to enter their name, reads the input using the Scanner class, and prints a greeting message with the entered name.
        // System.out.println("What is your name");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // System.out.println("Hello " + name + ", have a good day!");

        // Question 4: The code asks the user to enter a number, reads the input using the Scanner class, and checks if the entered value is an integer using the hasNextInt() method. The result (true or false) is printed to the console.
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
