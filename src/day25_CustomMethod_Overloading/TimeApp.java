package day25_CustomMethod_Overloading;

public class TimeApp {


    public static void main(String[] args) {
        double num2 =1000000000;
        int min =60;
        int hour=60*min;
        int day =24*hour;
        int year=365*day;
        int y = (int) (num2/year);
        int d =(int)((num2%year)/day);
        int h=(int)((num2%day)/hour);
        int m=(int)((num2%hour)/min);
        int s=(int)((num2%min));

    }


}
