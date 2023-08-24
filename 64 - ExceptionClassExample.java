// Custom exception class derived from Exception
class MyException extends Exception {
    // Overridden methods
}

// Importing Scanner class from java.util package
import java.util.Scanner;

// Custom exception class MyException
class MyException extends Exception {
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

// Custom exception class MaxAgeException
class MaxAgeException extends Exception {
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that the value of age entered is correct";
    }
}

// Main class definition
public class ExceptionClassExample {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); // Reading user input
        
        if (a < 9) {
            try {
                // Uncomment this line to throw your custom exception
                // throw new MyException();
                
                // Throwing an ArithmeticException with a custom message
                throw new ArithmeticException("This is an exception");
            } catch (Exception e) {
                // Printing exception details
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
            
            System.out.println("Yes Finished");
        }
    }
}
