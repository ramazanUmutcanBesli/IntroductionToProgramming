package week05;

import java.util.Scanner;

public class EmailCheckInterview {
    public static void main(String[] args) {
           /*
    Your team has created a new bank website that requires email address to be validated.
    The email string must contain an '@' character.
    The email string must contain an '.' character.
    The '@' must contain at least one character in front of it.
    e.g. "a@example.com" is valid while "@example.com" is invalid.
    The '.' and '@' must be in the appropriate places.
    e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
    For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
    Examples:
    str = "test@example.com" --> true
    str = "test@example.co.in --> true
    str = "@example.com" --> false
             */
        Scanner scan = new Scanner(System.in);
        System.out.println("please a valid email address: mike.smith@hotmail.com");
        String email= scan.next();
        boolean result = true;
        int atSignIndex = email.indexOf("@");
        int dotIndex = email.lastIndexOf(".");

        if(atSignIndex<1||atSignIndex>=email.length()-3||atSignIndex!=email.lastIndexOf("@")){
            result=false;
        }
        if(dotIndex<1// 0 (no character before dot sign) or -1 (there is no dot sign)
                ||dotIndex==email.length()-1// checking if it is the last character
                ||atSignIndex>dotIndex// checking if @ sign before dot sign
                ||atSignIndex+1==dotIndex){//checking if there is a character between @ sign and dot sign
            result=false;

        }
        System.out.println(result);
    }
}
