// Line 1: Defining an abstract class named "PhoneModel".
public abstract class PhoneModel {
    // Line 2: Declaring an abstract method "switchOff()" in the abstract class.
    abstract void switchOff();
    // Line 3: Additional code might be present here.
}

// Line 5: Defining an abstract class named "Phone" which extends the PhoneModel class.
abstract class Phone {
    // Line 6: Declaring an abstract method "on()" in the abstract class.
    abstract void on();
}

// Line 8: Defining a class named "SmartPhone" which extends the "Phone" class.
class SmartPhone extends Phone {
    // Line 9: Defining a method named "run()" which prints "Turning on..." to the console.
    void run() {
        System.out.println("Turning on...");
    }
    
    // Line 10: The main method.
    public static void main(String args[]) {
        // Line 11: Creating an instance of SmartPhone and storing it in a Phone reference.
        Phone obj = new SmartPhone();
        // Line 12: Calling the "on()" method on the obj instance.
        obj.on();
    }
}
// The output will be: Turning on...

package com.company;

// Line 17: Defining an abstract class named "Parent2".
abstract class Parent2 {
    // Line 18: Constructor for Parent2 class, printing "Mai base2 ka constructor hoon" to the console.
    public Parent2() {
        System.out.println("Mai base2 ka constructor hoon");
    }
    
    // Line 19: Defining a method "sayHello()" which prints "Hello" to the console.
    public void sayHello() {
        System.out.println("Hello");
    }
    
    // Line 20: Declaring an abstract method "greet()".
    abstract public void greet();
    
    // Line 21: Declaring an abstract method "greet2()".
    abstract public void greet2();
}

// Line 25: Defining a class named "Child2" which extends the "Parent2" class.
class Child2 extends Parent2 {
    // Line 26: Overriding the "greet()" method to print "Good morning" to the console.
    @Override
    public void greet() {
        System.out.println("Good morning");
    }
    
    // Line 27: Overriding the "greet2()" method to print "Good afternoon" to the console.
    @Override
    public void greet2() {
        System.out.println("Good afternoon");
    }
}

// Line 30: Defining an abstract class named "Child3" which extends the "Parent2" class.
abstract class Child3 extends Parent2 {
    // Line 31: Defining a method "th()" which prints "I am good" to the console.
    public void th() {
        System.out.println("I am good");
    }
}

// Line 34: The public class "abstract" (class with the main method).
public class abstract {
    // Line 35: The main method.
    public static void main(String[] args) {
        // Line 36: Creating an instance of Child2 and storing it in a Parent2 reference.
        Child2 c = new Child2();
        // Line 37: Creating an instance of Child3 (which is abstract) will result in an error.
    }
}
