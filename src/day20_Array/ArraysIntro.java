package day20_Array;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //Create a variable that's capable enough to contain 5 names

        //System.out.println(myGroup);// hashcode
        /*
        Arrays Utility:
        class name: Arrays
        package: java.util
        default values:
        non primitives : null
        primitives:
         byte short long int: 0
         float, double = 0.0
         boolean == false

         */
        String myGroup[];
        myGroup= new String[5];
        myGroup[0]="Günay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="halil";
        myGroup[4]="Umut";
        System.out.println(Arrays.toString(myGroup));

        //int [] mygrup = new int[5];
        //System.out.println(Arrays.toString(mygrup));


        System.out.println("-------------------------");
        String[] days ={"Monday", "tuesday","Wednesday","thursday","friday", "Saturday", "Sunday"};
        //                 0        1           2           3           4       5           6
        System.out.println(Arrays.toString(days));
        int number = 5;
        if(number<1|| number>7){
            System.err.println("invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]);
    }
}
