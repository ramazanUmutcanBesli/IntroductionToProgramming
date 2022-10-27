package day44_AbstractionTasks;

public class Toyota extends Car{
    @Override
    public void start() {
        System.out.println(getMake()+" "+getModel()+" is starting with key");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" is driving by using wheel");
    }

    public Toyota( String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }
}
