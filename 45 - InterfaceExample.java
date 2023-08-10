// Line 1: Defining an interface named "Bicycle" with two abstract methods.
interface Bicycle {
    void applyBrake(int decrement);
    void speedUp(int increment);
}

// Line 3: Defining a class named "AvonCycle" which implements the "Bicycle" interface.
class AvonCycle implements Bicycle {
    // Line 4: Declaring an instance variable "speed" with an initial value of 7.
    int speed = 7;
    
    // Line 5: Implementing the "applyBrake" method to decrease the speed by the given decrement.
    public void applyBrake(int decrement) {
        speed = speed - decrement;
    }
    
    // Line 6: Implementing the "speedUp" method to increase the speed by the given increment.
    public void speedUp(int increment) {
        speed = speed + increment;
    }
}

// Line 9: Defining another interface named "HornBicycle" with two abstract methods.
interface HornBicycle {
    void blowHornK3g();
    void blowHornmhn();
}

// Line 13: Extending the "AvonCycle" class to implement both "Bicycle" and "HornBicycle" interfaces.
class AvonCycle implements Bicycle, HornBicycle {
    // Line 15: Implementing the "blowHorn" method which prints a horn sound.
    void blowHorn() {
        System.out.println("Pee Pee Poo Poo");
    }
    
    // Line 16: Implementing the "applyBrake" method to print a message about applying brakes.
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake");
    }
    
    // Line 17: Implementing the "speedUp" method to print a message about applying speed up.
    public void speedUp(int increment) {
        System.out.println("Applying SpeedUp");
    }
    
    // Line 18: Implementing the "blowHornK3g" method with a specific horn sound message.
    public void blowHornK3g() {
        System.out.println("Kabhi khushi kabhi gum pee pee pee pee");
    }
    
    // Line 19: Implementing the "blowHornmhn" method with another horn sound message.
    public void blowHornmhn() {
        System.out.println("Main hoon naa po po po po");
    }
}

// Line 20: The public class "interfaces" (class with the main method).
public class interfaces {
    // Line 21: The main method.
    public static void main(String[] args) {
        // Line 22: Creating an instance of AvonCycle named cycledivesh.
        AvonCycle cycledivesh = new AvonCycle();
        // Line 23: Calling the "applyBrake" method on the cycledivesh instance.
        cycledivesh.applyBrake(1);
        // Line 24: Accessing the "a" property of the interface.
        System.out.println(cycledivesh.a);
        // Line 25: Accessing the "x" property of the interface.
        System.out.println(cycledivesh.x);

        // Line 28: Calling the "blowHornK3g" method.
        cycledivesh.blowHornK3g();
        // Line 29: Calling the "blowHornmhn" method.
        cycledivesh.blowHornmhn();
    }
}
