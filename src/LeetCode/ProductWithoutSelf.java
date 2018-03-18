package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 25/10/17.
 */
public class ProductWithoutSelf {
    static int[] productExceptSelf(int[] nums) {

        int leng = nums.length;
        int[] ret = new int[leng];
        if(leng == 0)
            return ret;
        int runningprefix = 1;
        for(int i = 0; i < leng; i++){
            ret[i] = runningprefix;
            runningprefix *= nums[i];
        }
        int runningsufix = 1;
        for(int i = leng -1; i >= 0; i--){
            ret[i] *= runningsufix;
            runningsufix *= nums[i];
        }
        return ret;
    }

    public static void main(String[] args){
        int[] arr =new int[]{1,2,3,4};
        int[] res =productExceptSelf(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(res[i]);
        }
    }
}
