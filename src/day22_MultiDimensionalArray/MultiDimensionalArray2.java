package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {1, 2, 3};

        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 60, 80}, {70, 80, 90}}};
        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[1][1]));
        System.out.println(arr3D[1][1][1]);
        for (int[][] ints : arr3D) {
            for (int[] anInt : ints) {
                for (int i : anInt) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }

        }
    }
}
