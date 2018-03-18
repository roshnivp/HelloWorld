package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 12/11/17.
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {

        int start =0;
        int end = nums.length-1;
        if(nums.length == 0) return 0;

        int result = findPeakElement(nums,start,end);
        return result;

    }
    int findPeakElement(int[] nums, int start, int end){

        if(start == end) return start;

        int mid = (start + end) /2 ;

        if (nums[mid] > nums[mid + 1]) return findPeakElement(nums,start,mid);



        else {
            return findPeakElement(nums, mid+1,end);
        }


    }
    public static void main(String[] args){
        int[] arr = new int[]{1,2};
        FindPeakElement f = new FindPeakElement();
        System.out.println(f.findPeakElement(arr));
    }
}
