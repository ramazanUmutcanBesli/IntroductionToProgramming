package day22_MultiDimensionalArray;

public class ForEachLoop {
    public static void main(String[] args) {
        int[][] arr2D ={{1,2},{2,3,4},{2,3,4,5}};

        for (int[] ints : arr2D) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }

    }
}
