package week19;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        // Does not allow duplicates: helps you to implement some coding algorithms
        String str ="aaaabbbccccddddeeee"; // str to char array
        List<String> listOne=new ArrayList<>();
        listOne.addAll(Arrays.asList(str.split("")));
        System.out.println(listOne);
        Set<String> stringSet=new LinkedHashSet<>();
        stringSet.addAll(listOne); // what happens at this line, duplicates are removed
        System.out.println("stringSet = " + stringSet);
        stringSet.add(null);
        System.out.println(stringSet);
        Set<String> hashSet =new HashSet<>();// if we dont need any kind of order we can
        // go ahead with HashSet, we can put one null value
        hashSet.addAll(listOne);
        System.out.println(hashSet);
        hashSet.add("g");
        hashSet.add(null);
        System.out.println(hashSet);
        Set<String> treeSet =new TreeSet<>();
        treeSet.addAll(listOne);
        System.out.println(treeSet);

    }
}
