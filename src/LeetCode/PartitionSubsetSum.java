package LeetCode;

public class PartitionSubsetSum {
    public static void main (String args[])
    {
        int set[] = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = set.length;
        if (isSubsetSum(set, n, sum) == true)
            System.out.println("Found a subset"
                    + " with given sum");
        else
            System.out.println("No subset with"
                    + " given sum");
    }

    public static boolean isSubsetSum(int[] arr,int n,int sum){

        if(n==0)return false;
        boolean[][] dp = new boolean[sum+1][n+1];

        for(int i=0;i<=n;i++){
            dp[0][i]=true;
        }

        for(int i=0;i<=sum;i++){
            for(int j=1;j<=n;j++){
                dp[i][j]= dp[i][j-1];//excluding the current element

                if(i>=arr[j-1]){
                    dp[i][j] = dp[i][j-1] || dp[i-arr[j-1]][j-1];//including current elem
                }
            }
        }

        return dp[sum][n];
    }
}
