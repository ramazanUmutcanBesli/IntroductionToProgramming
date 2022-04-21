package week05;

public class ReverseUsingCharAtMethod {
    public static void main(String[] args) {
        // palindrome
        // "madam" when you reverse :"madam" again || KAYAK is palindrom
        //, noon : palindrome PIQ forJAVA

        String word = "madam";
        System.out.println(word.charAt(word.length()-1));
        System.out.println(word.charAt(word.length()-2));
        System.out.println(word.charAt(word.length()-3));
        System.out.println(word.charAt(word.length()-4));
        System.out.println(word.charAt(word.length()-5));
        String reversedWord="";
        reversedWord+=word.charAt(4);
        reversedWord+=word.charAt(3);
        reversedWord+=word.charAt(2);
        reversedWord+=word.charAt(1);
        reversedWord+=word.charAt(0);
        if(word.equals(reversedWord)){
            System.out.println("the word is palindrome");
        }else{
            System.out.println("the word is not palindrome");
        }
    }
}
