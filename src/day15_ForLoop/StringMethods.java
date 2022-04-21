package day15_ForLoop;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String str="";
        boolean r=str.isEmpty();
        System.out.println(r);

        boolean s =str.isBlank();
        System.out.println(s);

        String str2=" Cydeo    ";
        System.out.println(str2.isBlank());
        String s1 ="CYDEO";
        String s2 ="cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("--------------------");
        String sentence ="My favourite programming language is Java";
        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasIgnoreJava=sentence.toLowerCase().contains("java");
        System.out.println("---------------------");
        String input1 ="I love Java";
        String input2="Java";
        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));
        System.out.println(input1.contains("Java"));
        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println(input1.toLowerCase().contains("JAVA"));


        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasIgnoreJava);

        System.out.println("---------------------");
        String a="Wooden Spoon";
        boolean x = a.startsWith("Woo");
        boolean y =a.endsWith("Spoon");
        boolean z= a.toLowerCase().startsWith("wooden");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        String ss=" sss ";
        ss=ss.trim();
        System.out.println(ss);
    }
}
