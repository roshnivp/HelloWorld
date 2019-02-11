package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MedianSlidingWindow {
    public static  double[] medianSlidingWindow(int[] nums, int k) {

        if(nums==null || nums.length==0 || k==0) return new double[0];
        double[] result = new double[nums.length - k + 1];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0; i < nums.length; i++) {
            if(maxHeap.size() <= minHeap.size()) {
                minHeap.add(nums[i]);
                maxHeap.add(minHeap.poll());
            } else {
                maxHeap.add(nums[i]);
                minHeap.add(maxHeap.poll());
            }


            if(maxHeap.size() + minHeap.size() == k) {
                double median;
                if(maxHeap.size() == minHeap.size()) {
                    median = (double) ((long)maxHeap.peek() + (long)minHeap.peek()) / 2;
                } else {
                    median = (double) maxHeap.peek();
                }

                int start = i - k + 1;
                result[start] = median;
                if(!maxHeap.remove(nums[start])) {
                    minHeap.remove(nums[start]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        double[] result =medianSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3);
        System.out.println(Arrays.toString(result));
    }
}
