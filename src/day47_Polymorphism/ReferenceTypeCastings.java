package day47_Polymorphism;

import day43_Abstraction.employee.Employee;
import day43_Abstraction.employee.Tester;
import day44_Abstraction.animalTask.Animal;
import day44_Abstraction.animalTask.Cat;
import day44_Abstraction.animalTask.Dog;
import day45_Abstraction.shape.Circle;
import day45_Abstraction.shape.Shape;
import day45_Abstraction.shape.Square;

public class ReferenceTypeCastings {
    public static void main(String[] args) {
        Shape shape2 =new Circle(5);
        Animal animal =new Dog("max","husky",'M',3,"small","white");
        //Dog dog =(Dog) animal; // downcasting
        System.out.println(animal.getName());
        //System.out.println(dog.getName());
        ((Dog)animal).bark();

        Shape shape1 =new Square(5);
        System.out.println(((Square)shape1).getSide());
        System.out.println("---------------------------------------------");
        Animal animal2=new Cat("Jım","Scotish",'M',3,"Small","White");
        ((Cat)animal2).Meow();
        System.out.println("---------------------------------");
        Employee employee = new Tester("Ali",30,'M',42,"SDET",145000.00);
        ((Tester)employee).bugReport();

    }
}
