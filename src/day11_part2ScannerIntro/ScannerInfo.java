package day11_part2ScannerIntro;
import java.util.Scanner;
public class ScannerInfo {
    /*
    provides the methods to get inputs
    presented in java.util.package
    need to be imported in our Program
    -------------------------------
    must be instantiated before it can be used
    the parameter System.in passed to the Scanner's Constructor to connect
    the scanner to the keyboard

    Scanner keyboard= new Scanner(System.in);
    System.in put info in the system

     */

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num1=a.nextInt();

        System.out.println("Enter a Decimal: ");
        double num2 =a.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("multiplication: "+ (num1*num2));

        a.close();//After close method we can not use scanner class




        System.out.println("Enter an Integer: ");
        int num3=a.nextInt();
        System.out.println(num3);


    }
}
