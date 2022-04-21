package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,3,3,3,4,5,4,5,5,55,5,6,7,8,9,10));
        System.out.println(list);
        list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list);

        System.out.println("----------------------");
        ArrayList<Integer> numbers =new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,400));
        System.out.println(numbers);
        numbers.retainAll(Arrays.asList(100,200,300));
        System.out.println(numbers);
        System.out.println("--------------------");
        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET","Scrum Master","BA","BA"));
        jobTitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTitles);
        System.out.println("---------------------");
        ArrayList<Integer> nums =new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,8,9));
        boolean r1 =nums.contains(9);
        boolean r2 =nums.contains(2)&&nums.contains(5);
        System.out.println("r2 = " + r2);
        System.out.println("r1 = " + r1);
        // Instead of Contains()
        boolean r3 = nums.containsAll(Arrays.asList(2,5,1111));
        System.out.println("r3 = " + r3);
        System.out.println("-----------------------------");
        String[] names ={"Josh","Jack","Daniel","Shay","Breanna"};

        /* 1 way to convert non primitive array to collection
        ArrayList<String> namesList =new ArrayList<>();
        namesList.addAll(Arrays.asList(names));
        */
        // 2nd Way to convert non primitive array to collection (it can not be primitive array
        ArrayList<String> namesList =new ArrayList<>(Arrays.asList(names));
        System.out.println(namesList);
        System.out.println("---------------------------------");
        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list2 =new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);
        System.out.println("-----------------------------");
        int[] arr2 ={1,2,3,4,5,6,7,8,9,10};
        ArrayList<Integer> list3= new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println(list3);

    }


    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list =new ArrayList<>();
        for (int each : array) {
            list.add(each);
        }
        return list;
    }
}
/*
Argument must be a collection type
addAll(collectionType) : adds collection of values to the arraylist
removeAll(CollectionType): removes all the matching elements from the arrayList
retainAll(CollectionType): removes all unmatching elements from the arrayList
containsAll(CollectionType): checks if all the elements are contained in the arrayList

***Arrays: asList (Array of Values) ====> returns the array as collection type

Remove Functions:
        remove(): when we remove one element. Do not use it in the loop
        removeAll() : when we remove multiple elements (if the elements that we want to remove are known
        retainAll() when we want to retain multiple elements.
        removeIf() : when we remove under a condition. (if the elements we want to remove are unknown)


        Array vs ArrayList
        ArrayList: size is not fixed
        Only supports non-primitives
        can not be multi dimensional

        Array: size is fixed
        supports both primitives & non-primitives
        can be multidimensional
 */