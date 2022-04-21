package day14_StringContinue;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "     batch   25    ";// bastaki ve sondaki bosluklari siler
        String str2 = str1.trim();
        System.out.println(str2);
        //

        String str3="Cydeo School";
        int n1 =str3.indexOf("h");
        System.out.println("n1 = " + n1);
        int n2 = str3.indexOf("o");
        System.out.println("n2 = " + n2);
        int n3 =str3.indexOf("C");
        System.out.println("n3 = " + n3);

        String str4= "Java Programming Language";
        int n4 = str4.indexOf("am");
        System.out.println("n4 = " + n4);

        int n5=str4.indexOf("g ");
        System.out.println("n5 = " + n5);
        int n6=str4.lastIndexOf("g");
        System.out.println("n6 = " + n6);
        System.out.println("------------------");
        String s ="Java Nova Cava Wawa orange";

        int firstA= s.indexOf("a");
        System.out.println("firstA = " + firstA);
        int secondA= s.indexOf("a ");
        System.out.println("secondA = " + secondA);
        int thirdA=s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);
        int fourthA = s.lastIndexOf("ava W");
        System.out.println("fourthA = " + fourthA);
        int fifthA = s.lastIndexOf("a ");
        System.out.println("fifthA = " + fifthA);
        int sixthA = s.lastIndexOf("aw");
        int seventhA=s.indexOf("a o");
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);

        int lastA= s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);
    }
}
