package Final;

public class Final_Example {
    class Constants {
        final double PI = 3.14159; // Value cannot be changed

        void displayPI() {
            System.out.println("PI: " + PI);
        }
    }

    class Animal {
        final void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        // Attempting to override will cause a compile-time error
        // void makeSound() { System.out.println("Dog barks"); }
    }

    final class FinalClass {
        void displayMessage() {
            System.out.println("This is a final class");
        }
    }
}
