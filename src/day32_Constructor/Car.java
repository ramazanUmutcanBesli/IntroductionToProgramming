package day32_Constructor;

public class Car {
    public String make, model;
    public int year;
    public double price;
    public String color;
    //1 st Constructor
    public Car(String make){
        this.make=make;
    }
    // 2 nd Constructor
    public Car(String make,String model){
        this(make);
        this.model=model;
    }
    // 3 rd Constructor
    public Car(String make,String model,int year){
        this(make, model);
        this.year=year;
    }
    // 4 th Constructor
    public Car(String make,String model , int year,double price){
        this(make, model, year);
        this.price=price;
    }
    // 5 th Constructor
    public Car(String make,String model,int year,double price ,String color){
        this(make, model, year, price);
        this.color=color;

    }
    // to write console method
    /*public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }*/
}
/*

class name: Car
		 instance variables:
		 		make, model, year, price, color

 		1st constructor: initializes the make ONLY

 		2nd constructor: initializes make & model
 				(MUST use constructor call to set the make)

		3rd constructor: initializes make, model, year
				(MUST use constructor call to set the make, model)

		4th constructor: initializes make, model, year, price
				(MUST use constructor call to set the make, model, year)

		5th Constructor: intializes all the instances
				(MUST use constructor call to set the make, mode, year, price, color)

		instance methods: toString
 */