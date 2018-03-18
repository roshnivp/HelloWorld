package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 10/11/17.
 */
public class LongestIncreasingSubSequence {
    static int lengthOfLIS(int[] nums) {

        if(nums.length==0) return 0;

        int[] countArray = new int[nums.length];

        for(int i=0; i<countArray.length; i++){
            countArray[i] = 1;
        }

        for(int i=1; i< nums.length; i++){
            for(int j= 0; j < i; j++){
                if( nums[j] < nums[i] )
                    countArray[i]=Math.max(countArray[j]+1 , countArray[i]) ;
            }
        }

        int max= Integer.MIN_VALUE;
        for(int k=0; k<countArray.length; k++){
            if(max < countArray[k])
                max = countArray[k];
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(arr));
    }
}
