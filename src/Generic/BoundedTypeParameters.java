package Generic;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

interface printable {
    void print();
}

class myNumber extends Number implements printable {
    private final double value;

    public myNumber(double value){
        this.value = value;
    }

    public void print(){
        System.out.println("MyNumber: " + value);
    }

    public int intValue(){
        return (int)value;
    }

    public long longValue(){
        return (long)value;
    }

    public float floatValue(){
        return (float)value;
    }

    public double doubleValue(){
        return (double)value;
    }
}

class Box<T extends Number & printable>{
    private T item;

    public Box(T item){
        this.item = item;
    }

    public void display(){
        item.print();
    }

    public T getItem(){
        return item;
    }
}

public class BoundedTypeParameters {
    public static void main(String[] args) {
        myNumber num = new myNumber(10.01);
        Box<myNumber> box = new Box<>(num);
        box.display();
    }
}
   