package LeetCode;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {

        if(nums.length<=2)return -1;
        int leftSum=0;
        int sum=0;

        for(int i:nums){
            sum+=i;
        }

        for(int i=0;i<nums.length;i++){
            if(leftSum==(sum-leftSum-nums[i]))return i;
            leftSum+=nums[i];
        }


        return -1;
    }

    public static void main(String[] args){
        System.out.println(pivotIndex(new int[]{-1,-1,-1,-1,-1,-1}));
    }
}
