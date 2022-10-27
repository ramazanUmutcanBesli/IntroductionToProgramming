package day44_AbstractionTasks;








public abstract class Car {
    private final String make, model;
    private final int year;
    private double price;
    private String color;
    // Constructors
    public Car(String make, String model, int year, double price, String color) {
        this.make = make;
        this.model = model;
        if (year<=1886){
            throw new RuntimeException("Invalid year");
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }
    // Encapsulate
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price<=0){
            throw new RuntimeException("Invalid price: "+ price);
        }
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if (color.isEmpty()||color.isBlank()){
            throw new RuntimeException("Invalid color");
        }
        this.color = color;
    }
    // Abstract Methods:
    public abstract void start();
    public abstract void drive();
    // No-Abstract Methods:
    public void stop(){
        System.out.println(getMake()+" "+ getModel()+ " is stopping");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
