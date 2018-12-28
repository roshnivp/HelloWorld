package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public static int subarraySum(int[] nums, int k) {

        Map<Integer,Integer> hm=new HashMap<>();
        int temp=0;
        int count=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            temp += nums[i];
            if(hm.containsKey(temp-k)){
                count += hm.get(temp-k);
            }
            hm.put(temp,hm.getOrDefault(temp,0)+1);
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(subarraySum(new int[]{1,2,1,2,2,1},3));
    }
}
