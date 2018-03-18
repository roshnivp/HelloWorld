package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 09/02/18.
 */
public class FindDuplicates {
    static int findDuplicate(int[] nums) {
        //  int arraySum =0;
        int p = nums[0];
        int q = nums[0];
        do {
            q = nums[q];
            p = nums[nums[p]];
        } while (p != q);

        // Find the "entrance" to the cycle.
        int start = nums[0];
        while (start != q) {
            start = nums[start];
            q = nums[q];
        }

        return start;


    }
    public static void main(String[] args){
        int[] arr = new int[]{1,3,4,2,1}; //each element points to index of nexxt element
        System.out.print(findDuplicate(arr));
    }
}
