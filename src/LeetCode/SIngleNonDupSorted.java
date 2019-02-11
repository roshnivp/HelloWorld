package LeetCode;

public class SIngleNonDupSorted {
    public static int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length-1;

        while(low<high){
            int mid = (low+high)/2;

            if((mid+1)%2==0){
                if(nums[mid]!=nums[mid+1]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            else{
                if(nums[mid]!=nums[mid+1]){
                    high = mid;
                }
                else{
                    low =mid+2;
                }
            }
        }
        return nums[low];
    }

    public static void main(String[] args){
        System.out.println(singleNonDuplicate(new int[]{0,1,1}));
    }
}
