Code Name: divesh_41_ex2sol

Package and Imports:

package com.company;
import java.util.Random;
import java.util.Scanner;
The code is in the com.company package. It imports classes Random and Scanner from the java.util package to handle random number generation and user input, respectively.

Main Method:

public static void main(String[] args) {
    // Code logic goes here
}
The main method is the entry point of the program, where the actual code execution begins.

User Input:

Scanner sc = new Scanner(System.in);
System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
int userInput = sc.nextInt();
The program takes user input to play Rock-Paper-Scissors. The Scanner class is used to read the input from the user, and the variable userInput stores the user's choice.

Computer Input (Random):

Random random = new Random();
int computerInput = random.nextInt(3);
The computer's choice is generated randomly using the Random class. It generates a random integer between 0 (inclusive) and 3 (exclusive), representing the computer's choice of Rock (0), Paper (1), or Scissors (2). The result is stored in the computerInput variable.

Game Result and Output:

if (userInput == computerInput) {
    System.out.println("Draw");
}
else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
        || userInput == 2 && computerInput == 1) {
    System.out.println("You Win!");
} else {
    System.out.println("Computer Win!");
}
The program determines the result of the Rock-Paper-Scissors game based on the user and computer inputs. If both inputs are the same, it's a draw. If the user wins, it prints "You Win!"; otherwise, it prints "Computer Win!"

Computer Choice Output:

if (computerInput == 0) {
    System.out.println("Computer choice: Rock");
}
else if (computerInput == 1) {
    System.out.println("Computer choice: Paper");
}
else if (computerInput == 2) {
    System.out.println("Computer choice: Scissors");
}
The program displays the computer's choice after the game is played. It prints "Computer choice: Rock", "Computer choice: Paper", or "Computer choice: Scissors" based on the computerInput.

The program simulates a simple Rock-Paper-Scissors game where the user and computer make their choices, and the winner is determined based on the game rules.