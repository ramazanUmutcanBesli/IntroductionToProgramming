package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {
        int[] numbers={100,200,300,400,500,600};
        numbers=removeElement(numbers,1);
        System.out.println(Arrays.toString(numbers));
        numbers=removeElement(numbers,1);
        System.out.println(Arrays.toString(numbers));
    } //removes index from the array, return new array
    public static int[] removeElement(int[] array,int index){
        if(index<0||index> array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }
        int[] result=new int[array.length-1];
        int j=0;
        for (int i=0;i< array.length;i++) {
            if(i==index){
                continue;//skip
            }
            result[j++]=array[i];

        }
        return result;
    }
    public static double[] removeElement(double[] array,int index){
        if(index<0||index> array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }
        double[] result=new double[array.length-1];
        int j=0;
        for (int i=0;i< array.length;i++) {
            if(i==index){
                continue;//skip
            }
            result[j++]=array[i];

        }
        return result;
    }
    public static char[] removeElement(char[] array,int index){
        if(index<0||index> array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }
        char[] result=new char[array.length-1];
        int j=0;
        for (int i=0;i< array.length;i++) {
            if(i==index){
                continue;//skip
            }
            result[j++]=array[i];

        }
        return result;
    }
    public static String[] removeElement(String[] array,int index){
        if(index<0||index> array.length-1){
            System.err.println("Invalid index"+index);
            System.exit(0);
        }
        String[] result=new String[array.length-1];
        int j=0;
        for (int i=0;i< array.length;i++) {
            if(i==index){
                continue;//skip
            }
            result[j++]=array[i];

        }
        return result;
    }
}
