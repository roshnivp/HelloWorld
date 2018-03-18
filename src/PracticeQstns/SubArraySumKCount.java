package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 03/10/17.
 */
public class SubArraySumKCount {
    static int subarraySum(int[] nums, int k) {

        int count =0;
        int n = nums.length;

        if(n==0){
            return 0;
        }

        for(int i=0; i<n; i++){
            int current_sum = nums[i];
            if(current_sum == k){
                count++;
            }
            for(int j=i+1; j<n; j++){
                current_sum = current_sum+ nums[j];
                if(current_sum == k){
                    count ++;

                }
            }
        }

        return count;

    }

    public static void main(String[] array) {
        int[] a = new int[]{100,1,2,3,4};

        int k = 6;
        int count = subarraySum(a, k);

        System.out.println(count);
    }
}
