package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 25/10/17.
 */
public class MaxAreaIsland {
    static int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int max_area =0;

        for(int i=0; i<m;i++){
            for(int j=0; j<n;j++){
                int sum=0;
                if(grid[i][j] == 1) max_area= Math.max(max_area,area_of_neighbours(i,j,grid));
            }
        }
        return max_area;

    }
    static int area_of_neighbours(int x,int y,int[][] grid){
        if(x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y]==1){
            grid[x][y] = 0;
           return 1 + area_of_neighbours(x-1,y,grid)+area_of_neighbours(x+1,y,grid)+area_of_neighbours(x,y-1,grid)+area_of_neighbours(x,y+1,grid);
        }
        return 0;
    }
    public static void main(String[] args){
        int[][] arr = new int[][]{{1,1,0},{1,1,0},{0,1,1},{1,1,1}};
        System.out.println(maxAreaOfIsland(arr));
    }

}
