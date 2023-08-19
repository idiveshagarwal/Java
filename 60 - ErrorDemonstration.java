package com.company;

import java.util.Scanner;

public class errorsdemo {
    public static void main(String[] args) {
        // SYNTAX ERROR DEMO
        // int a = 0 // Error: no semicolon!
        // b = 8; // Error: b not declared!

        // LOGICAL ERROR DEMO
        // Write a program to print all prime numbers between 1 to 10
        System.out.println(2);
        for (int i=1; i<5; i++){
            System.out.println(2*i+1);
        }

        // RUNTIME ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);
    }
}

Question:

**Understanding Error Demonstration**

You are provided with a Java program that demonstrates different types of errors: syntax errors, logical errors, and runtime errors. Your task is to understand and analyze the different error types and their impacts on the program's behavior. Follow these steps:

1. Syntax Error Demo:
   - Two lines of code are commented out, each demonstrating a syntax error:
     - Uncomment the first line by adding a semicolon (`;`) at the end of `int a = 0`.
     - Uncomment the second line and declare variable `b` before using it, e.g., `int b = 8;`.

2. Logical Error Demo:
   - A loop is used to print prime numbers between 1 and 10.
   - Analyze the loop and identify the logical error:
     - Instead of `i < 5`, the loop should run for `i <= 5` to include the number 9 in the output.

3. Runtime Error Demo:
   - Declare integer variable `k`.
   - Create a `Scanner` object `sc` to read user input.
   - Read an integer input from the user and store it in `k`.
   - Calculate and print the integer part of the result of dividing 1000 by `k`.
   - Analyze the code and observe that if the user inputs `0`, it will lead to a runtime error (`ArithmeticException`) due to division by zero.

Compile and run the program, and observe the behavior and outputs for each section.

**Note:** Remember that the runtime error occurs when you input `0` for variable `k`. This will cause an exception due to division by zero.