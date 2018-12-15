package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class NumberOfEqualZerosAndOnes {
    public static int findMaxLength(int[] nums) {
        if(nums.length==0) return 0;


        int[] temp_count = new int[nums.length+1];
        temp_count[0]=0;
        int count=0;
        int max=0;

        for(int i=0; i<nums.length;i++){
            if(nums[i]==1) count +=1;
            else count -=1;
            temp_count[i+1] =count;
        }

        Map<Integer,Integer> hm= new HashMap<>();

        for(int j=0; j<temp_count.length; j++){
            if(hm.containsKey(temp_count[j])){
                max = Math.max(max, j-hm.get(temp_count[j]));
            }
            else{
                hm.put(temp_count[j],j);
            }
        }
        return max;
    }

    public static void main(String[] args){
        System.out.println(findMaxLength(new int[]{1,0,1,1,0,0,1}));
    }
}
