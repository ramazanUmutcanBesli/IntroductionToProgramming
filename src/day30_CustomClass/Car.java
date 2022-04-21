package day30_CustomClass;
/*
Car class
Attributes:
    brand, model,color,year, price

Actions:
    drıve() start() stop() toString, setInfo
 */

public class Car {
    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    public void drive() {
        System.out.println(brand + " " + model + " is drıvıng");
    }

    public void start() {
        System.out.println(brand + model + " ıs starting");
    }

    public void stop() {
        System.out.println(brand + model + " is stoping");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }// printing object to console

    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice) {
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        price = carPrice;

    }

}
