package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseDimensionalArray {
    public static void main(String[] args) {
        int[][] array={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(array));
        int[][] reverse=new int[2][3];
        for (int[] ints : array) {
            for (int i = ints.length - 1; i >= 0; i--) {
                System.out.println(ints[i]);
            }
        }
        for (int i = array.length-1; i >=0 ; i--) {

        }
    }
}
