package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.lang.reflect.Array;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);

        System.out.println("\n----------");
        double[] arr2={1.4,2.5,2.2,4.5};
        ArraysUtility.printEachElement(arr2);
        System.out.println("\n----------");
        char[] arr3 ={'A','B','C','D'};
        ArraysUtility.printEachElement(arr3);
        System.out.println("\n----------");
        String[] arr4={"David","Elvira","Ali","Igor"};
        ArraysUtility.printEachElement(arr4);
        System.out.println("\n----------");
        int[] n1={1,2,3,4,5,6};
        int maxInt=ArraysUtility.max(n1);
        System.out.println("maxInt = " + maxInt);
        double[] n2= {1.2,3.4,5.5,4.3,6.6};
        double maxDouble= ArraysUtility.max(n2);
        double minDouble=ArraysUtility.min(n2);
        int minInt=ArraysUtility.min(n1);
        System.out.println("maxDouble = " + maxDouble);
        System.out.println("minDouble = " + minDouble);
        System.out.println("minInt = " + minInt);
        boolean a=ArraysUtility.contains(n1,4);
        System.out.println(a);
    }
}
