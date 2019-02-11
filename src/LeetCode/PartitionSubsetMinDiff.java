package LeetCode;

public class PartitionSubsetMinDiff {

    // Driver program
    public static void main (String[] args)
    {
        int arr[] = {3, 1, 4, 2, 2, 1};
        int n = arr.length;
        System.out.println ("The minimum difference between 2 sets is "
                + findMin(arr, n));

    }

    public static int findMin(int[] arr,int n){
        int sum=0;

        for(int i=0; i<n; i++){
            sum+=arr[i];
        }

        //if any subset can make sum/2 as sum, that subsets will give min partition sum diff
        //we have to check whether any subset in the array can make sum closest to sum/2

        boolean[][] dp = new boolean[sum+1][n+1];


        for(int i=0; i<=n;i++){
            dp[0][i] =true;
        }

        for(int i=0;i<=sum;i++) {
            for (int j = 1; j <= n; j++) {
                  dp[i][j] = dp[i][j-1];//whether the i is made by subset till the prev element(j-1),without including current element
                  if(i>=arr[j-1]){
                      dp[i][j] = dp[i-arr[j-1]][j-1];//check i-arr[j] can made by j-1 th element
                  }
            }
        }

        int diff =0;

        for(int i=sum/2;i>=0;i--){
            if(dp[i][n]){
                diff = (sum-i)-i;
                break;
            }
        }
        return diff;
    }
}
