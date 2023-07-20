package com.company;

public class arrays {
    public static void main(String[] args) {
        /* Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)
        */

        // There are three main ways to create an array in Java
        // 1. Declaration and memory allocation
        // int[] marks = new int[5];

        // 2. Declaration and then memory allocation
        // int[] marks;
        // marks = new int[5];
        // Initialization
        // marks[0] = 100;
        // marks[1] = 60;
        // marks[2] = 70;
        // marks[3] = 90;
        // marks[4] = 86;

        // 3. Declaration, memory allocation, and initialization together
        int[] marks = {98, 45, 79, 99, 80};

        // marks[5] = 96; - throws an error because the array index starts from 0 and the length of the array is 5,
        // so the valid indices are 0 to 4. Trying to access or assign a value at index 5 will cause an "ArrayIndexOutOfBoundsException."

        System.out.println(marks[4]); // Prints the value at index 4, which is 80.
    }
}

In this code, we have a Java program that demonstrates various ways to create and initialize arrays. The comments after each line describe the functionality of that particular line.

int[] marks = {98, 45, 79, 99, 80};: This line declares an array of integers called marks and initializes it with the provided values {98, 45, 79, 99, 80}. This is the third method to create an array, which includes declaration, memory allocation, and initialization together.

int[] marks = new int[5];: This line declares an array of integers called marks and allocates memory for five integer elements. However, this line is commented out.

int[] marks;: This line declares an array of integers called marks, but it does not allocate memory for the array yet. This line is commented out.

marks = new int[5];: This line allocates memory for five integer elements to the previously declared array marks. This line is commented out.

marks[0] = 100; marks[1] = 60; marks[2] = 70; marks[3] = 90; marks[4] = 86;: These lines are used to initialize the elements of the array marks. Each element is assigned a specific value at a given index. However, these lines are commented out.

// marks[5] = 96;: This line is commented out because it attempts to assign a value to the element at index 5, which is not valid since the array has indices from 0 to 4 only.

System.out.println(marks[4]);: This line prints the value at index 4 of the marks array, which is 80. The array index starts from 0, so marks[4] accesses the fifth element in the array.