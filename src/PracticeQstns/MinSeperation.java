package PracticeQstns;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Roshni Velluva Puthanidam on 11/10/17.
 */
public class MinSeperation {

        static boolean containsNearbyDuplicate(int[] nums, int k) {
            if(nums.length==0 ||nums.length==1){
                return false;
            }

            Map<Integer,Integer> hm = new HashMap<>();
            int min = Integer.MAX_VALUE;
            for(int i=0; i<nums.length; i++){
                if(hm.containsKey(nums[i])){
                    int index= Math.abs(hm.get(nums[i])-i);
                    if(index > k){
                        hm.put(nums[i],i);
                    }
                    else{
                        return true;
                    }

                }
                else{
                    hm.put(nums[i],i);
                }
            }

            return false;

        }
    public static void main (String[] args)
    {

        int arr[] = {1,0,1,1};
        int n = arr.length;
        int k= 1;
        System.out.println("Is there duplicates: " +
                containsNearbyDuplicate(arr,k));
    }
}
