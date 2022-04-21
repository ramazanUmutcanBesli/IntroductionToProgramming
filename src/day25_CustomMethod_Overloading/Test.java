package day25_CustomMethod_Overloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {
        String str = "Java Programming Language";
        StringUtility.printEachChar(str);
        String result = StringUtility.reverse(str);
        System.out.println(result);
        System.out.println("-------------");
        String word = "civic";
        boolean palindrome = StringUtility.isPalindrome(word);
        System.out.println("palindrome = " + palindrome);
        String[] names={"Anna","Java","Python","racecar","Mom","cydeo"};
        int count= 0;
        for (String name : names) {
            if(StringUtility.isPalindrome(name)){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("----------------------");

        String s2="aaaaabbbbbbbbccccccccccd";
        String nonDup=StringUtility.removeDuplicates(s2);
        System.out.println(nonDup);
    }

}
