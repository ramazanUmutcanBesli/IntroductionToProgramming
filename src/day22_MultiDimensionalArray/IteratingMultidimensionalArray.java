package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultidimensionalArray {
    public static void main(String[] args) {
        int[][] arr2D ={{1,2},{2,3,4},{2,3,4,5}};
        for(int i =0;i<arr2D.length;i++){
            System.out.println(Arrays.toString(arr2D[i]));
            for (int i1 = 0; i1 < arr2D[i].length; i1++) {// i1 is index number of elements
                System.out.print(arr2D[i][i1]+" ");
            }
            System.out.println();
        }
    }
}
