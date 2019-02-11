package LeetCode;

public class MinSubSeqWindow {
    public static String minWindow(String S, String T) {
        int m = S.length(), n = T.length();
        if (m < n) return "";
        int[][] dp = new int[m][n];
        //find the subsequence start index
        for (int i = 0; i < m; i++) {
            if (S.charAt(i) == T.charAt(0)) dp[i][0] = i;
            else {
                if (i == 0) dp[i][0] = -1;
                else dp[i][0] = dp[i-1][0];
            }
        }

        //initialize all dp[0][j] (j != 0) to -1
        for (int j = 1; j < n; j++) {
            dp[0][j] = -1;
            for (int i = 1; i < m; i++) {
                if (S.charAt(i) == T.charAt(j)) {
                    dp[i][j] = dp[i-1][j-1];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        //initialize len to an impossible large value
        int start = 0, len = m+1;
        for (int i = n-1; i < m; i++) {
            if (dp[i][n-1] != -1) {
                if (i-dp[i][n-1]+1 < len) {
                    len = i-dp[i][n-1]+1;
                    start = dp[i][n-1];
                }
            }
        }

        if (len == m+1) return "";
        return S.substring(start, start+len);
    }

    public static void main(String[] args){
        System.out.println(minWindow("abcdebdde","bde"));
    }
}
