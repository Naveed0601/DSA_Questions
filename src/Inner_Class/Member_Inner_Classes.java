package Inner_Class;

/*Member Inner Classes
  - A member inner class is a non-static nested class defined at the same level as other members of the enclosing class.

* Characteristics:
  - Can access all members (both static and non-static) of the enclosing class.
  - Requires an instance of the enclosing class to be instantiated.
*/

public class Member_Inner_Classes {
    private String name = "Naveed";
    private static String email = "email@gmail.com";

     class memberinnerclasses {
        void displayName(){
            System.out.println("Name " + name);
        }
        void displayEmail(){
            System.out.println("Gmail " + email);
        }
    }
}
