package day25_CustomMethod_Overloading;
import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {
        int[]arr= {1,2,3,4};
        arr= addInteger(arr,5);
        System.out.println(Arrays.toString(arr));
        double[] arra={1.5,2.5,3.6,4.8};
        arra=addDouble(arra,4.3);
        System.out.println(Arrays.toString(arra));

        String[] names={"Tatiana","Oleksandr","Cassandro","Ali"};
        names=addString(names,"Neira");
        System.out.println(Arrays.toString(names));

        char[] chars ={'A','B','C','D'};
        chars=addChar(chars,'E');
        System.out.println(Arrays.toString(chars));

    }

    public static int[] addInteger(int[] array, int element){
        int[] result= new int[array.length+1];
        int i =0;
        for (int each : array) {
            result[i++]=each;

        }
        result[i]=element;
        return result;

    }
    public static double[] addDouble(double[] array,double element){
        double[] arr=new double[array.length+1];
        int i = 0;
        for (double v : array) {
            arr[i++]=v;
        }
        arr[i]=element;
        return arr;
    }
    public static char[] addChar(char[] array,char element){
        char[] arr=new char[array.length+1];
        int i = 0;
        for (char v : array) {
            arr[i++]=v;
        }
        arr[i]=element;
        return arr;
    }
    public static String[] addString(String[] array,String element){
        String[] arr=new String[array.length+1];
        int i = 0;
        for (String v : array) {
            arr[i++]=v;
        }
        arr[i]=element;
        return arr;
    }
}
