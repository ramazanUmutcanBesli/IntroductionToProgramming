package day13_String;

public class StringIntro {
    public static void main(String[] args) {
        String name = "Wooden spoon";
        String name2 = "Wooden spoon";
        String name3 = "Wooden spoon";
        String name4 = "Wooden spoon";

        System.out.println(name == name2);


        System.out.println("----------------");

        String str1 = new String("Wooden spoon");
        String str2 = new String("Wooden spoon");
        String str3 = new String("Wooden spoon");
        String str4 = new String("Wooden spoon");
        System.out.println(str1 == str2);
        String s1= "Java";
        String s2 = new String("Java");
        System.out.println(s1.equals(s2));

        System.out.println("----------------------");



    }
}
