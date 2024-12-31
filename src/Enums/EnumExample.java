package Enums;

/* Enums in Java
   - Enums (enumerations) are a special data type in Java used to define a fixed set of constants.
   For example, you might use an enum to represent the days of the week, directions, or traffic light colors.
   - Enums improve code readability and safety by restricting a variable to take only predefined values.
   They are implicitly final, meaning you cannot create subclasses of an enum.
*/

public class EnumExample {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day today = Day.SUNDAY;

        System.out.println("Today is: " + today);

        // Enum in a switch case
        switch (today) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("Weekend is near!");
                break;
            default:
                System.out.println("Another workday.");
        }
    }
}
