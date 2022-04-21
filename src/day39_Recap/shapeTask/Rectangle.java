package day39_Recap.shapeTask;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle( double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if(length<=0){
            System.err.println("Invalid length "+ length);
            System.exit(1);
        }
        this.length=length;
    }

    public void setWidth(double width) {
        if(width<=0){
            System.err.println("Invalid width "+ width);
            System.exit(1);
        }
        this.width=width;
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                "area of Rectangle = " + area() +
                "perimeter of Rectangle = " + perimeter() +
                '}';
    }
}
/*
Rectangle extends Shape:
	variables:
		length
		width

	Encapsulate the fields

	Add a constructor to set the filed

	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter

 */