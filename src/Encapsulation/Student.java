package Encapsulation;

public class Student {
    private String name;
    private int roll_number;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setRoll_number(int roll_number){
        this.roll_number = roll_number;
    }

    public int getRoll_number(){
        return this.roll_number;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}
