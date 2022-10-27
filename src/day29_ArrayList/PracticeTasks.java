package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeTasks {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, (numbers.get(i) * 2));
        }
        // System.out.println(numbers.add(numbers.get(2) * 2));
        System.out.println(numbers);
        reverse(numbers);
        String[] arr1={"A","B","C"};
        String[] arr2={"D","E","F","G"};
        combineArrays(arr1,arr2);
        ArrayList<Integer> numbers1=new ArrayList<>();
        numbers1.addAll(Arrays.asList(1,2,3,4,5));
        maxNumber(numbers1);
    }

    static void reverse(ArrayList<Integer> liste) {
        ArrayList<Integer> reversedList = new ArrayList<>();
        for (int i = liste.size() - 1; i >= 0; i--) {
            reversedList.add(liste.get(i));
        }
        System.out.println(reversedList);
    }
    static void combineArrays(String[] arr1,String[] arr2){
        ArrayList<String> liste=new ArrayList<>();
        liste.addAll(Arrays.asList(arr1));
        liste.addAll(Arrays.asList(arr2));
        System.out.println(liste);
    }
    static void maxNumber(ArrayList<Integer> liste){
        int max=liste.get(0);
        for (Integer element : liste) {
            if (max<element){
                max=element;
            }
        }
        System.out.println(max);
    }
}
