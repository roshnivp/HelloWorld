package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 22/02/17.
 */
public class LongestPallindrome {
    public static void main(String[] args) {
        String s1 = "cbbd";
        int n = s1.length();
        LongestPallindrome lp = new LongestPallindrome();
        String s2 = lp.longestPalindrome(s1);
        //  LongestSubSequence ls=new LongestSubSequence();
        //    int t=ls.lcsLength(s1,s2,s1.length(),s2.length());
        System.out.println(s2);
    }

    public String longestPalindrome(String s) {
        int n= s.length();

        boolean[][] isPallindrome = new boolean[n][n];
        int start=0;
        int maxLength =1;

        for(int i=0; i<n; i++){
            isPallindrome[i][i] =true;

        }
        for(int i=0; i<n-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                isPallindrome[i][i+1] =true;
                start = i;
                maxLength =2;
            }

        }

        for(int diff= 2; diff<n; diff++){
            for(int i=0; i<n-diff; i++){
                int j= i+diff;
                if(s.charAt(i)==s.charAt(j) && isPallindrome[i+1][j-1]){
                    isPallindrome[i][j] =true;

                    if(maxLength< diff+1){
                        start =i;
                        maxLength = diff+1;
                    }
                }
            }
        }
        System.out.println(start);
        System.out.println(maxLength);
        StringBuilder sb = new StringBuilder();

        for(int k=start; k< start+maxLength; k++){
            sb.append(s.charAt(k));
        }

        return sb.toString();

    }
}
