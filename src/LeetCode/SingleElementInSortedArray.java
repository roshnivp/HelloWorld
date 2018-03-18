package LeetCode;

import java.util.Arrays;

/**
 * Created by Roshni Velluva Puthanidam on 21/10/17.
 */
public class SingleElementInSortedArray {
    public static void main(String[] args){
        int[] arr = new int[]{1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,10,10};
        System.out.println(singleNonDuplicate(arr));

    }
   static  int singleNonDuplicate(int[] nums) {
       int result =0;
        for(int i=0; i<nums.length; i++){
            result ^=nums[i];
        }
       return result;
    }
}
