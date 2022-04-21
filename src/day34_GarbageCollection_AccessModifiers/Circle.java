package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi ;
    public static String name;
    public static ArrayList<Integer>numbers;
    public Circle(double radius){
        this.radius=radius;
        // pi=3.14; pi is the static variable we should not call in constructors
        // because constructors turn the number of objects but statics run only 1 time
    }
    static{
        // radius = 5; we can not use instance variable in static blocks
        pi =3.14;
        name="Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }
    /*
    public static void main(String[] args) {
        pi =3.14;
        name="Circle";
        numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }*/
}
