package LeetCode;

public class PallindromeMinCut {
    public static void main(String[] args){
        System.out.println(pallindromeMinCut("abbaab"));
    }

    public static int pallindromeMinCut(String str){

        if(str.length()==0||isPallindrome(str)) return 0;
        int n= str.length();

        boolean[][] p= new boolean[n][n];
        int[][] c = new int[n][n];

        for(int i=0; i<n; i++){
            p[i][i]=true;
            c[i][i]=0;
        }



        for(int diff=2; diff<=n; diff++){
            for(int i=0; i<n-diff+1; i++) {
                int j= i+diff-1;

                if(diff==2){
                    p[i][j]= (str.charAt(i)==str.charAt(j));
                }
                else{
                    p[i][j]= ((str.charAt(i)==str.charAt(j)) && p[i+1][j-1]);
                }

                if(p[i][j]){
                    c[i][j]=0;
                }

                else{
                    c[i][j]= Integer.MAX_VALUE;
                    if(diff==2)c[i][j]=1;
                    else {
                        for (int k = i; k < j; k++) {
                            c[i][j] = Math.min(c[i][j], (c[i][k] + 1 + c[k+1][j]));

                        }
                    }
                }

            }
        }
        return c[0][n-1];
    }

    static boolean isPallindrome(String str){
        int start=0;
        int end= str.length()-1;

        while(start<end){
            if(str.charAt(start++)!=str.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
