package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CheckSubArraySum {

    public static boolean checkSubArraySum(int[] nums,int k){
        if(nums==null || nums.length==0) return false;
        k= (k==0)?Integer.MAX_VALUE:k;

        Set<Integer> set = new HashSet<>();
        int sum =nums[0]%k;

        for(int i=1; i<nums.length; i++){
            sum = (sum+nums[i])%k;
            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }

    public static boolean checkSubarraySum2(int[] nums, int k) {
        int sum = 0;
        HashMap< Integer, Integer > map = new HashMap < > ();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0)
                sum = sum % k;
            if (map.containsKey(sum)) {
                if (i - map.get(sum) > 1)
                    return true;
            } else
                map.put(sum, i);
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(checkSubArraySum(new int[]{2,3,4,5,3},6));
        System.out.println(checkSubarraySum2(new int[]{2,3,4,5,3},10));
    }


}
