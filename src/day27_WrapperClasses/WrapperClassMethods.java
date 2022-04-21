package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {
        String str ="123";
        int num= Integer.parseInt(str);// int
        System.out.println((num + 1));
        System.out.println(str+1);
        String str2= "10.5";
        double num2 =Double.parseDouble(str2);
        System.out.println(num2+1);
        int max = Integer.MAX_VALUE;
        int min =Integer.MIN_VALUE;
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2=Long.MAX_VALUE;
        long min2=Long.MIN_VALUE;
        System.out.println("min2 = " + min2);
        System.out.println("max2 = " + max2);

        String s1="true";
        boolean a = Boolean.parseBoolean(s1);
        System.out.println(a);


        System.out.println("--------------------");
        //valueOf Methods

        String s2 ="123";
        Integer x = Integer.valueOf(s2);
        int y = Integer.valueOf(s2);
        System.out.println(x);
        System.out.println(y);
        String s3 ="1.5";
        Double h = Double.valueOf(s3);
        System.out.println(h);
        System.out.println("-----------------");
        // isDigit() it checks if the char is digit it returns boolean
        char o ='0';
        boolean r1 =Character.isDigit(o);
        System.out.println(r1);
        // isLetter() it checks ob the charakter letter is
        char o1 ='A';
        boolean r2 =Character.isLetter(o1);
        System.out.println(r2);
        // isLetterorDigit() it checks ob the charakter letter or digit is sonst heisst das speziellBuchstaben
        char o2 ='!';
        boolean r3=!Character.isLetterOrDigit(o2);
        System.out.println(o2);

        //isUpperCase() it checks ob the character groß buchstaben ist

        boolean r4 =Character.isUpperCase(o1);
        // isLowerCase
        boolean r5 =Character.isLowerCase(o1);
        System.out.println("r5 = " + r5);
        System.out.println("---------------------------");
        
        String s = "ab1cde2efgh3i4";
        int sum =0;
        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }
        System.out.println("sum = " + sum);
        
        
        

    }
}
