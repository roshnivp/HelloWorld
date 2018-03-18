package PracticeQstns;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Roshni Velluva Puthanidam on 02/10/17.
 */
public class SubArraySumZero {
    public static void main(String[] array) {
        int[] a = new int[]{-2, -3, 4, -1, -2, 3, 5, -3};
        int n = a.length;

        int[] max_sum = subArrayOfZeroSum(a, n);

        for(int i=0;i<max_sum.length;i++){
            System.out.println(max_sum[i]);
        }
    }

    static int[] subArrayOfZeroSum(int[] arr, int n){
        Map<Integer,Integer> hm= new HashMap<>();
        int sum =0;
        for(int i=0; i<n; i++){

            Integer start_index = hm.get(sum);
            if(start_index==null && i ==n){
                return null;
            }
            else if(start_index == null){
                hm.put(sum,i);
            }
            else{
                return Arrays.copyOfRange(arr,start_index,i);
            }
            sum = sum+arr[i];
        }
        return null;
    }
}
