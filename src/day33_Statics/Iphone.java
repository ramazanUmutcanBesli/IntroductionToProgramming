package day33_Statics;

public class Iphone {
    public static String brand = "Apple";
    public String model;
    public double price;
    public static String OS = "IOS";
    public String color;
    public String size;
    public static String madeIn = "China";
    public static boolean hasBattery = true;
    public static boolean isTouchScreen = true;
    public static boolean hasFaceTime = true;
    /* COMPİLER ERROR
    public static void printModelandPrice(){
        System.out.println(model+" : "+ price);// static method does not accept instance attributes
    }*/
    public void method1(){
        System.out.println(model+" : "+ price);// instance method can accept instance attributes and static attributes
        System.out.println(OS);
    }


}
