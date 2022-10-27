package day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {
        //   key   , value
        Map<Integer,String> hashMap=new HashMap<>();
        hashMap.put(10,"Arthur");
        hashMap.put(20,"George");
        hashMap.put(3,"Jack");
        hashMap.put(40,"Emma");
        hashMap.put(5,"Isabella");
        hashMap.put(5,"Ahmet");
        hashMap.put(null,"Ahmet");
        hashMap.put(7,null);
        hashMap.put(8,null);
        hashMap.put(9,null);
        hashMap.put(9,"Halil");
        System.out.println("hashMap = " + hashMap);
        Map<Integer,String> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put(10,"Arthur");
        linkedHashMap.put(20,"George");
        linkedHashMap.put(3,"Jack");
        linkedHashMap.put(40,"Emma");
        linkedHashMap.put(5,"Isabella");
        linkedHashMap.put(5,"Ahmet");
        linkedHashMap.put(null,"Ahmet");
        linkedHashMap.put(7,null);
        linkedHashMap.put(8,null);
        linkedHashMap.put(9,null);
        linkedHashMap.put(9,"Halil");
        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<Integer,String> treeMap=new TreeMap<>();
        treeMap.put(10,"Arthur");
        treeMap.put(20,"George");
        treeMap.put(3,"Jack");
        treeMap.put(40,"Emma");
        treeMap.put(5,"Isabella");
        treeMap.put(5,"Ahmet");
        System.out.println("treeMap = " + treeMap);
        Map<Integer,String> hashtable=new Hashtable<>();
        hashtable.put(10,"Arthur");
        hashtable.put(20,"George");
        hashtable.put(3,"Jack");
        hashtable.put(40,"Emma");
        hashtable.put(5,"Isabella");
        hashtable.put(5,"Ahmet");

    }
}
