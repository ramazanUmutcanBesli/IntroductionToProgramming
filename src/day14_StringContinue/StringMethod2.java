package day14_StringContinue;

public class StringMethod2 {
    public static void main(String[] args) {
        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "phyton");
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSwith@yahoo.com";
        String email2 = email.replace("yahoo", "gmail");
        System.out.println("email = " + email);
        System.out.println("email2 = " + email2);

        String sentence = "Java Java Python Python C# C# C++ Python Python Python";
        String sentence2 = sentence.replace(" Python", "");
        System.out.println("sentence2 = " + sentence2);

        String s = "Dog Dog Dog Dog Dog Dog";
        String ss = s.replace("Dog","Cat");
        System.out.println("ss = " + ss);
        String s2 = "C# is fun, C# is cool";
        s2=s2.replace(" C#"," Java");
        System.out.println("s2 = " + s2);

        String s3 ="Java";
        s3=s3.replace("a","e");// verilen kelimeden kac tane varsa degistirir
        s3=s3.replaceFirst("a","e");
        System.out.println("s3 = " + s3);
        System.out.println("----------------");
        
        String result ="Java Java Java";
        result=result.replaceFirst("Java","Phyton");
        System.out.println("result = " + result);

        String result2= "C# is fun, C# is cool";
        result2=result2.replaceFirst("C#","Java");




    }
}
