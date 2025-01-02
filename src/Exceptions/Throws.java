package Exceptions;

/* throws Keyword
   - The throws keyword is used in a method signature to declare the exceptions that a method might throw.
     It informs the calling method or the caller of the exception.
*/

import java.io.FileReader;
import java.io.IOException;

public class Throws {

    public static void readFile() throws IOException {
        FileReader file = new FileReader("nonexist.txt");
    }


    public static void main(String[] args) {
        try{
            readFile();
        }catch(IOException e){
            System.out.println("Exception Error: " + e);
        }
    }
}
