package day44_AbstractionTasks;

public class CydeoCar extends Car implements AutoPilot,AutoPark,Flyable{
    public CydeoCar( String model, int year, double price, String color) {
        super("Cydeo Car", model, year, price, color);
    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" park auto");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+ getModel()+" drive auto");
    }

    @Override
    public void start() {
        System.out.println(getMake()+" "+ getModel()+" started");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" "+ getModel()+" drived");
    }

    @Override
    public void fly() {
        System.out.println(getMake()+" "+ getModel()+" can fly");
    }
}
