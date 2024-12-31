package Enums;

/* Key Features of Enums
   Type-Safe Constants
   - Enums ensure that a variable can only take predefined constant values.
   - Example: A variable of type Day cannot take values other than the days defined in the enum.

   Implicit Methods Enums have several built-in methods:
   - values(): Returns an array of all enum constants.
   - ordinal(): Returns the position of the constant (starting from 0).
   - valueOf(String name): Returns the enum constant with the specified name.
*/

public class EnumMethodsExample {
    enum Color {
        RED, GREEN, BLUE
    }

    public static void main(String[] args) {
        // Print all constants
        for (Color color : Color.values()) {
            System.out.println(color + " at index " + color.ordinal());
        }

        // Get enum constant from string
        Color c = Color.valueOf("RED");
        System.out.println("Color is: " + c);
    }
}

