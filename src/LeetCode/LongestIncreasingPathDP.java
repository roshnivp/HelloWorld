package LeetCode;

public class LongestIncreasingPathDP {

    static  int[] dx = new int[]{-1,0,0,1};
    static int[] dy = new int[]{0,1,-1,0};
    static int longestIncreasingPath(int[][] matrix) {

        if( matrix==null || matrix.length==0 || matrix[0].length==0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int len =0;
        int[][] matLen = new int[m][n];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                len = Math.max(len, DFS(matrix, matLen, i, j, m,n));
            }
        }
        return len;
    }

    static int DFS(int[][] matrix, int[][] matLen, int i, int j, int m, int n){

        if(matLen[i][j] >0) return matLen[i][j];
        int len =1;

        for(int k=0; k<4; k++){
            int x= i+dx[k];
            int y= j+dy[k];
            if(x>=0 && x<m && y>=0 && y<n && matrix[i][j] < matrix[x][y]){
                len = Math.max(len,1+DFS(matrix, matLen, x, y,m,n));
            }
        }

        matLen[i][j]=len;
        return len;

    }
    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int mat[][] = {
                { 1, 2, 3, 4 },
                { 2, 2, 3, 4 },
                { 3, 2, 3, 4 },
                { 4, 5, 2, 7 },
        };
        int n = 4, m = 4;
        System.out.println(longestIncreasingPath(mat));

    }
}
