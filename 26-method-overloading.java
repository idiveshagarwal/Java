package com.company;

public class method_overloading {
    static void foo() {
        System.out.println("Good Morning bro!");
    }

    static void foo(int a) {
        System.out.println("Good morning " + a + " bro!");
    }

    static void foo(int a, int b) {
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static void foo(int a, int b, int c) {
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
        System.out.println("Good morning " + c + " bro!"); // Added missing statement
    }

    static void change(int a) {
        a = 98;
    }

    static void change2(int[] arr) {
        arr[0] = 98;
    }

    static void tellJoke() {
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    public static void main(String[] args) {
        // tellJoke();

        // Case 1: Changing the Integer
        //int x = 45;
        //change(x);
        //System.out.println("The value of x after running change is: " + x);

        // Case 1: Changing the Array
        // int [] marks = {52, 73, 77, 89, 98, 94};
        // change2(marks);
        // System.out.println("The value of x after running change is: " + marks[0]);

        // Method Overloading
        foo();
        foo(3000);
        foo(3000, 4000);
        // Arguments are actual!
    }
}

Questions and descriptions of each part:

void foo(): This is a method named foo that takes no parameters (empty parentheses) and returns void. It prints "Good Morning bro!".

void foo(int a): This is an overloaded method named foo that takes an integer parameter 'a' and returns void. It prints "Good morning " + a + " bro!".

void foo(int a, int b): This is another overloaded method named foo that takes two integer parameters 'a' and 'b' and returns void. It prints "Good morning " + a + " bro!" and "Good morning " + b + " bro!" on separate lines.

void foo(int a, int b, int c): This is a third overloaded method named foo that takes three integer parameters 'a', 'b', and 'c' and returns void. It prints "Good morning " + a + " bro!", "Good morning " + b + " bro!", and "Good morning " + c + " bro!" on separate lines. The missing line that prints 'c' has been added.

The methods change and change2 demonstrate how Java handles pass-by-value for primitive types and arrays respectively.

static void tellJoke(): This method prints a joke to the console.

In the main method, the foo methods are called with different argument combinations to demonstrate method overloading.

The output of the program will be:

Good Morning bro!
Good morning 3000 bro!
Good morning 3000 bro!
Good morning 4000 bro!

