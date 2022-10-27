package day02_HelloWorld;

import java.util.Scanner;

public class Metin {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Give me a number");
        int number= scan.nextInt();
        boolean a=number>=1&&number<=12;
        if (a){
            System.out.println("geçti");
        }else{
            System.out.println("kaldı");
        }
    }
}
