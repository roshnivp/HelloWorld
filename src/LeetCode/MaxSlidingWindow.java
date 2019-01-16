package LeetCode;

import java.util.Arrays;

public class MaxSlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null ||nums.length==0 || k<=0){
            return new int[0];
        }
        int size = nums.length-k+1;
        int[] res = new int[size];

        for(int i=0; i<size; i++){
            int temp= nums[i];
            for(int j=i;j<i+k;j++){
                if(temp<nums[j]){
                    temp=nums[j];
                }
            }
            res[i]=temp;
        }
        return res;

    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{-1,2,-2,4,3,5,9,7,1},3)));
    }


}
