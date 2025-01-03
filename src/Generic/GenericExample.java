package Generic;
/* Generics in Java
   - Generics in Java allow you to write a class, interface,
     or method that can work with any data type while providing compile-time type safety.
     Instead of working with raw types (such as Object), generics enable you to define types that are parameterized,
     allowing for more flexible and reusable code.
*/

/* Why Use Generics?
Type Safety: Generics enforce type safety at compile time, preventing ClassCastExceptions at runtime.
             It ensures that you cannot insert incompatible types into a collection or method.

Code Reusability: By using generics, you can write a single class, method,
                  or interface that works with different types without duplicating code.

Eliminate Casting: With generics, you don't need to cast objects manually.
                   This simplifies code and avoids runtime errors.

Maintainability: It makes the code cleaner and easier to maintain
                 because you don't have to write separate methods or classes for each data type.

 */

import java.util.ArrayList;

public class GenericExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(100);
        System.out.println(nums.get(1));
    }

}
