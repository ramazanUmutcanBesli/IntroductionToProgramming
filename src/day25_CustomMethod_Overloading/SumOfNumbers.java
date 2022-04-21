package day25_CustomMethod_Overloading;

public class SumOfNumbers {

    public static void main(String[] args) {
        int sum = sumof2numbers(10, 20);
        System.out.println("sum = " + sum);
        int sum2=sumOf3Numbers(10,30,40);
        System.out.println("sum2 = " + sum2);
        int sum3 = sumof4numbers(10,20,40,80);
        System.out.println("sum3 = " + sum3);
    }

    public static int sumof2numbers(int num1, int num2) {
        return num1 + num2;
    }

    public static int sumOf3Numbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static int sumof4numbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }
}
