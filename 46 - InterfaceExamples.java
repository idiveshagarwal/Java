// Line 1: Defining an interface named "Animal" with a default method and an abstract method.
interface Animal {
    // Line 3: Default method "say()" which prints a default message.
    default void say() {
        System.out.println("Hello, this is the default method");
    }
    
    // Line 6: Abstract method "bark()" which doesn't have a body.
    void bark();
}

// Line 8: The public class "dive" that implements the "Animal" interface.
public class dive implements Animal {
    // Line 12: Implementing the "bark()" method to print "Dog barks!".
    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
    
    // Line 13: The main method.
    public static void main(String[] args) {
        // Line 14: Creating an instance of "dive".
        dive obj1 = new dive();
        // Line 15: Calling the "bark()" method from the interface implementation.
        obj1.bark();
        // Line 16: Calling the default method "say()" from the interface.
        obj1.say();
    }
}

// Output:
// Dog barks!
// Hello, this is the default method

package com.company;

// Line 20: Defining an interface named "MyCamera" with methods related to camera functionality.
interface MyCamera {
    void takeSnap();
    void recordVideo();
    // Line 24: Private method "greet()" which is not accessible outside the interface.
    private void greet() {
        System.out.println("Good Morning");
    }
    // Line 27: Default method "record4KVideo()" which uses the private "greet()" method.
    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4k...");
    }
}

// Line 31: Defining an interface named "MyWifi" with methods related to WiFi functionality.
interface MyWifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}

// Line 36: Defining a class named "MyCellPhone" with methods for making calls.
class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting... ");
    }
}

// Line 42: Defining a class named "MySmartPhone" which extends "MyCellPhone" and implements "MyWifi" and "MyCamera" interfaces.
class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera {
    // Line 44: Implementing the "takeSnap()" method.
    public void takeSnap() {
        System.out.println("Taking snap");
    }
    // Line 45: Implementing the "recordVideo()" method.
    public void recordVideo() {
        System.out.println("Taking snap");
    }
    // Line 49: Implementing the "getNetworks()" method to return a list of networks.
    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Divesh", "Prashanth", "Anjali5G"};
        return networkList;
    }
    // Line 50: Implementing the "connectToNetwork()" method to connect to a network.
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

// Line 56: The public class "default_methods" (class with the main method).
public class default_methods {
    // Line 57: The main method.
    public static void main(String[] args) {
        // Line 58: Creating an instance of "MySmartPhone".
        MySmartPhone ms = new MySmartPhone();
        // Line 59: Calling the "record4KVideo()" method from the interface implementation.
        ms.record4KVideo();
        // Line 62: Calling the "getNetworks()" method and printing the network list.
        String[] ar = ms.getNetworks();
        for (String item : ar) {
            System.out.println(item);
        }
    }
}
