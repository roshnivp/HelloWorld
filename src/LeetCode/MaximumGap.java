package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 17/02/18.
 */
public class MaximumGap {
    class Bucket{
        int low;
        int high;
        public Bucket(){
            low = -1;
            high = -1;
        }
    }

    public int maximumGap(int[] A) {
        if(A == null || A.length < 2){
            return 0;
        }

        int max = A[0];
        int min = A[0];
        for(int i=1; i<A.length; i++){
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }

        // initialize an array of buckets
        Bucket[] buckets = new Bucket[A.length+1]; //project to (0 - n)
        for(int i=0; i<buckets.length; i++){
            buckets[i] = new Bucket();
        }

        double interval = (double) A.length / (max - min);
        //distribute every number to a bucket array
        for(int i=0; i<A.length; i++){
            int index = (int) ((A[i] - min) * interval);

            if(buckets[index].low == -1){
                buckets[index].low = A[i];
                buckets[index].high = A[i];
            }else{
                buckets[index].low = Math.min(buckets[index].low, A[i]);
                buckets[index].high = Math.max(buckets[index].high, A[i]);
            }
        }

        //scan buckets to find maximum gap
        int result = 0;
        int prev = buckets[0].high;
        for(int i=1; i<buckets.length; i++){
            if(buckets[i].low != -1){
                result = Math.max(result, buckets[i].low-prev);
                prev = buckets[i].high;
            }

        }

        return result/2;
    }
    public static void main(String[] args){
        MaximumGap mg = new MaximumGap();
        System.out.print(mg.maximumGap(new int[]{7,3,7,3,1,3,4,1}));
    }
}
