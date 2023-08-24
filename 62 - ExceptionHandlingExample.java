package com.company;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of array-value/number is: " + marks[ind] / number);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred!");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some other exception occurred!");
            System.out.println(e);
        }
    }
}

Question:

**Understanding Exception Handling**

You are provided with a Java program that demonstrates the usage of try-catch blocks to handle exceptions. The code involves scenarios where array index and arithmetic exceptions can occur. Your task is to analyze the code, understand how different types of exceptions are caught and handled, and predict the program's behavior. Follow these steps:

1. The array `marks` is initialized with values.
2. User input is obtained for an array index and a number to divide with.
3. A try-catch block is used to handle exceptions:
   - Inside the try block, the program attempts to access the value at the specified index and perform division.
   - The catch blocks are defined in the following order:
     - `ArithmeticException` catch block to handle division by zero or other arithmetic errors.
     - `ArrayIndexOutOfBoundsException` catch block to handle out-of-bounds array index.
     - Generic `Exception` catch block to handle all other exceptions.

Compile and run the program. Test it with different inputs to observe how different types of exceptions are caught and handled.

**Code Name: exception**

Compile and run the program to observe how the try-catch blocks handle exceptions in different scenarios.