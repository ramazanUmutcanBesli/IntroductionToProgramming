package day16_ForLoopStringPractice;


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
        "Java" ==> "avaJ" ===> false not palindrome
        Anna ==> annA ====> true
        "Level ==> leveL true

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me String: ");
        String word = scan.next();

        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        boolean isPalindrome = word.equalsIgnoreCase(reversed);
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
