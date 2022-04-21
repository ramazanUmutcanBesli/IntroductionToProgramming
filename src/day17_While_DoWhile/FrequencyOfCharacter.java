package day17_While_DoWhile;

import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        System.out.println("Give me String");
        String str =scan.nextLine();
        System.out.println("Give me char");
        String ch =scan.next();
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch.charAt(0)){
                count++;
            }
        }
        System.out.println(count);

    }
}
