package day20_Array;

public class ReverseEachElement {
    public static void main(String[] args) {
        String[] reverseArray = {"java", "phyton", "C#"};
        String reversedName;
        for (int i = 0; i < reverseArray.length; i++) {
            reversedName = "";
            for (int j = reverseArray[i].length(); j > 0; j--) {
                reversedName += reverseArray[i].charAt(j-1);
            }
            System.out.println(reversedName);
        }


    }
}
