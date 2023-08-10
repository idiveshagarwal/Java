// Line 1: Defining a public interface named "Interface1" with an abstract method.
public interface Interface1 {
    void meth1();
}

// Line 5: Defining a public interface named "Interface2" which extends "Interface1".
public interface Interface2 extends Interface1 {
    void meth2();
}

// Line 8: Package declaration.
package com.company;

// Line 10: Defining an interface named "sampleInterface" with two abstract methods.
interface sampleInterface {
    void meth1();
    void meth2();
}

// Line 15: Defining an interface named "childSampleInterface" which extends "sampleInterface".
interface childSampleInterface extends sampleInterface {
    void meth3();
    void meth4();
}

// Line 19: Defining a class named "MySampleClass" which implements "childSampleInterface".
class MySampleClass implements childSampleInterface {
    // Line 22: Implementing the "meth1()" method.
    public void meth1() {
        System.out.println("meth1");
    }
    // Line 25: Implementing the "meth2()" method.
    public void meth2() {
        System.out.println("meth2");
    }
    // Line 28: Implementing the "meth3()" method.
    public void meth3() {
        System.out.println("meth3");
    }
    // Line 31: Implementing the "meth4()" method.
    public void meth4() {
        System.out.println("meth4");
    }
}

// Line 36: The public class "inheritance_interfaces" (class with the main method).
public class inheritance_interfaces {
    // Line 37: The main method.
    public static void main(String[] args) {
        // Line 38: Creating an instance of "MySampleClass".
        MySampleClass obj = new MySampleClass();
        // Line 39: Calling the "meth1()" method.
        obj.meth1();
        // Line 40: Calling the "meth2()" method.
        obj.meth2();
        // Line 41: Calling the "meth3()" method.
        obj.meth3();
    }
}
