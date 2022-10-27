package day44_AbstractionTasks;

public class Audi extends Car implements AutoPark{
    public Audi( String model, int year, double price, String color) {
        super("Audi", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" "+getModel()+" is starting with start button");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+getModel()+" is driving itself");
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" can be parking automatically");
    }
}
