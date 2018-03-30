package PracticeQstns;

import java.util.Arrays;

/**
 * Created by Roshni Velluva Puthanidam on 01/10/17.
 */
public class SubArrayOfGivenSum {

    public static void main(String[] array) {
        int[] a = new int[]{-2, -3, 4, 1, -2, 1, 5, -3};
        int n = a.length;
        int k =2;
        int[] max_sum = subArrayOfGivenSum(a, n,k);

        for(int i=0;i<max_sum.length;i++){
            System.out.println(max_sum[i]);
        }
    }

    static int[] subArrayOfGivenSum(int[] arr, int n, int sum){

        for(int i=0; i<n-1; i++){
            int current_sum = arr[i];

            for(int j = i+1; j<n; j++){

                if(sum !=0) {

                    if (current_sum % sum == 0) {
                        return Arrays.copyOfRange(arr, i, j);
                    }
                }
                else{
                    if(current_sum == sum) return Arrays.copyOfRange(arr, i, j);
                }

                current_sum = current_sum + arr[j];
            }
        }
        return null;

    }
}
