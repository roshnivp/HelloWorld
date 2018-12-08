package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSorted {
    static int[] twoSum(int[] numbers, int target) {


        int high= numbers.length;
        int[] ans= new int[2];
        if(high<=2) return new int[2];

        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<high; i++){
            hm.put(numbers[i],i+1);
        }
        for(int i=0; i<high; i++) {
           int numToBeSearch = target- numbers[i];
            if (hm.containsKey(numToBeSearch)) {

                ans[0] =i+1;
                ans[1] = hm.get(numToBeSearch);
                return ans;
            }
        }

        return new int[2];

    }

    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4};
        System.out.println(twoSum(arr,6));
    }

}
