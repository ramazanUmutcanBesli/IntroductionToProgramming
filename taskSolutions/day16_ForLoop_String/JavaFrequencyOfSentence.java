package day16_ForLoop_String;

import java.util.Scanner;

public class JavaFrequencyOfSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password");
        String str = scan.nextLine();
        String java = "Java";
        String word;
        int count=0;
        for (int i = 0; i < str.length() ; i++) {
            word = str.substring(i, i + 4);
            if (java.equals(word)) {
                count++;
            }else{
                continue;
            }
        }
        System.out.println(count);
        //Java Java Java Java "
    }
}
