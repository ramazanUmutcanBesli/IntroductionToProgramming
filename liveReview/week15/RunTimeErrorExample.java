package week15;

import java.util.Scanner;

public class RunTimeErrorExample {
    public static void main(String[] args) {
        System.out.println("Hello");
        int x =5;
        int y= new Scanner(System.in).nextInt();
        // if there is a line of code that i might get exception expectation
        try {
            System.out.println(x / y);
        }catch(Exception e){

        }
        System.out.println("How are you today ?");
        System.out.println("Some more lines of code");
    }
}
