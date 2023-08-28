package com.company;

public class CustomCalculator {

    public static void main(String[] args) {
        /*
        Custom Calculator:
        This program implements a custom calculator with the following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        
        It also handles specific exceptions:
        1. InvalidInputException - Thrown for invalid input, e.g., non-numeric values.
        2. CannotDivideByZeroException - Thrown when division by zero is attempted.
        3. MaxInputException - Thrown when any input value is greater than 100000.
        4. MaxMultiplierReachedException - Thrown when multiplication input is greater than 7000.
        */

        // TODO: Implement the custom calculator operations and exception handling here
        
        // Example usage:
        try {
            int result = performOperation("+", 10, 20); // Perform addition
            System.out.println("Result: " + result);
            
            result = performOperation("*", 8000, 3); // Perform multiplication
            System.out.println("Result: " + result);
            
            // Perform more operations...
        } catch (InvalidInputException | CannotDivideByZeroException | MaxInputException | MaxMultiplierReachedException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    
    // TODO: Implement the performOperation method that carries out the calculations and exception handling
}

Note: The provided code is a template for creating a custom calculator program with specified operations and exception handling. The actual implementation of the calculator operations and the custom exceptions (e.g., InvalidInputException, CannotDivideByZeroException, MaxInputException, MaxMultiplierReachedException) is missing. You need to complete the code by implementing the operations and exception handling in the CustomCalculator class.