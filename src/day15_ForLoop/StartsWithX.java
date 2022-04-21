package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        System.out.println("give me word");
        String word =new Scanner(System.in).next();//xcodex
        if(word.charAt(0)=='x'){
            word=word.replaceFirst("x","a");
        }
        System.out.println(word);
    }
}
