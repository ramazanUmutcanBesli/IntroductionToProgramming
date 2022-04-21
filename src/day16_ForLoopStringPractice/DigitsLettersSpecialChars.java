package day16_ForLoopStringPractice;

import java.util.Scanner;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Give me a String: ");
        String str = scan.nextLine();

        String digits = "";// 12345
        String letters = "";//cydeoWoodenSpoon
        String specialChars = "";//%$#
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digits += ch;
            }else if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                letters+=ch;
            }else{
                if(ch!=' '){
                specialChars+=ch;
                }
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}
