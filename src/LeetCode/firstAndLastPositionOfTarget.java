package LeetCode;
import java.util.Arrays;

public class firstAndLastPositionOfTarget {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        if(nums.length==0 || (nums.length==1 && nums[0]!=target) ) return result;
        if(nums.length==1 && nums[0]==target) return new int[]{0,0};
        int low =0;
        int high = nums.length-1;
        int mid =0;

        while(low <= high){
            mid = (low+high)  /2;


            if(nums[mid]==target){

                int start=mid;
                int end=mid;

                while(start>=0 && nums[start]==target) start--;
                start++;


                while( end<nums.length && nums[end]==target) end++;
                end--;

                return new int[]{start,end};

            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high  =mid-1;
            }
        }

        return result;

    }


    public static void main(String[] args){

        int[] result =searchRange(new int[]{1,4},4);

    }
}
