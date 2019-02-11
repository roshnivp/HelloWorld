package LeetCode;

public class LongestOnesIn2D {
    public static int longestLine(int[][] M) {
       int m = M.length;
       int n = M[0].length;
       if(m==0)return 0;
       int noOfOnes = 0;
       int[][][] onesDP =new int[m][n][4];//row,column,direction

        int[] dx= new int[]{-1,0,-1,-1}; //vertical,horizontal,diagonal,anti-diagonal
        int[] dy = new int[]{0,-1,-1,1};
       for(int i =0;i<m;i++){
           for(int j=0;j<n;j++){

               if(M[i][j]==1){
                   for(int k=0; k<4; k++){//loop through all dir
                       int x = i+dx[k];
                       int y = j+dy[k];

                       if(x>=0 && x<m && y>=0 && y<n){
                           onesDP[i][j][k] = onesDP[x][y][k]+1;
                       }
                       else{
                           onesDP[i][j][k]=1;
                       }
                       noOfOnes = Math.max(noOfOnes,onesDP[i][j][k]);
                   }
               }

           }
       }
       return noOfOnes;

    }
    public static void main(String[] args){
        System.out.println(longestLine(new int[][]{{1,0,1},{1,1,0},{1,0,0}}));
    }
}
