package day22_MultiDimensionalArray;

public class IteratingMultidimensionalArray2 {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2}, {2, 3, 4}, {2, 3, 4, 5}};
        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int i1 = 0; i1 < arr2D[i].length; i1++) {
                System.out.print(arr2D[i][i1]+" ");
            }
            System.out.println();
        }

        System.out.println("--------------------");
        System.out.println("--------------------");
        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int i1 = arr2D[i].length - 1; i1 >= 0; i1--) {
                System.out.print(arr2D[i][i1]+" ");
            }
            System.out.println();
        }

    }
}
