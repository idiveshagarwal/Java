// Code Name: KeyPadPhone and AndroidPhone

// Class representing a basic keypad phone
class KeyPadPhone {
    void sendMessage() {
        System.out.println("Text message sent!");
    }
}

// Class representing an Android phone, inheriting from KeyPadPhone
class AndroidPhone extends KeyPadPhone {
    @Override
    void sendMessage() {
        System.out.println("Message sent via WhatsApp!");
    }
}

public class DIV {
    public static void main(String args[]) {
        // Creating an instance of AndroidPhone
        AndroidPhone samsung = new AndroidPhone();
        // Calling the overridden sendMessage method
        samsung.sendMessage();
    }
}

Output: "Message sent via WhatsApp!"

// Code Name: KeyPadPhone and AndroidPhone with Deprecated Annotation

// Class representing a basic keypad phone with a deprecated sendMessage method
class KeyPadPhone {
    @Deprecated
    void sendMessage() {
        System.out.println("Text message sent!");
    }
}

// Class representing an Android phone, inheriting from KeyPadPhone
class AndroidPhone extends KeyPadPhone {
    @Override
    void sendMessage() {
        System.out.println("Message sent via WhatsApp!");
    }
}

public class DIV {
    public static void main(String args[]) {
        @SuppressWarnings("deprecation")
        AndroidPhone samsung = new AndroidPhone();
        samsung.sendMessage();
    }
}

Output: "No warning is generated because we've suppressed the deprecation warning."

// Code Name: Functional Interface Annotation

// Defining a functional interface with two abstract methods
@FunctionalInterface
interface myFunctionalInterface {
    void method1();
    void method2();
}

public class DIV {
    public static void main(String args[]) {
        System.out.println("Functional interface annotation");
    }
}

Output: "java: Unexpected @FunctionalInterface annotation, myFunctionalInterface is not a functional interface, multiple non-overriding abstract methods found in interface myFunctionalInterface"

package com.company;

// Code Name: Java Annotations and Deprecated Method

// Defining a functional interface with a single abstract method
@FunctionalInterface
interface myFunctionalInterface {
    void thisMethod();
    // void thisMethod2(); // Uncommenting this line would result in an error since it would violate the functional interface rule
}

// Class representing a phone
class Phone {
    public void showTime() {
        System.out.println("Time is now 8 AM");
    }

    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}

// Class representing a new phone, extending Phone
class NewPhone extends Phone {
    @Override
    public void showTime() {
        System.out.println("Time is now 8 PM");
    }

    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}

public class java_annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(5, 6);
    }
}

Output: "Time is now 8 PM"