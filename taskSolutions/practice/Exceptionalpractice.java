package practice;

import java.util.Scanner;

public class Exceptionalpractice {
    public static void main(String[] args) {
        method();
    }
    static void method(){
        Scanner scan =new Scanner(System.in);
        int b =scan.nextInt();
        String s ="java.lang.Exception: Breadth and height must be positive";
        int h=scan.nextInt();
        if((b<=100&&b>=-100)&&(h<=100&&h>=-100)){
            if(b<0 || h<0){
                System.out.println(s);
            }
            else{
                System.out.println(b*h);
            }

        }
    }
}
