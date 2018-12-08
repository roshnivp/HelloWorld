package LeetCode;

public class findMinInARotatlySorted {
    public static int findMin(int[] nums) {

        int start = 0;
        int end = nums.length-1;

        if(end==0) return nums[0];



        while(start<=end){

            int mid = (start+end)/2;
            if(nums[start]<=nums[end]) return nums[start];

            if(nums[start]<=nums[mid]){
                start = mid+1;
            }
            else{
                end=mid;
            }

        }

        return nums[start];


    }

    public static void main(String[] args){
        int[] nums =new int[]{2,3,4,5,0,1};
        System.out.println(findMin(nums));
    }
}
