package Exceptions;

/* Checked Exceptions
   - Checked exceptions are exceptions that are checked at compile-time.
   - The Java compiler ensures that these exceptions are either handled using a
   try-catch block or declared in the method signature using the throws keyword.
   - Examples: IOException, SQLException, FileNotFoundException.
 */

/* Unchecked Exceptions
   - Unchecked exceptions are exceptions that are checked at runtime.
   - These exceptions are subclasses of RuntimeException.
   - They do not need to be explicitly handled or declared in the method signature.
   - Examples: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked_and_Unchecked {
    public static void main(String[] args) {
        //Checked Exception
        try {
            FileReader file = new FileReader("nonexits.txt");
        }catch(FileNotFoundException e){
            System.out.println("Checked Exception" + e);
        }

        //UnChecked Exception
        try {
            int result = 10 / 0;
        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException" + e);
        }
    }
}
