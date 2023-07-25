package com.company;

public class Practice_Set {
    public static void main(String[] args) {

        // Practice Problem 1
        float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);


        // Practice Problem 2
        float[] marks2 = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.57f;
        boolean isInArray = false;
        for (float element : marks2) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in the array");
        } else {
            System.out.println("The value is not present in the array");
        }


        // Practice Problem 3
        float[] marks3 = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum3 = 0;
        for (float element : marks3) {
            sum3 = sum3 + element;
        }
        System.out.println("The value of average marks is " + sum3 / marks3.length);


        // Practice Problem 4
        int[][] mat1 = {{1, 2, 3},
                        {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13},
                        {3, 7, 1}};
        int[][] result = new int[2][3];

        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of times
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of times
                System.out.print(result[i][j] + " ");
            }
            System.out.println(""); // Prints a new line
        }

        // Practice Problem 5
        int[] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            // Swap arr[i] and arr[l-1-i]
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }

        // Practice Problem 6
        int[] arr2 = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for (int e : arr2) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println("\nThe value of the maximum element in this array is: " + max);

        // Practice Problem 6
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        // Practice Problem 7
        boolean isSorted = true;
        int[] arr3 = {1, 12, 3, 4, 5, 34, 67};
        for (int i = 0; i < arr3.length - 1; i++) {
            if (arr3[i] > arr3[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The Array is sorted");
        } else {
            System.out.println("The Array is not sorted");
        }

    }
}


java
Copy code
package com.company;

public class cwh_29_Practice_Set_6 {
    public static void main(String[] args) {

        // Practice Problem 1
        float[] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);


        // Practice Problem 2
        float[] marks2 = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float num = 45.57f;
        boolean isInArray = false;
        for (float element : marks2) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("The value is present in the array");
        } else {
            System.out.println("The value is not present in the array");
        }


        // Practice Problem 3
        float[] marks3 = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum3 = 0;
        for (float element : marks3) {
            sum3 = sum3 + element;
        }
        System.out.println("The value of average marks is " + sum3 / marks3.length);


        // Practice Problem 4
        int[][] mat1 = {{1, 2, 3},
                        {4, 5, 6}};
        int[][] mat2 = {{2, 6, 13},
                        {3, 7, 1}};
        int[][] result = new int[2][3];

        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of times
                System.out.format(" Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i = 0; i < mat1.length; i++) { // row number of times
            for (int j = 0; j < mat1[i].length; j++) { // column number of times
                System.out.print(result[i][j] + " ");
            }
            System.out.println(""); // Prints a new line
        }

        // Practice Problem 5
        int[] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            // Swap arr[i] and arr[l-1-i]
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }

        // Practice Problem 6
        int[] arr2 = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for (int e : arr2) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println("\nThe value of the maximum element in this array is: " + max);

        // Practice Problem 6
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        // Practice Problem 7
        boolean isSorted = true;
        int[] arr3 = {1, 12, 3, 4, 5, 34, 67};
        for (int i = 0; i < arr3.length - 1; i++) {
            if (arr3[i] > arr3[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The Array is sorted");
        } else {
            System.out.println("The Array is not sorted");
        }

    }
}
Questions and descriptions of each part:

Practice Problem 1: This problem calculates the sum of the elements in the marks array using a for-each loop. The result is printed as "The value of sum is {sum}".

Practice Problem 2: This problem checks if the value num is present in the marks2 array. If found, it prints "The value is present in the array", otherwise "The value is not present in the array".

Practice Problem 3: This problem calculates the average of the elements in the marks3 array using a for-each loop and prints "The value of average marks is {average}".

Practice Problem 4: This problem performs matrix addition for two 2-D arrays mat1 and mat2, storing the result in the result array. It prints the elements of the resulting matrix.

Practice Problem 5: This problem reverses the arr array using a swapping technique. The reversed array is then printed.

Practice Problem 6: This problem finds the maximum element in the arr2 array using a loop and prints its value.

Practice Problem 7: This problem checks if the arr3 array is sorted in ascending order. If it is sorted, it prints "The Array is sorted"; otherwise, it prints "The Array is not sorted".
