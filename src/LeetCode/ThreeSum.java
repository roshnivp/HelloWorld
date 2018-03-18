package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Roshni Velluva Puthanidam on 13/02/17.
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0) return res;

        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i++){
            if( i > 0 && nums[i] == nums[i-1]) continue;

            int l = i+1;
            int r = nums.length-1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum ==0){
                    List<Integer> t = new ArrayList<>();
                    t.add(nums[i]);
                    t.add(nums[l]);
                    t.add(nums[r]);
                    res.add(t);
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l-1]) l++;
                    while(l < r && nums[r] == nums[r+1]) r--;
                }else if(sum < 0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr= new int[]{1,6,2,8,7,-1,-4,-3,-1,-2};
        ThreeSum ts=new ThreeSum();
        ts.threeSum(arr);
    }
}
