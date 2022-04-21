package week02;

public class ArithmeticOperators {
    public static void main(String[] args) {
        /*
        Division
        * in math 10/3= 3.3333
        * in Java 10/3= 3 reason int/int= int;
        * 10/3.0 int/double = double
        * 10.0/3 = double/int= double
         */
        System.out.println("10/3: "+(10/3));
        System.out.println("10/3: "+(10/3.0) );// 3.0 is a double data type
        //which operations come first in Java
        // paranthesis comes first, division, multiplication is before concatination
        System.out.println("10+3:"+ 10+3);// concetanotion
        System.out.println("10+3 ; "+ (10+3));// in paranthesis we can addition
        // IMPORTANT : Java runs from top to bottom and left to right
        //concationation : string +int = string
        int num1 =10;
        double num2 =3.0;
        int result = (int)(num1/num2);
        System.out.println(result);

    }
}
