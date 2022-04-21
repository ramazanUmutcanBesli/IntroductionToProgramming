package day35_Encapsulation.encapsulation;

public class Circle {
    private double radius;
    public static double pi =3.14;
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        if(radius<=0){
            System.out.println("Radius of the circle can not be zero or negative");
            System.exit(0);
        }
        this.radius=radius;
    }

    public Circle(double radius) {
        setRadius(radius);
    }
    public double calcArea(){
        return radius*radius*pi;
    }
    public double calcPerimeter(){
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + radius +
                "  Area of Circle=" + calcArea() +
                "  Perimeter of Circle=" + calcPerimeter() +
                '}';
    }
}
/*
Create a class named Circle

			privtae variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the raidus of coircle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()
 */