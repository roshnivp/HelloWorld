package LeetCode;

public class UniquePathWIthObastacles {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m= obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(m==0 && n==0) return 0;

        int[][] pathGrid = new int[m+1][n+1];

        int i =0;
        int j=0;

        while(i<m && obstacleGrid[i][0]==0){
            pathGrid[i][0] =1;
            i++;
        }

        while(j<n && obstacleGrid[0][j]==0){
            pathGrid[0][j] =1;
            j++;
        }

        for(i=1; i<m; i++){
            for(j=1;j<n; j++){

                if(obstacleGrid[i][j]==0){
                    pathGrid[i][j] =pathGrid[i-1][j]+pathGrid[i][j-1];

                }
            }
        }
        return pathGrid[m-1][n-1];
    }

    public static void main(String[] args){
        int[][] obstacleGrid= new int[][]{{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }
}
