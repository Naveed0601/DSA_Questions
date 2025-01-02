package Exceptions;

/* Custom Exception
   - A custom exception is a user-defined exception class.
   - It allows developers to define application-specific error messages and handling.

   Steps to Create a Custom Exception:
   - Extend the Exception class (or RuntimeException for unchecked exceptions).
   - Provide one or more constructors to initialize the exception.
 */

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Custom_Exceptions {
    public static void main(String[] args) {
        try {
            checkEligibility(15); // Throws InvalidAgeException for age < 18
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Age is valid.");
    }
}
