package week08;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String searchResult = "1-16 of 289 results for ipad";


        String[] each = searchResult.split(" ");
        System.out.println(Arrays.toString(each));
        String searchAmount =each[2];
        System.out.println("searchAmount = " + searchAmount);
    }
}
