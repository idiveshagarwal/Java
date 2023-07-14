/*
while (Boolean condition)
{
    // Statements    -> This keeps executing as long as the condition is true.
}
*/
int i=10;  
while(i>0){  
    System.out.println(i);  
    i--;  
}  

package com.company;

public class loops {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        System.out.println("Using Loops:");
        int i = 100;
        while(i<=200){
            System.out.println(i);
            i++;
        }
        System.out.println("Finish Running While Loop!");

//        while(true){
//            System.out.println("I am an infinite while loop!");
//        }
    }
}

The code above demonstrates the usage of the while loop in Java. Each line is commented with a description.

The commented lines represent the structure of the while loop. It keeps executing the statements within the block as long as the condition is true.

The active code initializes an integer variable i with a value of 10. It then enters a while loop that checks if i is greater than 0. If the condition is true, it prints the value of i, decrements i by 1, and continues to the next iteration. The loop continues until i becomes 0, and then exits.

The code also includes additional lines outside the while loop to demonstrate the usage of loops. It prints the numbers 1, 2, and 3. After that, it enters a while loop that prints numbers from 100 to 200, incrementing i by 1 in each iteration.

The output of the code will be the numbers 1, 2, 3 (printed individually), followed by the numbers 100 to 200 (printed sequentially), and finally the message "Finish Running While Loop!".

The commented lines show an example of an infinite while loop using the condition while(true). Uncommenting those lines will result in an infinite loop that continuously prints the message "I am an infinite while loop!".