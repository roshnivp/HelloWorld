package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 26/10/17.
 */
public class NumberofIslands {
    public static void main(String[] args){
        int[][] arr = new int[][]{{1,1,0,0,0},{1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1}};
        System.out.println(numberOfIsland(arr));
    }
    static int numberOfIsland(int[][] grid){
        if(grid.length==0 || grid[0].length==0) return 0;
        int m= grid.length;
        int n=grid[0].length;
        int numberOfIslands=0;

        boolean[][] visited = new boolean[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    numberOfIslands +=1;

                    makeNeighboursVisited(i,j,grid,visited);
                }
            }
        }
        return numberOfIslands;
    }
    static void makeNeighboursVisited(int x, int y, int[][] grid,boolean[][] visited){
        // These arrays are used to get row and column numbers of 8 neighbours
        // of a given cell
         int rowNbr[] = {-1, -1, -1,  0, 0,  1, 1, 1};
         int colNbr[] = {-1,  0,  1, -1, 1, -1, 0, 1};

        // Mark this cell as visited
        visited[x][y] = true;

        // Recur for all connected neighbours
        for (int k = 0; k < 8; ++k) {
            int i = x+rowNbr[k];
            int j= y+colNbr[k];

            if( i>=0 && i<grid.length && j>=0 && j<grid[0].length && grid[i][j]==1 && !visited[i][j]){
                makeNeighboursVisited(i, j, grid,visited);
            }


        }
    }
}
