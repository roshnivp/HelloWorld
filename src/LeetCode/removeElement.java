package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 13/02/17.
 */
public class removeElement {
    public int removeElementFromArray(int[] nums, int val) {
        if (nums == null || nums.length == 0) return nums.length;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                count++;
            }
        }
        //       while(i < nums.length && nums[i] != val) i++;
//        int j = i+1;
//        while(j < nums.length ){
//            if(nums[j] != val) nums[i++] = nums[j++];
//            else j++;
//        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 6, 2, 1, 5, 2};
        removeElement rm = new removeElement();
        int res = rm.removeElementFromArray(arr, 2);
        System.out.println(res);
    }
}
