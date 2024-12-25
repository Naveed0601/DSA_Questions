package Inheritance;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Tiger");
        cat.setAge(2);
        System.out.println(cat.getAge());
        System.out.println(cat.getName());

        cat.sayHello();
    }
}
