package Static;

/*
* static Keyword
* The static keyword indicates that a field, method, or block belongs to the class rather than an
* instance of the class. Static members are shared across all instances.
*/

/*
*  Static Variable
A static variable is a variable that is shared among all instances of a class. It is associated with the
* class rather than with any object.
*
*/

class Counter {
    static int count = 0;

    Counter(){
        count++;
    }

    static int displayCounter(){
        return count;
    }
}

public class main {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        System.out.println(Counter.displayCounter());
    }
}
