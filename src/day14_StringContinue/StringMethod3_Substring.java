package day14_StringContinue;

import java.util.Scanner;

public class StringMethod3_Substring {
    public static void main(String[] args) {
        //substring(beginning index, ending index ) okuma methodu araliklari yada bastan sona okumayi saglar

        String word = "Cydeo School";
        word=word.substring(0,4);// ending index not included
        System.out.println("word = " + word);
        String word2 ="Java Programming Language";
        String s1=word2.substring(0,word2.indexOf(" "));
        String s2=word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));
        String s3= word2.substring(word2.lastIndexOf(" ")+1);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        String word3 = "Python C# Ruby";
        String s11 =word3.substring(0,word3.indexOf(" "));
        String s12 =word3.substring(word3.indexOf(" ")+1,word3.lastIndexOf(" "));
        String s13 =word3.substring(word3.lastIndexOf(" ")+1);
        System.out.println("s11 = " + s11);
        System.out.println("s12 = " + s12);
        System.out.println("s13 = " + s13);
        Scanner scan =new Scanner(System.in);
        System.out.println("Give me your email: ");
        String email=scan.next();
        String name=email.substring(0,email.indexOf("."));
        System.out.println("Your name is: " + name);
        String surname= email.substring(email.indexOf(".")+1,email.indexOf("@"));
        System.out.println("Your Surname is: " + surname);
        String domain=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("Your domain is: " + domain);


        System.out.println("------------------------");
        String str1= "Java is fun, Java is cool";
        String ss2= str1.substring(0,str1.indexOf(","));
        System.out.println(ss2);

        int beg =str1.lastIndexOf("J");
        String s22=str1.substring(beg);
        System.out.println(s22);




    }
}
