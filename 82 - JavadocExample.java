package com.company;

public class javadoc {
    // Static method that prints a morning greeting
    static void foo() {
        System.out.println("Good Morning bro!");
    }

    // Overloaded static method that prints a morning greeting with an integer parameter
    static void foo(int a) {
        System.out.println("Good morning " + a + " bro!");
    }

    // Overloaded static method that prints morning greetings with two integer parameters
    static void foo(int a, int b) {
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    // Overloaded static method that prints morning greetings with three integer parameters
    static void foo(int a, int b, int c) {
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
        System.out.println("Good morning " + c + " bro!");
    }

    // Static method that attempts to change the value of an integer parameter (not used in the main function)
    static void change(int a) {
        a = 98;
    }

    // Static method that changes the value of the first element of an integer array parameter (not used in the main function)
    static void change2(int[] arr) {
        arr[0] = 98;
    }

    // Static method that tells a joke by printing a humorous message
    static void tellJoke() {
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    public static void main(String[] args) {
        // Uncomment the code blocks below to test different scenarios

        // Uncomment to tell a joke
        // tellJoke();

        // Case 1: Changing the Integer (uncomment and use for testing)
        // int x = 45;
        // change(x);
        // System.out.println("The value of x after running change is: " + x);

        // Case 2: Changing the Array (uncomment and use for testing)
        // int[] marks = {52, 73, 77, 89, 98, 94};
        // change2(marks);
        // System.out.println("The value of the first element after running change2 is: " + marks[0]);

        // Method Overloading examples
        foo();              // Calls the first foo() method with no arguments
        foo(3000);          // Calls the second foo(int a) method with one argument
        foo(3000, 4000);    // Calls the third foo(int a, int b) method with two arguments
        // Arguments are actual!
    }
}
