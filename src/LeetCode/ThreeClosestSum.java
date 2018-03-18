package LeetCode;

import java.util.Arrays;

/**
 * Created by Roshni Velluva Puthanidam on 12/04/17.
 */
public class ThreeClosestSum {
    public int threeSumClosest(int[] nums, int target) {
        int result = Integer.MAX_VALUE;
        if(nums == null || nums.length == 0) return 0;

        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            //           if( i > 0 && nums[i] == nums[i-1]) continue;
            int l = i+1;
            int r = nums.length-1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum < target){
                    l++;
                }
                else{
                    r--;
                }
                if(Math.abs(sum - target) < Math.abs(result - target)){
                    result =sum;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr =new int[]{1,1,1,0};
        ThreeClosestSum ts =new ThreeClosestSum();
        int res = ts.threeSumClosest(arr,100);
        System.out.println(res);
    }
}
