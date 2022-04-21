package week07;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*Scanner scan =new Scanner(System.in);
        System.out.println("give me number: ");
        int number = scan.nextInt();
        for (int i = 1; i <= number ; i++) {

        }*/
        /*
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            System.out.print(i + " ");
            int n = i;
            for (int j = 1; j < i; j++) {
                if (j % 2 != 0) {
                    System.out.print((n + ((2 * (rows + 1 - i)) - 1)) + " ");
                    n = n + ((2 * (rows + 1 - i)) - 1);
                } else {
                    System.out.print((n + 2 * (i - j)) + " ");
                    n = n + 2 * (i - j);
                }
            }
            System.out.println();
        }
    */
        int rowCount = 5;
        for (int row = 1; row <= rowCount; row++) {

            int value = row;
            for (int col = 1; col <= row; col++) {
                System.out.print(value + " ");
                value += rowCount - col;
            }
            System.out.println();
        }
    }
}
