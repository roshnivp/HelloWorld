package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Roshni Velluva Puthanidam on 17/04/17.
 */
public class RemoveDuplicates {

        public int removeDuplicates(int[] nums) {

            HashMap<Integer, Integer> hm = new HashMap<>();
            List<Integer> result = new ArrayList<Integer>();

            for(int i= 0; i< nums.length; i++){
                if(!hm.keySet().contains(nums[i])) {
                    result.add(nums[i]);
                    hm.put(nums[i],i);
                }

            }
            return result.size();

        }

}
