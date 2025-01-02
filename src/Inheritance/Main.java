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

class Person {
    String name;

    // Constructor with parameter
    Person(String name) {
        this.name = name; // 'this' differentiates the instance variable from the parameter
    }

    void displayInfo() {
        System.out.println("Name: " + this.name); // 'this' refers to the current object's name
    }
}

