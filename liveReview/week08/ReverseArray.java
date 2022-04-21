package week08;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums ={5,10,4,1000};
        System.out.println("Before reverse: "+ Arrays.toString(nums));

        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];
            nums[i]= nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }
        System.out.println("After reverse: "+ Arrays.toString(nums));

        // Arrays utility class created by Java developers and it has some useful methods
        // that we can use

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
