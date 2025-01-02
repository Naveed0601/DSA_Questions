package Inner_Class;

/*
Static Nested Classes
A static nested class is a nested class that is declared with the static modifier.

* Characteristics:
* It behaves like a top-level class but is nested inside another class.
* Can access the static members of the enclosing class but cannot access non-static members directly.
* Instantiated without a reference to an instance of the enclosing class.
*/


public class Static_Nested_Class {
     private static String message = "Static Message";
     static String names = "Sarfaraz";

     static class staticNestedClass {
         void display(){
             System.out.println("The static message" + message);
         }
         void name(){
             System.out.println("Name " + names);
         }
     }
}
