package LeetCode;

public class NumberOfPerfectSquares {
    public static int numSquares(int n) {

        int[] result = new int[n+1];

        result[0]=0;
        result[1]=1;

        for(int  i=2;i<=n; i++){
            int min = Integer.MAX_VALUE;
            for(int j=1; j*j<=i; j++){
                min = Math.min(min, result[i-(j*j)]+1);
            }
            result[i]=min;
        }
        return result[n];
    }

    public static void main(String[] args){
        System.out.println(numSquares(12));
    }
}
