package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 ="acdb";
        String str2 ="dbcax";

        char[] ch1 =str1.toCharArray();
        char[] ch2 =str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);/* First Way
        for (int i = 0; i < ch1.length; i++) {
            if(!(ch1[i]==ch2[i])){
                System.err.println("It is not anagram");
                System.exit(0);
            }


        }
        System.out.println("IT is anagram");*/
        boolean anagram =Arrays.equals(ch1,ch2);
        System.out.println("Anagram= "+ anagram);
    }
}
