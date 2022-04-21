package day25_CustomMethod_Overloading;

import java.util.Scanner;

public class HausaufgabeFurFreitag {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a number:");
        String result2="";
        int num = scan.nextInt();
        if(kontrol(num)==true){
            result2=islem(num);
            System.out.println(result2);
        }


    }
    public static boolean kontrol(int num1){


        boolean result3 =true;
        if(num1==0){
            System.out.println("Now");
            result3=false;
        }else if(num1<0){
            System.err.println("You must give positive number!!!");
            result3=false;
        }


        return result3;
    }
    public static String islem (int num2){
        String result="";
        int min = 60;
        int hour =60*min;
        int day= 24*hour;
        int year=365*day;
        int y = (int) (num2/year);
        int d =(int)((num2%year)/day);
        int h=(int)((num2%day)/hour);
        int m=(int)((num2%hour)/min);
        int s=(int)((num2%min));
        result="The given number is "+y+" year "+d+" day "+h+" hour "+m+" minute "+s+" second!";

        return result;
    }
}
