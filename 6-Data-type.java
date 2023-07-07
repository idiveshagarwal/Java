package com.company;

public class data-type {
    public static void main(String[] args) {
        /* byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b); */

        // Increment and Decrement Operators
        int i = 56;
        // int b = i++; // first b is assigned i (56) then i is incremented
        int j = 67;
        int c = ++j; // first j is incremented then c is assigned j (68)
        System.out.println(i++); // Prints the current value of i (56) and then increments i
        System.out.println(i); // Prints the updated value of i (57)
        System.out.println(++i); // Increments i and then prints the updated value (58)
        System.out.println(i); // Prints the current value of i (58)
        int y = 7;
        System.out.println(++y * 8); // Increments y and then multiplies the incremented value with 8
        char ch = 'a';
        System.out.println(++ch); // Increments ch and prints the updated value (b)
    }
}
