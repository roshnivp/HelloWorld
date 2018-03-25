package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 15/02/17.
 */
public class FirstMissingInteger {
    public int firstMissingPositive(int[] nums) {

        int result =0;
        for(int i:nums){
            result ^= i;
        }
        for(int i =1;i <=nums.length+1; i++){
            result ^= i;
        }

        int array_sum = 0;
        for(int i:nums){
            array_sum +=i;
        }
        return result;

    }
    public static void main(String[] args){
        int[] arr= new int[]{5,1,3,2};
        FirstMissingInteger fm=new FirstMissingInteger();
        int i=fm.firstMissingPositive(arr);
        System.out.println(i);
    }
}
