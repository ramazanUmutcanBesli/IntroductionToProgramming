package day31_ConstructorsWithText;

public class Rectangle {
    public double length, wıdth;

    public Rectangle(double length, double wıdth) {
        this.length = length;
        this.wıdth = wıdth;
    }
    public double calcArea(){
        return wıdth*length;
    }
    public double calcPerimeter(){
        return 2*(wıdth+length);

    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", wıdth=" + wıdth +
                ", Area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
