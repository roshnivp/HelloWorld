package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 09/02/18.
 */
public class kthSmallestMatrix {
    static int kthSmallest(int[][] matrix, int k) {
        int lo = matrix[0][0], hi = matrix[matrix.length - 1][matrix[0].length - 1] + 1;//[lo, hi)
        while(lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int count = 0,  j = matrix[0].length - 1;
            for(int i = 0; i < matrix.length; i++) {
                while(j >= 0 && matrix[i][j] > mid) j--;
                count += (j + 1);
            }
            if(count < k) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
    public static void main(String[] args){
        int[][] arr = new int[][]{{2,4,6},{5,8,9}}; //,{7,11,12},{10,13,15}
        System.out.println(kthSmallest(arr,4));
    }
}
