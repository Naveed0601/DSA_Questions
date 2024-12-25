package Inheritance;

public class Animal {
    private String name;
    private int age;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void sayHello(){
        System.out.println("");
    }
}
