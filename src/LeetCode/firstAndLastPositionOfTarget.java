package LeetCode;

public class firstAndLastPositionOfTarget {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        if(nums.length==0 || nums.length==1) return result;
        int leftIndex = extreamPosition(nums,target,true);
        int rightIndex = extreamPosition(nums,target,false)-1;

        if(leftIndex==nums.length-1 || nums[leftIndex]!=target){
            return result;
        }
        result[0]=leftIndex;
        result[1]=rightIndex;
        return result;

    }

    static int extreamPosition(int[] nums, int target, boolean left){

        int low =0;
        int high = nums.length;

        while(low < high){
            int mid = (low+high)  /2;

            if(nums[mid]>target || (left&&nums[mid]==target)){
                high =mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args){

        System.out.println(searchRange(new int[]{2,2}, 2).toString());

    }
}
