// Line 1: Package declaration.
package com.company;

// Line 3: Defining an interface named "MyCamera2" with methods related to camera functionality.
interface MyCamera2 {
    void takeSnap();
    void recordVideo();
    // Line 7: Private method "greet()" which is not accessible outside the interface.
    private void greet() {
        System.out.println("Good Morning");
    }
    // Line 10: Default method "record4KVideo()" which uses the private "greet()" method.
    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4k...");
    }
}

// Line 12: Defining an interface named "MyWifi2" with methods related to WiFi functionality.
interface MyWifi2 {
    String[] getNetworks();
    void connectToNetwork(String network);
}

// Line 17: Defining a class named "MyCellPhone2" with methods for making calls.
class MyCellPhone2 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall() {
        System.out.println("Connecting... ");
    }
}

// Line 23: Defining a class named "MySmartPhone2" which extends "MyCellPhone2" and implements "MyWifi2" and "MyCamera2" interfaces.
class MySmartPhone2 extends MyCellPhone2 implements MyWifi2, MyCamera2 {
    // Line 25: Implementing the "takeSnap()" method.
    public void takeSnap() {
        System.out.println("Taking snap");
    }
    // Line 26: Implementing the "recordVideo()" method.
    public void recordVideo() {
        System.out.println("Taking snap");
    }
    // Line 31: Implementing the "getNetworks()" method to return a list of networks.
    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Divesh", "Prashanth", "Anjali5G"};
        return networkList;
    }
    // Line 32: Implementing the "connectToNetwork()" method to connect to a network.
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
    // Line 33: Adding a new method "sampleMeth()".
    public void sampleMeth() {
        System.out.println("meth");
    }
}

// Line 38: The public class "polymorphism" (class with the main method).
public class polymorphism {
    // Line 39: The main method.
    public static void main(String[] args) {
        // Line 40: Creating an instance of "MySmartPhone2" and storing it in a "MyCamera2" reference.
        MyCamera2 cam1 = new MySmartPhone2(); // This is a smartphone but, use it as a camera
        // Line 42: Calling the "record4KVideo()" method from the interface implementation.
        cam1.record4KVideo();

        // Line 44: Creating an instance of "MySmartPhone2".
        MySmartPhone2 s = new MySmartPhone2();
        // Line 45: Calling the "sampleMeth()" method.
        s.sampleMeth();
        // Line 46: Calling the "recordVideo()" method.
        s.recordVideo();
        // Line 47: Calling the "getNetworks()" method and printing the network list.
        s.getNetworks();
        // Line 48: Calling the "callNumber()" method.
        s.callNumber(7979);
    }
}
