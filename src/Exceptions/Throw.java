package Exceptions;
/* Throw Keyword
   - The throw keyword is used to explicitly throw an exception in Java. It can be used with any throwable object.
 */
public class Throw {
    public static void main(String[] args) {
        try {
            validateAge(15); // Throws exception for age < 18
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        }
        System.out.println("Age is valid.");
    }
}
