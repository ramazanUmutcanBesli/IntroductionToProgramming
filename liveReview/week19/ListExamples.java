package week19;

import java.util.*;

public class ListExamples {
    public static void main(String[] args) {
        List<String> ListOne = new ArrayList<>(); // Polymorphic way
        ArrayList<String> arrayList = new ArrayList<>(); // not polymorphic way

        List<String> listTwo = new Stack<>();

        ListOne.add("Mike");
        ListOne.add("Oscar");
        ListOne.addAll(Arrays.asList("Selena", "Cemal", "nihal", "Selena", "Cemal"));
        System.out.println(ListOne);
        listTwo.addAll(ListOne);
        System.out.println(listTwo);

        // Stack Methods:
        // peek() ---> brings you the element which is last LIFO: Last in First Out
        //pop() ---> brings you the element which las LIFO: Last in First out deletes the element
        //push() ---> similar to add method
        String str = ((Stack<String>) listTwo).peek();
        System.out.println(str);
        str = ((Stack<String>) listTwo).pop();
        System.out.println(str);
        System.out.println(listTwo);

        ((Stack<String>) listTwo).push("Oscar");
        System.out.println(listTwo);
        listTwo.removeIf(p -> p == null);
        // Collections Utility class comes with usefull methods : such as sorting
        Collections.sort(listTwo);
        System.out.println(listTwo);
        List<Integer> listThree = new Stack<>();
        listThree.addAll(Arrays.asList(45, 55, 2, 89, 34, 1000, -56, 564, 987));
        System.out.println("listThree = " + listThree);
        Collections.sort(listThree);
        System.out.println("listThree = " + listThree);
        // likewise TreeSet does not accept null value since internally  using Sorting
        // any collection framework which has some type sorting ------> does not accept NULL values
        for (int i = 0; i < listThree.size(); ) {           // i++ yazarsan i artarken size düşücek bu yüzden yarısı silinecek
            int x = ((Stack<Integer>) listThree).pop();     // bu yüzden i her zaman 0 alınır.
            System.out.println("next number = " + x);
        }
        List<Integer> listFour=new LinkedList<>();
        listFour.add(10);
        listFour.addAll(Arrays.asList(20,30,13,11));
        /*
        addFirst();
        addLast();
        poll();
         */
        ((LinkedList<Integer>)listFour).addFirst(1);
        ((LinkedList<Integer>)listFour).addLast(100);
        System.out.println("ListFour"+ listFour);
        // since we can cast the list to linkList it allows us to use Deque methods such as poll() method
        int x = ((LinkedList<Integer>)listFour).poll();
        System.out.println("x= "+x);
        System.out.println(listFour);

    }
}
