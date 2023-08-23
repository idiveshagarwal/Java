package com.company;

public class try {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;
        // Without Try:
//        int c = a / b;
//        System.out.println("The result is " + c);
        // With Try:
        try {
            int c = a / b;
            System.out.println("The result is " + c);
        }
        catch(Exception e) {
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}

Question:

**Understanding Try-Catch Block**

You are provided with a Java program that demonstrates the usage of a try-catch block to handle exceptions. The code contains both commented-out sections without a try-catch block and a section with a try-catch block. Your task is to understand the concept of exception handling and the behavior of the program in both cases. Follow these steps:

1. Without Try-Catch Block:
   - Uncomment the lines that perform the division `a / b` without a try-catch block.
   - Analyze and understand that division by zero will lead to an exception (`ArithmeticException`).
   - However, since there's no exception handling, the program will terminate abruptly with an error message.

2. With Try-Catch Block:
   - Uncomment the lines within the try block that perform the division.
   - Analyze the try-catch block:
     - The division is attempted inside the try block.
     - In case an exception occurs (such as division by zero), the catch block is executed.
     - The catch block prints an error message and the exception information using `e`.

Compile and run the program. Observe the behavior and output in both cases:
- Without try-catch: Program terminates with an error message due to division by zero.
- With try-catch: Program executes the catch block, prints the error message, and continues execution.

**Code Name: try**

Compile and run the program to observe the difference in behavior with and without the try-catch block.