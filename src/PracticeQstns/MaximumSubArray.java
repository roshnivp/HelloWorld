package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 01/10/17.
 */
public class MaximumSubArray {
    public static void main(String[] array) {
        int[] a = new int[]{-2, -3, 4, 1, -2, 1, 5, -3};
        int n = a.length;
        int max_sum = maxSubArraySum(a, n);
        System.out.println("maximun sub array sum is:" + max_sum);
    }

    static int maxSubArraySum(int[] arr, int n){

        int max_so_far = arr[0];

        int current_max = arr[0];

        for(int i=1; i<n; i++){
            current_max = Math.max(arr[i], current_max+arr[i]);
            max_so_far = Math.max(current_max,max_so_far);
        }

        return max_so_far;
    }
}
