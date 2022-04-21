package day32_Constructor;

public class Carpet {
    public double width;
    public double length;
    public double unitPrice;
    public boolean ısPersian;

    public Carpet(double width, double length, double unitPrice, boolean ısPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.ısPersian = ısPersian;

    }
    public double calcCost(){
        double totalPrice=(width*length)*unitPrice;
        if(ısPersian){
            totalPrice+=200;
        }
        return totalPrice;
    }


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", ısPersian=" + ısPersian +
                ", total price = $" + calcCost() +
                '}';
    }
}
