package week19;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<String> cities =new ArrayDeque<>();
        cities.add("Ankara");
        cities.addAll(Arrays.asList("New York", "Athens","Brussels", "Paris"));
        //Queue<String> listOne = new LinkedList<>();
        Queue<String> citiesLinkedList=new LinkedList<>();
        citiesLinkedList.addAll(cities);
        // These data structures works as FIFO : First in First out
        for (int i=0; i<cities.size();i++){
            //FIFO
            System.out.println(cities.poll());// brings the head of the list and deletes
            //System.out.println(cities.peek());// brings the head and does not delete
        }
        System.out.println("cities.size() = " + cities.size());

        for (int i = 0; i < citiesLinkedList.size(); i++) {
            System.out.println(citiesLinkedList.poll()); // it did not require casting
        }
        System.out.println("citiesLinkedList.size() = " + citiesLinkedList.size());
    }
}
