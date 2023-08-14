// Line 5: Package declaration.
package com.company;

// Line 7: Importing the Scanner class from the java.util package.
import java.util.Scanner;

// Line 10: The public class "packages" (class with the main method).
public class packages {
    // Line 11-15: The main method.
    public static void main(String[] args) {
        // Creating an instance of the Scanner class named "sc".
        Scanner sc = new Scanner(System.in);

        // Line 16: Prompting the user to enter an integer and storing it in variable "a".
        int a = sc.nextInt();

        // Line 17: Printing a message with the user input.
        System.out.println("This is my scanner taking input as " + a);
    }
}


Code Name: PackageAndScannerExample

Description of Each Line and Code Explanation:

java
Copy code
// Line 5: Package declaration.
package com.company;

// Line 7: Importing the Scanner class from the java.util package.
import java.util.Scanner;

// Line 10: The public class "packages" (class with the main method).
public class packages {
    // Line 11-15: The main method.
    public static void main(String[] args) {
        // Creating an instance of the Scanner class named "sc".
        Scanner sc = new Scanner(System.in);

        // Line 16: Prompting the user to enter an integer and storing it in variable "a".
        int a = sc.nextInt();

        // Line 17: Printing a message with the user input.
        System.out.println("This is my scanner taking input as " + a);
    }
}
Question:

Using Scanner and Importing Packages

You are required to create a Java program that uses the Scanner class to take input from the user and print a message based on the input. Follow these steps:

Create a package named com.company in your project.
Import the Scanner class from the java.util package to use it for taking input.
Create a class named packages in the com.company package.
Write the main method within the class.
Inside the main method:
Create an instance of the Scanner class named sc.
Use the nextInt() method to take an integer input from the user and store it in a variable a.
Print a message that includes the user input.
Compile and run the program to test its functionality.

To compile the program, use the following command in the terminal:
javac -d <output_directory> <source_file>

Replace <output_directory> with the directory where you want to store the compiled class file and <source_file> with the name of your Java source file.

To run the program, use the following command in the terminal:
java -cp <output_directory> com.company.packages

Replace <output_directory> with the directory containing the compiled class file.

Execute these commands in your terminal to compile and run the program, then enter an integer input when prompted, and observe the printed output message.