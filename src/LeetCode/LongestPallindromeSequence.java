package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 17/11/17.
 */
public class LongestPallindromeSequence {

    static int longestPallindromeSeq(String s){
        int n= s.length();

        int[][] pallindromeLength = new int[n][n];
        for(int i=0; i<n; i++){
            pallindromeLength[i][i]=1;
        }

        for(int diff = 2; diff<=n; diff++){
            for(int i=0; i<n-diff+1; i++){
                int j = i+diff-1;
                if(s.charAt(i)==s.charAt(j)){
                    pallindromeLength[i][j] = pallindromeLength[i+1][j-1] + 2;
                }
                else{
                    pallindromeLength[i][j] = Math.max(pallindromeLength[i+1][j],pallindromeLength[i][j-1]);
                }
            }
        }
        return pallindromeLength[0][n-1];
    }
    public static void main(String[] args)
    {
        String str = "ababaa";
        System.out.println(longestPallindromeSeq(str));
    }
}
