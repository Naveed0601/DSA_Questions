package Abstract;

/*
 - Abstraction is the concept of hiding implementation details and showing only the essential features of an object.
   It is achieved through abstract classes and interfaces.
   It allows a class to define the structure of methods without providing their implementation.
 */

abstract class A{
    public abstract void drive();
}

class B extends A{
    public void drive(){
        System.out.println("Drive...");
    }
}


public class main {
    public static void main(String[] args) {
     A a = new B();
     a.drive();
    }
}
