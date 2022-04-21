package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(2,25);
        System.out.println(numbers);
        int lastIndex = numbers.size()-1;
        System.out.println(lastIndex);
        int thirdNumber=numbers.get(3);
        System.out.println(thirdNumber);

        System.out.println("--------------------");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        ArrayList<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("Ruby");
        list.set(2,"Javascript");
        list.set(3,"C++");
        System.out.println(list);
        System.out.println("---------------------");
        ArrayList<String> employees =new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(employees.size()-1);
        employees.remove("Hulya");
        System.out.println(employees);

    }
}
// Array List method
//add (data) adds the data after the last index of the arrayList
// add(index,data) inserts the data at the given index
// size(): it is useful to count elements of ArrayList
// get(index) : returns the element of the given index.
/*
set(index, Data): it replace the given element to the ArrayList with new element
remove(index): removes te element at the given index
remove(object): removes the given object at the index
clear () : remove all the elements of arraylist
indexOf(data): returns the first matching ekements index number
lastIndexOf(Data) returns the last matching elements index number
contains(Data) : returns true if the element is contained in the arrayList,otherwise returns false
equals(ArrayList): returns true if two arrayLists are equal( same elements in same order)
isEmpty : returns true if the size is zero.

 */