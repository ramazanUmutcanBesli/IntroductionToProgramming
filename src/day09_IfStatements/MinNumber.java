package day09_IfStatements;
import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        /*
        n1&n2
        possibility  1 : n1 is min
        possibility  2 : n2 is min
        possibility  3 : equal

         */
        Scanner scan = new Scanner(System.in);
        System.out.print("give me number 1: ");
        int num1 =scan.nextInt();
        System.out.print("give me number 2 :");
        int num2 =scan.nextInt();

        boolean n1IsMin =num1<num2;
        boolean n2IsMin =num2<num1;
        boolean n3IsEqual=num1==num2;
        if(n1IsMin){// if n1 is the minimum number
            System.out.println(num1+" is a minimum number");
        }

        if(n2IsMin){// if n2 is the minimum number
            System.out.println(num2+" is a minimum number2");
        }
        if(n3IsEqual){
            System.out.println("Equal");
        }

    }
}
