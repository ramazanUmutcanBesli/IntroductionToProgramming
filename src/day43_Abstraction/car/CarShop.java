package day43_Abstraction.car;

import inheritance_Quız.question6.A;

public class CarShop {
    public static void main(String[] args) {
        // Car car1 =new Car("Cydeo","B25","blue",2022,100000);
        // Car class is abstract class that can not be instantianed
        // we can not create object from Abstract class
        // abstract class is not concrete
        Honda honda = new Honda("Accord", "Black", 2019, 30000);
        Audi audi = new Audi("q7", "blue", 2020, 45000);
        Tesla tesla = new Tesla("Model3", "White", 2021, 60000);
        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
        
    }
}
