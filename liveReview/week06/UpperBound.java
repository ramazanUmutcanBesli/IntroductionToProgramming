package week06;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me upperBound ");
        int x = scan.nextInt();
        int j = 0;
        int sum = 0;
        boolean check = true;
        for (; check; ) {
            if (x >= 1) {
                for (int i = 1; i <= x; i++) {
                    j += i;
                    sum++;
                }
                check = false;


            } else {
                System.out.println();
                x = scan.nextInt();
                check = true;
            }


        }System.out.println(j);
    }}