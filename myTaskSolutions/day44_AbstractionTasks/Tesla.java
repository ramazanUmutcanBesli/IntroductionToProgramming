package day44_AbstractionTasks;

public class Tesla extends Car implements AutoPark,AutoPilot{
    public Tesla( String model, int year, double price, String color) {
        super("Tesla", model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake()+" is starting");
    }

    @Override
    public void drive() {
        System.out.println(getMake()+" is driving");

    }

    @Override
    public void autoPark() {
        System.out.println(getMake()+" is parking automatically");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" is driving self");
    }
}
