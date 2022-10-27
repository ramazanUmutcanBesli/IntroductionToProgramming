package day53_functionalInterface;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class buildInFunctionalInterfaces2 {
    public static void main(String[] args) {
        // create a function that can check if the Integer is contained in 
        // an array 
        BiPredicate<Integer[],Integer> contains = (a,b)->{
            boolean result =false;
            for (Integer each : a) {
                if (each==b){
                    result=true;
                    break;
                }
            }
            return  result;
        };
        Integer[] arr={1,2,3,4,5,6,7,8,9,10};
        boolean r1 = contains.test(arr,11);
        System.out.println(r1);
        //create a function that can check if two string are anagram
        BiPredicate<String,String> anagram = (a,b)->{
          String[] arr1 =a.split("");
          String[] arr2 =b.split("");
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1,arr2);
        };
        Boolean r2=anagram.test("aaa","aaa");
        System.out.println(r2);

        System.out.println("---------------------------");
        // create a function that can print multiple times
        BiConsumer<String,Integer> printMultipleTimes=(s,n )->{
            for (int i =0; i<n;i++){
                System.out.println(s);
            }

        };
        printMultipleTimes.accept("Java",5);

        // create a function that takes fist and last names and returns the prints formatted full name

        // "JaVa" " PROGRAMMING ==========> Java Programming
        System.out.println("-------------------------");
        Map<String, String> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid","SM");
        scrumTeam1.put("Nikita","Developer");
        scrumTeam1.put("Alina","Developer");
        scrumTeam1.put("Mert","PO");
        scrumTeam1.put("Lee","SDET");
        scrumTeam1.forEach((k,v)->{
            System.out.println(k+" : "+v); // Shorter way
        });

        System.out.println("--------------------------------");
        // 1: Create a function that takes two integers and return max value
        BiFunction<Integer,Integer,Integer> maxNumber=(a,b)->{
            return a>b?a:b;
        };
        int max=maxNumber.apply(100,200);
        System.out.println(max);

        System.out.println("----------------------------");
        //2.  create a function that can merge two ınteger arrays into a list
        BiFunction<int[],int[], List<Integer>> merge=(x,y)->{
          List<Integer> result=new ArrayList<>();
          for (int each:x) result.add(each);
          for (int each:y) result.add(each);
          return result;
        };
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8};
        List<Integer>list2=merge.apply(arr1,arr2);
        System.out.println(list2);

        System.out.println("-----------------------------");
        // 3: Create a function that takes a list of String and a List of Integer
        /*
        names===> {"Josh","Daniel"}
        score===> {100,110}
        Map ==> {Josh=100, Daniel=110}

         */
        BiFunction<List<String>,List<Integer>,Map<String,Integer>> merge2= (j,k)->{
          Map<String,Integer> map =new HashMap<>();
            for (int i = 0; i < j.size(); i++) {
                map.put(j.get(i),k.get(i));
            }

          return map;
        };
        List<String> names= new ArrayList<>(Arrays.asList("Layan","Kseniia","Aygun"));
        List<Integer> scores=new ArrayList<>(Arrays.asList(90,95,98));
        Map<String,Integer>students=merge2.apply(names,scores);
        System.out.println(students);
    }
}
