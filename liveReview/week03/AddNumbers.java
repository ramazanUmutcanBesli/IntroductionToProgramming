package week03;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        // * Arithmetic Operators
        // -,+,*,/,%
        // We need to declare 5 variables as double data type num1 num2 num3 num4 and total
        double num1, num2, num3, num4, total ;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter 4 numbers");
        num1=scan.nextDouble();
        num2= scan.nextDouble();
        num3= scan.nextDouble();
        num4= scan.nextDouble();

        total= num1+num2+num3+num4;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("total = " + total);
    }
}
