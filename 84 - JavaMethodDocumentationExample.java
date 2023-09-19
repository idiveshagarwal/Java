package com.company;

/**
 * This class is named method_tags, and it serves as an example of method documentation in Java.
 * It contains a main method and an 'add' method.
 */
public class method_tags {
    /**
     * The main method is the entry point for this Java program.
     * It prints "I am main method" to the console.
     * @param args These are arguments supplied to the command line (not used in this program).
     */
    public static void main(String[] args) {
        System.out.println("I am the main method");
    }

    /**
     * The 'add' method performs addition of two integers and returns the result.
     * @param i This is the first number to add.
     * @param j This is the second number to add.
     * @return The sum of two numbers as an integer.
     * @throws Exception if 'i' is 0 (to handle a special case).
     * @deprecated This method is deprecated; please use the + operator instead.
     */
    public int add(int i, int j) throws Exception{
        if(i == 0){
            throw new Exception("Division by zero is not allowed.");
        }
        int c;
        c = i + j;
        return c;
    }
}
