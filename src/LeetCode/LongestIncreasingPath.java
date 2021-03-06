package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 15/01/18.
 */
public class LongestIncreasingPath {

    static int  max=0;

    static int longestIncreasingPath(int[][] matrix) {
        if(matrix==null||matrix.length==0||matrix[0].length==0)
            return 0;

        for(int i=0; i<matrix.length; i++)    {
            for(int j=0; j<matrix[0].length; j++){
                dfs(matrix, i, j,  1);
            }
        }

        return max;
    }

    static void dfs(int[][] matrix, int i, int j,int len){

        max = Math.max(max, len);

        int m = matrix.length;
        int n = matrix[0].length;

        int[] dx={-1, 0, 1, 0};
        int[] dy={0, 1, 0, -1};

        for(int k = 0; k < 4; k++){
            int x = i + dx[k];
            int y = j + dy[k];

            if(x >= 0 && x< m && y >= 0 && y< n && matrix[x][y] > matrix[i][j]){
                dfs(matrix, x, y,  len+1);
            }
        }
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
