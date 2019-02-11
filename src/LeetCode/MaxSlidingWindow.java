package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxSlidingWindow {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null ||nums.length==0 || k<=0){
            return new int[0];
        }
        int size = nums.length-k+1;
        int[] res = new int[size];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<nums.length; i++){
            pq.add(nums[i]);
            if(pq.size()==k){
                res[i-k+1]=pq.peek();
                pq.remove(nums[i-k+1]);
            }

        }
        return res;

    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(maxSlidingWindow(new int[]{-1,2,-2,4,3,5,9,7,1},3)));
    }


}
