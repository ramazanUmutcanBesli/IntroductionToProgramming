package day50_Collections_Map;

import java.util.*;

public class IterablePractice2 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed","ahmed","aHmeD","John","Ercon","Daniel", "Mustafa","Mohammed","Ahmed","Yuliia","Christian"));
        System.out.println(names);
        // Remove all the names "ahmed"
        // There are 3 ways to handle this problem
        // 1.st way to use while loop
        Iterator<String> a = names.iterator();
        while(a.hasNext()){
            if(a.next().equalsIgnoreCase("ahmed")){
                a.remove();
            }
        }
        System.out.println(names);

        // 2nd way to use for loop
        List<String> names2=new ArrayList<>();
        names2.addAll(Arrays.asList("Ahmed","ahmed","aHmeD","John","Ercon","Daniel", "Mustafa","Mohammed","Ahmed","Yuliia","Christian"));
        System.out.println(names2);
        for (Iterator<String> b=names2.iterator();b.hasNext();){
            if (b.next().equalsIgnoreCase("ahmed")){
                b.remove();
            }

        }System.out.println(names2);
        // 3 rd way to use removeIf method
        List<String> names3=new ArrayList<>();
        names3.addAll(Arrays.asList("Ahmed","ahmed","aHmeD","John","Ercon","Daniel", "Mustafa","Mohammed","Ahmed","Yuliia","Christian"));
        System.out.println(names3);
        names3.removeIf(each->each.equalsIgnoreCase("ahmed"));
        System.out.println(names3);

        // 2 nd practice
        // to use while loop
        Set<Integer> set=new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,100,90,89,79,50));
        Iterator<Integer> d= set.iterator();
        while(d.hasNext()){
            if (d.next()%2==0){
                d.remove();
            }
        }
        System.out.println("set = " + set);
    }
}
