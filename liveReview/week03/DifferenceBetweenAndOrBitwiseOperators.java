package week03;

public class DifferenceBetweenAndOrBitwiseOperators {
    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 10;
        System.out.println(true | false);// true
        System.out.println(true || false);// true again because of first cond is true it does not check the second part of the statements
        System.out.println((true | i1 > i2));// true
        System.out.println(i2 > i1 || ++i1 > i2);
        System.out.println("i1 = " + i1);// we will get 5

        boolean a = i1 < i2 && i2<i1;
        System.out.println(a);
    }
}
