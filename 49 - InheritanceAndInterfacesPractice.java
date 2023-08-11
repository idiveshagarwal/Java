// Line 1: Package declaration.
package com.company;

// Line 3: Defining an abstract class named "Pen" with abstract methods "write()" and "refill()".
abstract class Pen {
    abstract void write();
    abstract void refill();
}

// Line 7: Defining a class named "FountainPen" which extends "Pen".
class FountainPen extends Pen {
    // Line 8: Implementing the "write()" method.
    void write() {
        System.out.println("Write");
    }
    // Line 9: Implementing the "refill()" method.
    void refill() {
        System.out.println("Refill");
    }
    // Line 10: Adding a new method "changeNib()".
    void changeNib() {
        System.out.println("Changing the nib");
    }
}

// Line 12: Defining a class named "Monkey".
class Monkey {
    // Line 13: Defining the "jump()" method.
    void jump() {
        System.out.println("Jumping...");
    }
    // Line 14: Defining the "bite()" method.
    void bite() {
        System.out.println("Biting...");
    }
}

// Line 16: Defining an interface named "BasicAnimal" with two abstract methods.
interface BasicAnimal {
    void eat();
    void sleep();
}

// Line 20: Defining a class named "Human" which extends "Monkey" and implements "BasicAnimal" interface.
class Human extends Monkey implements BasicAnimal {
    // Line 21: Defining the "speak()" method.
    void speak() {
        System.out.println("Hello sir!");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}

// Line 30: The public class "dive" (class with the main method).
public class dive {
    // Line 31: The main method.
    public static void main(String[] args) {
        // Line 34: Creating an instance of "FountainPen" and calling "changeNib()" method.
        FountainPen pen = new FountainPen();
        pen.changeNib();

        // Line 38: Creating an instance of "Human" and calling "sleep()" method.
        Human divesh = new Human();
        divesh.sleep();

        // Line 42: Creating an instance of "Human" and assigning it to a "Monkey" reference.
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
        // Line 45: Cannot use "speak()" method because the reference is "Monkey" which doesn't have the "speak()" method.

        // Line 48: Creating an instance of "Human" and assigning it to a "BasicAnimal" reference.
        BasicAnimal lovish = new Human();
        // Line 51: Cannot use "speak()" method because the reference is "BasicAnimal" which doesn't have the "speak()" method.
        lovish.eat();
        lovish.sleep();
    }
}
