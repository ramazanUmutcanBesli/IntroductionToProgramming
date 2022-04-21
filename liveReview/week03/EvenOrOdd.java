package week03;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {


        // Task : find if a given is even number or odd number
        // Hint: use % operator, and control flow statements
        Scanner scan =new Scanner(System.in);
        System.out.println("give me number: ");
        int a = scan.nextInt();
        boolean condition = a%2==0;

        if(condition){
            System.out.println("a is even number");
        }

        else{
            System.out.println("odd number");
        }
    }
}
