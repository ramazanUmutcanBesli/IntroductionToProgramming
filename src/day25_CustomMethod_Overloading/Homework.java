package day25_CustomMethod_Overloading;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // Try to take input from User
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number:");
        int num = scan.nextInt();
        String sonuc = kontrolAndIslem(num);
        System.out.println(sonuc);
    }
    public static String kontrolAndIslem(int num2){

        String result="";
        if(num2==0){
            // Kontrolling process
            System.out.println("Now");

        }else if(num2<0){
            // Kontrolling Process
            System.err.println("You must give positive Integer!!!");
                    }
        else {
            // Calculation Process
            int min = 60;
            int hour =60*min;
            int day= 24*hour;
            int year=365*day;
            int y =  (num2/year); // to calculate year
            int d =((num2%year)/day); // to calculate day
            int h=((num2%day)/hour); // to calculate hour
            int m=((num2%hour)/min); // to calculate minute
            int s=((num2%min)); // to calculate second
             result="The given number is "+y+" year "+d+" day "+h+" hour "+m+" minute "+s+" second!";
        }
        return result;
    }
}
