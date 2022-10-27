package day53_functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractices {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6));
        list = list.stream().distinct().collect(Collectors.toList());
        // distinct duplicate siler ama ana listeden silmez o yüzden yeni bir list oluşturman gerek.
        // ana listeden silmek için collect methodu kullanman gerek
        // Collectors.toList() collect methodu içinde kullanılır ve yeni liste ye toplar
        System.out.println(list);


        int[] arr1 = {1, 1, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        arr1 = Arrays.stream(arr1).distinct().toArray();
        // arraylerde distinct kullandıktan sonra toArray() methodu kullanmamız gerek
        // collectionlarda collect methodu arraylerde toArray methodu kullanılır.
        // arraylerde stream methodu bu sekilde başlar Arrays.stream(). ... diye devam eder


        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2 = list2.stream().skip(5).collect(Collectors.toList());
        System.out.println(list2);
        int[] nums2={1,2,3,4,5,6,7,8,9,10};
        nums2=Arrays.stream(nums2).skip(4).toArray();
        System.out.println(Arrays.toString(nums2));
        // skip methodu atlamamızı sağlar araylerde toArray le collectionda collect methodu ile kullanılır


        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list3=list3.stream().limit(7).collect(Collectors.toList());
        System.out.println(list3);
        // limit methodu bi limite kadar alır ve yazdırır
        // limit ve skip beraber kullanabilir belirli aralıgı almak için kullanılır

        // map() methodu
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list4=list4.stream().map(p->p*10).collect(Collectors.toList());
        System.out.println(list4);

        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        days=days.stream().map(p->p.substring(0,3)).collect(Collectors.toList());
        System.out.println(days);

        // filter() methodu
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        List<Integer> evens=list5.stream().filter(p->p%2==0).collect(Collectors.toList());
        System.out.println(evens);

        // count methodu
        List<String> names = new ArrayList<>(Arrays.asList("Java", "java", "jAvA", "Python", "Ruby"));
        long countJava=names.stream().filter(p->p.equalsIgnoreCase("java")).count();
        System.out.println(countJava);

        // forEach methodu
        names.stream().filter(p->p.equalsIgnoreCase("java")).forEach(p-> System.out.println(p));

        //allMatch methodu
        List<Integer> list6 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        boolean r1=list6.stream().allMatch(p->p%2==0);
        System.out.println(r1);

        //anyMatch methodu:
        boolean r2=list6.stream().anyMatch(p->p<10);
        System.out.println(r2);
        //nonMatch Methodu:
        boolean r3=list6.stream().noneMatch(p->p%3==0);
        System.out.println(r3);
    }
}
