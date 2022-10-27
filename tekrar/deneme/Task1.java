package deneme;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> cars= new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Mercedes");

        Iterator<String> iter =cars.iterator();
        System.out.println(iter.next());
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
