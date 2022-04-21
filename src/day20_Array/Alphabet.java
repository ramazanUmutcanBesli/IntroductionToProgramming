package day20_Array;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {
        //26 characters
        char[] alphabets = new char[26];
        // Z-A
        /*
        alphabets[0]='Z';// ASCII table 90
        alphabets[1]='Y';//89
        */
        /*
        for (int i =0; i< alphabets.length;i++,ch--) {
            alphabets[i]=ch;
        }*/
        for(char i =0, j='Z'; i< alphabets.length;i++,j--){
            alphabets[i]=j;

        }
        System.out.println(Arrays.toString(alphabets));// print the whole array
        //System.out.println(alphabets[0]);// printing the element of array

    }
}
/*
        Arrays Utility
        toString(array): converts array to string

 */