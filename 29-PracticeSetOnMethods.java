Code Name: practice_set_on_methods

This Java code contains several methods that demonstrate various patterns, calculations, and recursive functions. The main method calls these functions to showcase their functionalities.

Method multiplication:

static void multiplication(int n) {
    for (int i = 1; i <= 10; i++) {
        System.out.format("%d X %d = %d\n", n, i, n * i);
    }
}
This method prints the multiplication table of a given number n from 1 to 10.

Method pattern1:

static void pattern1(int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < i + 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
This method prints a pattern of stars in a right-angled triangle with n rows.

Method pattern1_rec:

static void pattern1_rec(int n) {
    if (n > 0) {
        pattern1_rec(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
This method also prints a pattern of stars in a right-angled triangle with n rows using recursion.

Method sumRec:

static int sumRec(int n) {
    if (n == 1) {
        return 1;
    }
    return n + sumRec(n - 1);
}
This method calculates the sum of numbers from 1 to n using recursion.

Method fib:

static int fib(int n) {
    if (n == 1 || n == 2) {
        return n - 1;
    } else {
        return fib(n - 1) + fib(n - 2);
    }
}
This method calculates the Fibonacci series up to the nth term using recursion.

In the main method, various problems are executed using the above-defined methods. To see the output of each problem, simply uncomment the respective method call in the main method and run the code.

Note: For Problem 8, it seems that the method pattern1 is called twice with the argument 9. You may want to modify or remove one of the calls to display different patterns.