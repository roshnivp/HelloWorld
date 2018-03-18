package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Roshni Velluva Puthanidam on 13/02/17.
 */
public class TwoSums {

        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            int[] res = new int[2];
            for(int i=0; i<nums.length ;i++){
                map.put(nums[i], i);
            }
            for(int i=0; i< nums.length; i++){
                int t = target - nums[i];
                if(map.containsKey(t)){
                    res[0] = i;
                    res[1] = map.get(t);
                    break;
                }
            }
            return res;
        }
    public static void main(String[] args){
        TwoSums ts=new TwoSums();
        int[] arr=new int[]{3,3,8,2,1};
        int[] res=new int[2];
        res=ts.twoSum(arr,6);
        for(int i=0; i<2;i++) {
            System.out.println(res[i]);
        }

    }

}
