Code Name: recursion

In the provided code, two recursive functions and their iterative counterparts are implemented to calculate the factorial of a given number n. The code also demonstrates the usage of these functions in the main method.

Recursive Function factorial:

static int factorial(int n){
    if(n==0 || n==1){
        return 1;
    }
    else{
        return n * factorial(n-1);
    }
}
This function calculates the factorial of n using recursion. If n is either 0 or 1, the function returns 1 (base case). Otherwise, it calculates the factorial as n * factorial(n-1).

Iterative Function factorial_iterative:

static int factorial_iterative(int n){
    if(n==0 || n==1){
        return 1;
    }
    else{
        int product = 1;
        for (int i=1;i<=n;i++){ // 1 to n
            product *= i;
        }
        return product;
    }
}
This function calculates the factorial of n using an iterative approach. It uses a for loop to multiply the numbers from 1 to n and store the result in the product variable.

main Method:

public static void main(String[] args) {
    int x = 0;
    System.out.println("The value of factorial x is: " + factorial(x));
    System.out.println("The value of factorial x is: " + factorial_iterative(x));
}
In the main method, the variable x is initialized with the value 0. Then, the factorial and factorial_iterative functions are called with the value of x, and the results are printed using System.out.println.

Output:

csharp
Copy code
The value of factorial x is: 1
The value of factorial x is: 1
The output shows the factorial of the number x, which is 0 in this case. Both the recursive and iterative functions return the correct factorial value of 1 for x = 0.