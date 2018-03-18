package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 17/11/17.
 */
public class PallindromePartitionMinCut {
    static int minCut(String s){
        int n= s.length();

        if(n==0) return 0;

        boolean[][] isPallindrome = new boolean[n][n];

        //all ind elements are pallindrome

        for(int i=0; i<n; i++){
            isPallindrome[i][i]=true;
        }

        //check for size two pallindrome
        for(int i=0; i<n-1; i++){
            if(s.charAt(i)==s.charAt(i+1)) isPallindrome[i][i+1]=true;
        }

        //check for pallindrome size greater than 2

        for(int diff=2; diff<n; diff++){
            for(int i=0; i<n-diff; i++){
                int j= i+diff;

                if(s.charAt(i)==s.charAt(j) && isPallindrome[i+1][j-1]){//check last and first char equal and also substring should be pallindrome
                    isPallindrome[i][j] = true;
                }
            }
        }

        int[] cuts= new int[n];
        for(int i=0; i<n; i++){
            int temp = i;
            if(isPallindrome[0][i]) cuts[i]=0; //check entire substring is pallindrome for the value of i
            else{
                for(int j=0; j<i;j++){
                    if((isPallindrome[j+1][i]) && temp > cuts[j] + 1)
                    {
                        temp = cuts[j] + 1;
                    }
                }
                cuts[i] =temp;
            }
        }
        return cuts[n-1];
    }
    public static void main(String args[])
    {
        System.out.println(minCut("aab"));
    }
}
