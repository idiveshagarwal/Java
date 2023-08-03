package com.company;


class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }


}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class divesh_44_ps09 {

    public static void main(String[] args) {
        /*
        // Problem 1
        Cylinder myCylinder = new Cylinder(9, 12);
        //myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        //myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        // Problem 2
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
         */


        // Problem 3
        Rectangle r = new Rectangle(12, 56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());







    }
}
ChatGPT
Code Name: CylinderAndRectangle

Description of the code:

The code defines two classes: Cylinder and Rectangle, representing a cylinder and a rectangle, respectively.

The Cylinder class has private instance variables radius and height, and it provides getter and setter methods for both variables. It also includes two methods: surfaceArea() which calculates and returns the surface area of the cylinder, and volume() which calculates and returns the volume of the cylinder.

The Rectangle class has private instance variables length and breadth, and it provides getter methods for both variables. It also includes two constructors: a default constructor that sets the length to 4 and breadth to 5, and a parameterized constructor that allows setting the length and breadth.

The divesh_44_ps09 class contains the main method, which serves as the entry point of the program. It includes three sections:

a. Problem 1 (commented out): It creates a Cylinder object myCylinder with a radius of 9 and height of 12, and demonstrates the usage of the getter methods getHeight() and getRadius() to retrieve and print the values of height and radius of the cylinder. It also demonstrates how to calculate and print the surface area and volume of the cylinder using the surfaceArea() and volume() methods, respectively. This section is currently commented out.

b. Problem 3: It creates a Rectangle object r with a length of 12 and breadth of 56 and demonstrates the usage of the getter methods getLength() and getBreadth() to retrieve and print the values of length and breadth of the rectangle.

The code is partially commented out, so Problem 1 (related to the Cylinder class) is not executed, and only Problem 3 (related to the Rectangle class) is currently active and executed. If you want to execute Problem 1, you can uncomment the relevant code block and comment out Problem 3.