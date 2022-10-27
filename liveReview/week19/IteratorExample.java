package week19;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        /*
        1 . we need to create iterator object to able to use
        2 . we move the pointer using next() method
        3 . hasNext() method return true, if there is still next value
        4 . we can remove values using remove () method
         */

        List<Integer> nums = new LinkedList<>();
        nums.addAll(Arrays.asList(34,67,33,12,11,67,65));

        Iterator<Integer> it =nums.iterator();
        /*
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        */
        // Iterator is another way of looping inside your collection

        // hasNext() method
        while(it.hasNext()){// hasNext() method bir sonraki deger olup olmadıgını kontrol eder
            System.out.println(it.next());
            it.remove(); // to remove each element
        }
        System.out.println(nums.size());
        /*      foreach loop da remove edemezsin Concurrent Modification exception verir
        List<Integer> nums2=new LinkedList<>();
        nums2.addAll(Arrays.asList(34,67,33,12,11,65,100));
        for (Integer integer : nums2) {
            nums2.remove(integer);
        }*/
    }
}
