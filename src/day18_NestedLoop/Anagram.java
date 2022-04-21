package day18_NestedLoop;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("word1");
        String word1 = scan.next().toLowerCase();
        System.out.println("word2");
        String word2 = scan.next().toLowerCase();
        boolean anagram=true;
        if(word1.length()==word2.length()){
            for (int i = 0; i < word1.length(); i++) {
                if(word2.contains(word1.substring(i,i+1))){
                    word2=word2.replaceFirst(word1.substring(i,i+1),"");
                }else{
                    anagram=false;
                }
            }
            if(word2.isEmpty()){
                anagram=true;
            }
        }else{
            anagram=false;
        }
        System.out.println(anagram);
    }
}
