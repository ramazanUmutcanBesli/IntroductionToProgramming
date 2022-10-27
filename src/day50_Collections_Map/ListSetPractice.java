package day50_Collections_Map;

import java.util.*;

public class ListSetPractice {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        System.out.println(set);
        // to convert Array
        //Integer[] array= set.toArray(set.toArray(new Integer[0]));

        // hashset i ArrayListe çevirir
        List<Integer> list=new ArrayList<>(set);
        System.out.println(list);

        // listeler null kabul etmez
        //List<String> a = null;

        // Casting ve Pop practice
        List<Character> chars =new Stack<>();
        chars.addAll(Arrays.asList('A','B','C','D'));
        System.out.println("chars = " + chars);
        ((Stack)chars).pop();
        System.out.println("chars = " + chars);
        // poll()
        List<String> names=new LinkedList<>();
        names.addAll(Arrays.asList("James","Jimmy","Kathy","Breanna","Max"));
        System.out.println(names);
        ((LinkedList)names).poll();
        System.out.println(names);


    }
}
