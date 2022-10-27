package deneme;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println(" Enter a word: ");
        String str= scan.nextLine();
        Pattern pattern=Pattern.compile(str,Pattern.CASE_INSENSITIVE);
        Matcher matcher= pattern.matcher("Visit W3schools!");
        boolean matchFound= matcher.find();
        if (matchFound){
            System.out.println("Match found");
        }else{
            System.out.println("Match not found");
        }
    }
}
