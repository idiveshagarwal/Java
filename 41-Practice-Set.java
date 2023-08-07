package com.company;
import java.util.Random;
import java.util.Scanner;

// Defining a class named Game
class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    // Getter for noOfGuesses
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    // Setter for noOfGuesses
    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    // Constructor to generate a random number
    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    // Method to take user input
    void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    // Method to check if the guessed number is correct
    boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.format("Yes, you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("Too low...");
        } else if (inputNumber > number) {
            System.out.println("Too high...");
        }
        return false;
    }
}

// Defining the main class named PracticeSet_50_ex3sol
public class PracticeSet_50_ex3sol {
    public static void main(String[] args) {
        /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */

        // Creating an instance of the Game class
        Game g = new Game();
        boolean b = false;
        // Running a loop until the user guesses the correct number
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}

In this code:

The Game class defines the logic for a "Guess the Number" game.
It has methods to generate a random number, take user input, check if the guessed number is correct, and manage the number of guesses.
The PracticeSet_50_ex3sol class contains the main method where you create an instance of the Game class and play the game within a loop until the user guesses the correct number.
Your code successfully implements the requirements of the game, and the descriptions you provided for each line are accurate.