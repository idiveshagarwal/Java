// Defining a base class named Animal
class Animal {
}

// Defining a subclass named Dog that extends Animal
class Dog extends Animal {
}

// Creating an instance of class Dog and upcasting it to type Animal
Animal a = new Dog();

// Defining a class named Phone
class Phone {
    public void showTime() {
        System.out.println("Time is 8 am");
    }

    public void on() {
        System.out.println("Turning on Phone...");
    }
}

// Defining a subclass named SmartPhone that extends Phone
class SmartPhone extends Phone {
    public void music() {
        System.out.println("Playing music...");
    }

    // Overriding the 'on' method from the base class
    @Override
    public void on() {
        System.out.println("Turning on SmartPhone...");
    }
}

// Defining the main class named DynamicMethodDispatch
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        // Creating an instance of SmartPhone and upcasting it to type Phone
        Phone obj = new SmartPhone(); // Yes, this is allowed

        // Calling methods on the upcasted object
        obj.showTime();
        obj.on();
        // obj.music(); // Not allowed

    }
}
// Output:
// Time is 8 am
// Turning on SmartPhone...

In this code, you have a hierarchy of classes involving Animal, Dog, Phone, and SmartPhone.

The Animal and Dog classes are used to demonstrate class inheritance.

The Phone class has two methods: showTime() and on(). The SmartPhone class extends Phone and adds two additional methods: music() and an overridden version of on().

In the main method of class DynamicMethodDispatch, you create an instance of SmartPhone and upcast it to a Phone reference. This allows you to call the showTime() and overridden on() methods.

You cannot directly call the music() method using the upcasted reference because the reference type is Phone, and the music() method is not defined in the Phone class.

Your code is well-structured to demonstrate concepts like inheritance, method overriding, and upcasting.