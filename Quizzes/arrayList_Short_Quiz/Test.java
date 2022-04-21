package arrayList_Short_Quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
       //*** ArrayList<> list=new ArrayList<String>;
        /* 1st
        ArrayList<Integer> list=new ArrayList<>();

        list.add(2);
        list.add(3);
        Integer a =1;

        System.out.println(list.remove(a));*/
        // 2nd
        /*ArrayList<Integer> list1 =new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5));
        */
        /* 3rd
        ArrayList<Character> list2 =new ArrayList<>();
        for (char i = 'a'; i <='z' ; i++) {
            list2.add(i);
        }
        boolean result=list2.containsAll(Arrays.asList('a','c','D'));
        System.out.println(result);*/
        ArrayList<String> colors=new ArrayList<>();
        colors.add("green");
        colors.add("Red");
        colors.add("Blue");
        colors.add("yellow");
        colors.add(3,"cyan");// özel indexe eklendıgınde yerini almaz sadece digerlerini kaydırır.
        System.out.println(colors);
    }
}
