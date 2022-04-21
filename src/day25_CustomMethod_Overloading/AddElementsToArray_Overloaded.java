package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloaded {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};//7
        numbers = addElement(numbers, 7);

        char[] chars = {'A', 'B', 'C', 'D'};// 'E'
        chars = addElement(chars, 'E');
        String[] names = {"Ahmet", "Oleksandr", "Sinem", "Cihad"};// "Layan"
        names=addElement(names,"Layan");
        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("chars = " + Arrays.toString(chars));
        System.out.println("names = " + Arrays.toString(names));
    }


    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        int i = 0;
        for (int each : array) {
            result[i++] = each;

        }
        result[i] = element;
        return result;

    }

    public static double[] addElement(double[] array, double element) {
        double[] arr = new double[array.length + 1];
        int i = 0;
        for (double v : array) {
            arr[i++] = v;
        }
        arr[i] = element;
        return arr;
    }

    public static char[] addElement(char[] array, char element) {
        char[] arr = new char[array.length + 1];
        int i = 0;
        for (char v : array) {
            arr[i++] = v;
        }
        arr[i] = element;
        return arr;
    }

    public static String[] addElement(String[] array, String element) {
        String[] arr = new String[array.length + 1];
        int i = 0;
        for (String v : array) {
            arr[i++] = v;
        }
        arr[i] = element;
        return arr;
    }
}
