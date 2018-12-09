package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roshni Velluva Puthanidam on 16/11/17.
 */
public class CountAllPalindromicSubString {
    public static void main(String[] args)
    {
        String str = "malayalam";
        System.out.println(countPallindrome(str, str.length()));
    }
    static String countPallindrome(String s,int n){
        int count=0;
        boolean[][] isPallindrome = new boolean[n][n];
        int start =0;
        int max=0;
        for(int i=0; i<n; i++){
            isPallindrome[i][i] =true;
            start = i;
            max = 1;
            //count++;
        }

        for(int i=0; i<n-1; i++){
            if(s.charAt(i)== s.charAt(i+1)){
                isPallindrome[i][i+1] = true;
                max = 2;
                start = i;
               // count++;
            }
        }

        for(int diff=2; diff<n; diff++){
            for(int i=0; i<n-diff; i++){
                int j= i + diff ;

                if(s.charAt(i) == s.charAt(j) && isPallindrome[i+1][j-1]){
                    isPallindrome[i][j]=true;

                    if(max < diff+1){
                        max= diff;
                        start= i;
                    }
                   // count++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=start; i<= start+max; i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

}
