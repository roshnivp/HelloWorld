package LeetCode;

public class PartitionEqualSubset {
    public static boolean canPartition(int[] nums) {

        int sum =0;
        int n= nums.length;

        for(int i:nums){
            sum+=i;
        }

        if(sum%2!=0)return false; //can not able to partition equally

        sum = sum/2;

        boolean[][] partition = new boolean[sum+1][n+1];

        for(int i=0;i<=n;i++){
            partition[0][i]=true;//sum=0 can be created from subset of any set
        }

        for(int i=1;i<=sum;i++){
            partition[i][0]=false; //empty set can not contribute to any sum
        }

        for(int i=1; i<=sum; i++){
            for(int j=1;j<=n; j++){
                partition[i][j] = partition[i][j-1];
                if(i>=nums[j-1]){
                    partition[i][j] = partition[i][j] || partition[i-nums[j-1]][j-1];
                }
            }
        }
        return partition[sum][n];


    }
    public static void main(String[] args){
        System.out.println(canPartition(new int[]{1,5,11,5}));
    }
}
