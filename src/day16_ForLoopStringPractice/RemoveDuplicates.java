package day16_ForLoopStringPractice;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("give me dublicate: ");
        String str =scan.next();
        String result="";

        for (int i = 0; i <=str.length() ; i++) {
            String ch =""+str.charAt(i);
            if(!result.contains(ch)){
                result+=ch;
            }

        }
        System.out.println(result);
    }
}
