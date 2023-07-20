class forEachLoop { // Class name should be in camel case - CWH_forEachLoop

    public static void main(String args[]) {

        // declaring an array
        int arr[] = {1, 2, 3, 3, 4, 5};

        // traversing the array with for-each loop
        for (int element : arr) { // Using a for-each loop to iterate through each element in the array
            System.out.println(element); // Prints each element of the array
        }
    }
}

/* Output:
1
2
3
4
5
*/

package com.company;

public class arrays {
    public static void main(String[] args) {

        /*
        float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
        String [] students ={"Harry", "Rohan", "Shubham", "Lovish"};
        System.out.println(students.length);
        System.out.println(students[2]);
        */

        int [] marks = {98, 45, 79, 99, 80};

        // System.out.println(marks.length); - Commented out for clarity.

        // Displaying the Array (Naive way)
        System.out.println("Printing using Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) { // Loop to iterate through each element of the array
            System.out.println(marks[i]); // Prints each element of the array using the loop index
        }

        // Quick Quiz: Displaying the Array in Reverse order (for loop)
        System.out.println("Printing using for loop in reverse order");
        for (int i = marks.length - 1; i >= 0; i--) { // Loop to iterate through each element of the array in reverse order
            System.out.println(marks[i]); // Prints each element of the array in reverse order using the loop index
        }

        // Quick Quiz: Displaying the Array (for-each loop)
        System.out.println("Printing using for-each loop");
        for (int element : marks) { // Using a for-each loop to iterate through each element in the array
            System.out.println(element); // Prints each element of the array
        }

    }
}

In this code, there are two classes:

forEachLoop: It demonstrates the usage of a for-each loop to traverse an array and print its elements. The array arr is initialized with values {1, 2, 3, 3, 4, 5} and then, using the for-each loop, each element of the array is printed.

arrays: It displays different ways to initialize and display arrays. The array marks is used for demonstration purposes.

The output of the program will be:

1
2
3
4
5
Printing using Naive way
98
45
79
99
80
Printing using for loop
98
45
79
99
80
Printing using for loop in reverse order
80
99
79
45
98
Printing using for-each loop
98
45
79
99
80
