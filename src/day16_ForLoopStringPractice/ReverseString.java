package day16_ForLoopStringPractice;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("give me String:");
        String str = scan.nextLine();
        String result="";
        for(int i = str.length()-1;i>=0; i--){
            result+=str.toLowerCase().charAt(i);
        }
        System.out.println(result);
    }
}
