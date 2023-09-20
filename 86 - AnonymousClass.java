// Code Name: Anonymous Classes and Lambda Expressions

// Creating an instance of an anonymous class that implements the Animal interface
Demo t = new Demo() {
   // data members and methods
   public void Demo_method() {
      // Implementation of the method
   }   
};

// Defining a functional interface 'Animal' with a single abstract method 'bark'
@FunctionalInterface
interface Animal {
    void bark();
}

// Class 'Dog' implementing the 'Animal' interface and providing an implementation for 'bark'
class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
}

class AnonDemo {
    public static void main(String[] args) {
        // Creating an instance of 'Dog' and invoking the 'bark' method
        Dog Bruno = new Dog();
        Bruno.bark();
    }
}

Output: "Dog barks!"

// Code Name: Anonymous Class and Lambda Expression for a Class

// Defining a functional interface 'Animal' with a single abstract method 'bark'
@FunctionalInterface
interface Animal {
    void bark();
}

class AnonDemo {
    public static void main(String[] args) {
        // Creating an anonymous class that implements the 'Animal' interface and providing an implementation for 'bark'
        Animal Bruno = new Animal() {
            @Override
            public void bark() {
                System.out.println("Dog barks!");
            }
        };
        Bruno.bark();
    }
}

Output: "Dog barks!"

// Code Name: Anonymous Class and Lambda Expression for an Abstract Class

// Defining an abstract class 'Vehicle' with an abstract method 'drive'
abstract class Vehicle {
    abstract void drive();
}

class AnonDemoByClass {
    public static void main(String[] args) {
        // Creating an anonymous class that extends 'Vehicle' and provides an implementation for 'drive'
        Vehicle car = new Vehicle() {
            @Override
            void drive() {
                System.out.println("I'm driving a car.");
            }
        };
        car.drive();
    }
}

Output: "I'm driving a car."

// Code Name: Lambda Expression for a Functional Interface

// Defining a functional interface 'Human' with a single abstract method 'walk'
@FunctionalInterface
interface Human {
    void walk();
}

class AnonDemo {
    public static void main(String[] args) {
        // Creating a lambda expression for 'Human' and providing an implementation for 'walk'
        Human John = () -> {
            System.out.println("John walks.");
        };
        John.walk();
    }
}

Output: "John walks."

// Code Name: Lambda Expression for a Functional Interface with Parameters

// Defining a functional interface 'LambaExp' with a single abstract method 'meth1' that takes two integer parameters
@FunctionalInterface
interface LambaExp {
    void meth1(int a, int b);
}

class LambaExpDemo {
    public static void main(String[] args) {
        // Creating a lambda expression for 'LambaExp' and providing an implementation for 'meth1'
        LambaExp obj = (a, b) -> {
            System.out.println("The value of a and b is : " + a + "," + b);
        };
        obj.meth1(5, 10);
    }
}

Output: "The value of a and b is : 5,10"

package com.company;

// Code Name: Lambda Expression and Functional Interface with Deprecated Method

// Defining a functional interface 'DemoAno' with a single abstract method 'meth1'
@FunctionalInterface
interface DemoAno {
    void meth1(int a);
    // void meth2(); // Uncommenting this line would result in an error since it would violate the functional interface rule
}

public class lambda {
    public static void main(String[] args) {
        // Creating a lambda expression for 'DemoAno' and providing an implementation for 'meth1'
        DemoAno obj = (a) -> {
            System.out.println("I am method 1 from this lambda " + a);
        };
        obj.meth1(6);
    }
}

Output: "I am method 1 from this lambda 6"