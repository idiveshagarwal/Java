// Custom exception class NegativeRadiusException
class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

// Main class definition
public class ThrowThrowsExample {

    // Method to calculate the area of a circle
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException(); // Throw the custom exception if radius is negative
        }
        double result = Math.PI * r * r;
        return result;
    }

    // Method to divide two integers
    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b; // Division operation
        return result;
    }

    public static void main(String[] args) {
        try {
            // Uncomment the following lines to see the division example
            // int c = divide(6, 0); // This will throw an ArithmeticException
            // System.out.println(c);
            
            double ar = area(6); // Calculate the area of a circle
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println("Exception"); // Catch and handle any exception that occurs
        }
    }
}
