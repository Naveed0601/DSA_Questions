package Inner_Class;

/* Local Inner Classes
   - A local inner class is a nested class defined within a block, typically inside a method or constructor.

 * Characteristics:
   - Only accessible within the block where it is defined.
   - Can access members of the enclosing class and local variables marked as final or effectively final.
*/

public class Local_Inner_Class {
    final String name = "Naveed";
    void method(){
        String localMessage = "Local Message";

        class localInnerClass {
            void display(){
                System.out.println("Message " + localMessage);
            }
            void displayName(){
                System.out.println("Name " + name);
            }
        }
        localInnerClass local = new localInnerClass();
        local.display();
        local.displayName();
    }
}
