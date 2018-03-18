package LeetCode;

import java.util.Arrays;

/**
 * Created by Roshni Velluva Puthanidam on 26/11/17.
 */
public class ArraySplit {
    public int arrayPairSum(int[] nums) {

        if(nums.length == 0) return 0;
        Arrays.sort(nums);

        int i =0;
        int sum = 0;
        for(int j = i; j < nums.length - 1; j=2*i){
            System.out.println(j);
            sum += Math.min(nums[j],nums[j+1]);
            i +=1;
            System.out.println(i);
        }
        return sum;
    }

    public static void main(String[] args){
        ArraySplit a = new ArraySplit();
        System.out.println(a.arrayPairSum(new int[]{1,2,4,3}));
    }
}
