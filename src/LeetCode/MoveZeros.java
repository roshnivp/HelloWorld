package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 24/10/17.
 */
public class MoveZeros {
    static void moveZeroes(int[] nums) {

        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]%2 == 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }


    }
    public static void main(String[] args){
        int[] arr =new int[]{1,2,5,10,3,4};
        moveZeroes(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
