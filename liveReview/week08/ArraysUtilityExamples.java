package week08;

import java.util.Arrays;

public class ArraysUtilityExamples {
    public static void main(String[] args) {
        int[] nums ={5,10,4,1000};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


        //EQUALS method

        int[] numsTwo = {4,5,10,1000};
        int[] numsThree =nums;// creating a new reference for the same the object
        System.out.println("Arrays.equals(nums,numsTwo) = " + Arrays.equals(nums, numsTwo));
        System.out.println(nums==numsTwo);
        System.out.println(nums==numsThree);

        // copyof Method

        int [] numsFour=Arrays.copyOf(nums,nums.length);
        nums[0]=3000;
        System.out.println(Arrays.toString(numsFour));
        System.out.println(Arrays.toString(nums));
    }
}
