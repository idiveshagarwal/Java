Question:

Understanding Access Modifiers

You are required to create a Java program to understand different access modifiers applied to class members. Follow these steps:

Create a package named com.company in your project.
Define a class named C1 within the package with the following member variables and methods:
public int x - A public member variable.
protected int y - A protected member variable.
int z - A default (package-private) member variable.
private int a - A private member variable.
public void meth1() - A method that prints all member variables.
Create a class named access_modifiers in the same package.
Write the main method within the class.
Inside the main method:
Create an instance of class C1 named c.
Access and print the member variables x, y, and z using the instance c.
Comment out the attempt to access the private member variable a due to expected error.
Compile and run the program to observe how different access modifiers affect member variable visibility and access.

This program demonstrates the concept of access modifiers and their impact on the visibility of class members.


// Line 1: Package declaration.
package com.company;

// Line 3: Defining a class named "C1" with various access modifiers and member variables.
class C1 {
    // Line 4: Public member variable "x".
    public int x = 5;
    // Line 5: Protected member variable "y".
    protected int y = 45;
    // Line 6: Default (package-private) member variable "z".
    int z = 6;
    // Line 7: Private member variable "a".
    private int a = 78;

    // Line 8-13: Public method "meth1()" that accesses all the member variables.
    public void meth1() {
        System.out.println(x); // Accessing public member variable.
        System.out.println(y); // Accessing protected member variable.
        System.out.println(z); // Accessing default member variable.
        System.out.println(a); // Accessing private member variable.
    }
}

// Line 15: The public class "access_modifiers" (class with the main method).
public class access_modifiers {
    // Line 16-21: The main method.
    public static void main(String[] args) {
        // Creating an instance of class "C1" named "c".
        C1 c = new C1();

        // Accessing member variables using the instance "c".
        System.out.println(c.x); // Accessing public member variable.
        System.out.println(c.y); // Accessing protected member variable.
        System.out.println(c.z); // Accessing default member variable.
        // System.out.println(c.a); // Error: Cannot access private member variable.
    }
}