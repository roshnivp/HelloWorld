package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 15/02/17.
 */
public class FirstMissingInteger {
    public int firstMissingPositive(int[] nums) {
        int[] new_arr = new int[nums.length + 1];
        for(int i =0;i < new_arr.length; i++){
            new_arr[i] = i+1;
        }
        int result =0;
        for(int i:nums){
            result ^= i;
        }
        for(int i =0;i <new_arr.length; i++){
            result ^=new_arr[i];
        }

//        for(int i=0; i< nums.length; i++){
//            if( nums[i] != i+1 && nums[i] > 0 && nums[i] <=nums.length && nums[i] != nums[nums[i]-1]){
//                int t = nums[nums[i] -1]; // cache this number first, other wise won't work.
//                nums[nums[i] -1] = nums[i];
//                nums[i] = t;
//                i--;
//            }
//        }
//
        int array_sum=0;
        int total_sum = (nums.length+2) * (nums.length+1)/2;
        for(int i:nums){
            array_sum +=i;
        }
        return result;
       // return (total_sum- array_sum) ;
    }
    public static void main(String[] args){
        int[] arr= new int[]{5,1,3,2};
        FirstMissingInteger fm=new FirstMissingInteger();
        int i=fm.firstMissingPositive(arr);
        System.out.println(i);
    }
}
