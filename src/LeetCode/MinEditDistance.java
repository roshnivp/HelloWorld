package LeetCode;

import java.util.Arrays;

public class MinEditDistance {
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n= word2.length();

        if(m==0) return n;
        if(n==0) return m;

        int[][] editDistance = new int[m+1][n+1];
        if(word1.charAt(0)!=word2.charAt(0)) editDistance[0][0]=1;

        for(int i=1; i<m; i++){
            if(word1.charAt(i)==word2.charAt(0)) editDistance[i][0] =editDistance[i-1][0];
            else{
                editDistance[i][0] =editDistance[i-1][0]+1;
            }
        }
        for(int j=1; j<n; j++){
            if(word1.charAt(0)==word2.charAt(j)) editDistance[0][j] =editDistance[0][j-1];
            else{
                editDistance[0][j] =editDistance[0][j-1]+1;
            }
        }
        System.out.println(Arrays.deepToString(editDistance));

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(word1.charAt(i)==word2.charAt(j)) {
                    editDistance[i][j] =editDistance[i-1][j-1];
                }
                else{
                    editDistance[i][j] = Math.min(editDistance[i-1][j-1],Math.min(editDistance[i-1][j],editDistance[i][j-1] ))+1;
                }
            }
        }

        return editDistance[m-1][n-1];



    }

    public static void main(String[] args){
        System.out.println(minDistance("pneumonoultramicroscopicsilicovolcanoconiosis", "ultramicroscopically"));
    }

}
