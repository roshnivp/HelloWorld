package LeetCode;

public class OptimalStrategyGame {
    // Driver program
    public static void main(String[] args)
    {
        int arr1[] = { 8, 15, 3, 7 };
        int n = arr1.length;
        System.out.println("" + optimalStrategyOfGame(arr1, n));

        int arr2[] = { 2, 2, 2, 2 };
        n = arr2.length;
        System.out.println("" + optimalStrategyOfGame(arr2, n));

        int arr3[] = { 20, 30, 2, 2, 2, 10 };
        n = arr3.length;
        System.out.println("" + optimalStrategyOfGame(arr3, n));
    }

    public static int optimalStrategyOfGame(int[] arr,int n){
        //user and opponent can choose first and last column val, i.......j elements - if
        //user chose i the element, next choice of user will be min(i+1 ... j-1 or i+2 ...j
        //user chose j the element, next choice of user will be min(i+1 ... j-1 or i ...j-2

        int[][] dp = new int[n][n];

        for(int gap=0;gap<n;gap++){
            for(int i=0,j=gap;j<n;i++,j++){

                int x = (i+2<=j)?dp[i+2][j]:0;
                int y= (i+1<=j-1)?dp[i+1][j-1]:0;
                int z = (i<=j-2)?dp[i][j-2]:0;

                dp[i][j]=Math.max(arr[i]+Math.min(x,y),arr[j]+Math.min(y,z));


            }
        }

        return dp[0][n-1];
    }
}
