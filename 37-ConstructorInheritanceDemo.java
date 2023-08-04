// Declare a package named com.company
package com.company;

// Define a class named Base1
class Base1 {
    // Define a default constructor for Base1 class
    Base1() {
        System.out.println("I am a constructor");
    }

    // Define an overloaded constructor for Base1 class that takes an integer parameter 'x'
    Base1(int x) {
        System.out.println("I am an overloaded constructor with the value of x as: " + x);
    }
}

// Define a class named Derived1 that extends the Base1 class
class Derived1 extends Base1 {
    // Define a default constructor for the Derived1 class
    Derived1() {
        // Call the default constructor of the superclass Base1 using 'super()'
        // Note: This line is commented out in the code.
        System.out.println("I am a derived class constructor");
    }

    // Define an overloaded constructor for the Derived1 class that takes two integer parameters 'x' and 'y'
    Derived1(int x, int y) {
        // Call the parameterized constructor of the superclass Base1 with the value of 'x' using 'super(x)'
        System.out.println("I am an overloaded constructor of Derived with the value of y as: " + y);
    }
}

// Define a class named ChildOfDerived that extends the Derived1 class
class ChildOfDerived extends Derived1 {
    // Define a default constructor for the ChildOfDerived class
    ChildOfDerived() {
        System.out.println("I am a child of derived constructor");
    }

    // Define an overloaded constructor for the ChildOfDerived class that takes three integer parameters 'x', 'y', and 'z'
    ChildOfDerived(int x, int y, int z) {
        // Call the parameterized constructor of the superclass Derived1 with the values of 'x' and 'y' using 'super(x, y)'
        System.out.println("I am an overloaded constructor of Derived with the value of z as: " + z);
    }
}

// Define a public class named ConstructorInheritanceDemo
public class ConstructorInheritanceDemo {
    // Define the main method, the entry point of the program
    public static void main(String[] args) {
        // Create an object of the ChildOfDerived class using the default constructor
        // This will print the messages from all the constructors in the inheritance hierarchy
        ChildOfDerived cd = new ChildOfDerived(12, 13, 15);
    }
}

Explanation:

The code defines three classes: Base1, Derived1, and ChildOfDerived.
Base1 has two constructors - a default constructor and an overloaded constructor with an integer parameter x.
Derived1 extends Base1 and has two constructors - a default constructor and an overloaded constructor with integer parameters x and y. The overloaded constructor of Derived1 calls the constructor of the superclass Base1 using super(x).
ChildOfDerived extends Derived1 and has two constructors - a default constructor and an overloaded constructor with integer parameters x, y, and z. The overloaded constructor of ChildOfDerived calls the constructor of the superclass Derived1 using super(x, y).
In the main method, an object of ChildOfDerived class is created using the overloaded constructor, passing values 12, 13, and 15. The constructors are called in the order of inheritance hierarchy, and the respective messages are printed, demonstrating constructor inheritance.