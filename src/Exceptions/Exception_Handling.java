package Exceptions;

/* Exception Handling
   - Java provides a robust mechanism to handle exceptions using try, catch, finally, throw, and throws.
 */

public class Exception_Handling {
    public static void main(String[] args) {
        try{
            int result = 10 / 0;
            System.out.println("Result " + result);
        }catch (ArithmeticException e){
            System.out.println("Exception caught: " + e);
        }
        finally {
            System.out.println("Finally block always executes.");
        }
    }
}
