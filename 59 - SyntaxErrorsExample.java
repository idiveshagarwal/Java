int a = 9  // No semicolon, syntax errors!
a = a + 3;
d = 4; // Variable not declared, syntax errors

Question:

**Understanding Syntax Errors**

You are provided with a code snippet containing syntax errors. Your task is to identify and correct these errors to make the code compile successfully. Follow these steps:

1. Add a semicolon (`;`) at the end of the first line to fix the "No semicolon" error.
2. Since variable `d` is not declared and assigned before use, declare and assign an integer value (e.g., `int d = 4;`) to fix the "Variable not declared" error.

After making these corrections, the code should be free from syntax errors and should compile successfully.

**Code Name: errors**

package com.company;

public class errors {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        System.out.println(a + b);
    }
}

Question:

**Understanding Corrected Code**

You are provided with a Java program that calculates the sum of two integers and prints the result. Follow these steps:

1. The `errors` class is defined within the `com.company` package.
2. Inside the `main` method:
   - Declare and initialize an integer variable `a` with the value 5.
   - Declare and initialize an integer variable `b` with the value 9.
   - Calculate the sum of `a` and `b` using the expression `a + b`.
   - Print the calculated sum using `System.out.println()`.

Compile and run the program to verify that it correctly calculates and displays the sum of the two numbers.