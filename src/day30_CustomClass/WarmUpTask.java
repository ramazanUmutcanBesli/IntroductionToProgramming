package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTask {
    public static void main(String[] args) {
        ArrayList<Integer> numbers =new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        Collections.swap(numbers,0,numbers.size()-1);// verılen textte istenilen sayıları değiştirir
        System.out.println(numbers);

        /*int[] arr = {1,2,3,4,5,6,7}; // array lerı console da göstermen için array sınıfından to string methodunu çağırmamız gerek
        System.out.println(Arrays.toString(arr));*/
        ArrayList<Integer> list =new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);

        int size= list.size();
        list.removeAll(Arrays.asList(0));
        int newSize= list.size();
        int totalNumberOfZeros= size-newSize;
        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros);
        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }
        System.out.println(list);

        System.out.println("------------------------");
        ArrayList<Integer> list2 =new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        ArrayList<Integer> result =new ArrayList<>();

        for (Integer each : list2) {
            if (each!=0){
                result.add(each);
            }
        }
        System.out.println(result);
        /*
        Write  a program that can extract the special characters dıgıts and letters form a string and stores them into seperate Arrays
         */
        String str ="ABCD123$%&@456EFG!";
        //split methodu kullanılamaz. verılen stringi parçalara
        // ayırır splitin içine parçalamak istedğimiz ayraç
        // eklenir.*** sadece String Arraya parçalar char arrayi desteklemez bu yüzden burda kullanılamaz

        ArrayList<Character> umut =new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            umut.add(str.charAt(i));// charAt methodu verilen stringteki harfleri temsil eder.
        }
        System.out.println(umut);
        ArrayList<Character> upperCase = new ArrayList<>();
        ArrayList<Character> digitCase =new ArrayList<>();
        ArrayList<Character> specialCase =new ArrayList<>();
        for (Character each : umut) {
            if (Character.isUpperCase(each)){
                upperCase.add(each);

            }else if(Character.isDigit(each)){
                digitCase.add(each);
            }else{
                specialCase.add(each);

            }
        }
        System.out.println(upperCase);
        System.out.println(digitCase);
        System.out.println(specialCase);
    }
}
