package com.company;

public class multi_dim_arrays {
    public static void main(String[] args) {
        int[] marks; // A 1-D Array
        int[][] flats; // A 2-D Array
        flats = new int[2][3]; // A 2-D array of 2 rows and 3 columns

        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying the 2-D Array (for loop)
        System.out.println("Printing a 2-D array using for loop");
        for (int i = 0; i < flats.length; i++) { // Loop for rows
            for (int j = 0; j < flats[i].length; j++) { // Loop for columns within each row
                System.out.print(flats[i][j] + " "); // Print the element at current row and column
            }
            System.out.println(""); // Move to the next line after each row is printed
        }
    }
}


java
Copy code
package com.company;

public class multi_dim_arrays {
    public static void main(String[] args) {
        int[] marks; // A 1-D Array
        int[][] flats; // A 2-D Array
        flats = new int[2][3]; // A 2-D array of 2 rows and 3 columns

        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying the 2-D Array (for loop)
        System.out.println("Printing a 2-D array using for loop");
        for (int i = 0; i < flats.length; i++) { // Loop for rows
            for (int j = 0; j < flats[i].length; j++) { // Loop for columns within each row
                System.out.print(flats[i][j] + " "); // Print the element at current row and column
            }
            System.out.println(""); // Move to the next line after each row is printed
        }
    }
}
In this code, we have a Java program that demonstrates the usage of multi-dimensional arrays (2-D array) to store and display data.

int[][] flats = new int[2][3]: This line declares a 2-D array flats with 2 rows and 3 columns. It's a 2-D array to store information about flats in a building.

The lines flats[0][0] = 101, flats[0][1] = 102, flats[0][2] = 103, flats[1][0] = 201, flats[1][1] = 202, and flats[1][2] = 203 initialize specific elements of the 2-D array flats with some values.

The for loop within a for loop is used to traverse the 2-D array and display its elements. The outer loop (for (int i = 0; i < flats.length; i++)) iterates over the rows of the 2-D array, and the inner loop (for (int j = 0; j < flats[i].length; j++)) iterates over the columns within each row.

System.out.print(flats[i][j] + " ");: This line prints the element at the current row i and column j of the 2-D array flats.

System.out.println("");: This line is used to move to the next line after printing all the elements of each row, so each row is displayed on a separate line.

The output of the program will be:

Printing a 2-D array using for loop
101 102 103 
201 202 203 

The 2-D array flats is displayed in a matrix format, with each element separated by a space and each row on a new line.