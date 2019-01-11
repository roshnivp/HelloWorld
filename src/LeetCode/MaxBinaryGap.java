package LeetCode;

public class MaxBinaryGap {
    public static int maxBinaryGap(int N){
        int max = 0;
        int count = -1;
        int r = 0;

        while (N > 0) {
            // get right most bit & shift right
            r = N & 1;
            N = N >> 1;

            if (r ==0 && count >= 0) {
                count++;
            }

            if (r==1) {
                max = count > max ? count : max;
                count = 0;
            }
        }

        return max;
    }
    public static void main(String[] args){
       System.out.println(maxBinaryGap(32)) ;
    }
}
