package week06;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("give me term");
        int term= scan.nextInt();
        int result=0;
        for (int i = 1; i <=term ; ) {
                result+=i;
                i=result;
        }

        System.out.println(result);
    }
}
