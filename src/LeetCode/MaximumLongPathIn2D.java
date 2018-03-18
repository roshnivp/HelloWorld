package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 21/11/17.
 */
public class MaximumLongPathIn2D {
    int[] dx = new int[]{-1,0,0,1};
    int[] dy = new int[]{0,1,-1,0};
    public int longestIncreasingPath(int[][] matrix) {
        if( matrix==null || matrix.length==0 || matrix[0].length==0) return 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[] mat = new int[1];
        int len =1;
        int[][] matLen = new int[m+1][n+1];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                DFS(matrix,mat,len,i,j);
            }
        }
        return mat[0];
    }

    void DFS(int[][] matrix, int[] mat, int len, int i, int j){

        mat[0] = Math.max(mat[0],len);
        int m = matrix.length;
        int n = matrix[0].length;

        for(int k=0; k<4; k++){
            int x= i+dx[k];
            int y= j+dy[k];
            if(x>=0 && x<m && y>=0 && y<n && matrix[i][j] < matrix[x][y]){
                DFS(matrix, mat,len+1, x, y);
            }
        }




    }

    public static void main(String[] args){
        MaximumLongPathIn2D max = new MaximumLongPathIn2D();
        System.out.println(max.longestIncreasingPath(new int[][]{{9,9,7},{6,6,8},{2,1,1}}));
    }
}
