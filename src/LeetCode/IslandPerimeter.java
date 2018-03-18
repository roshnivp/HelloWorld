package LeetCode;

/**
 * Created by Roshni Velluva Puthanidam on 25/10/17.
 */
public class IslandPerimeter {
    static int islandPerimeter(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        int result =0;

        if(m==0 || n==0) return 0;

        for(int i=0;i<m;i++){
            for(int j=0; j<n;j++){
                if(grid[i][j]==1){
                    result+=4;
                    if(i>0 && grid[i-1][j]==1) result -=1;
                    if(j>0 && grid[i][j-1]==1) result -=1;
                    if(i<m-1 && grid[i+1][j]==1) result -=1;
                    if(j<n-1 && grid[i][j+1]==1) result -=1;
                }


            }
        }
        return result;
    }
    public static void main(String[] args){
        int[][] arr =new int[][]{{0,1,0},{1,0,1},{1,0,1}};
        System.out.println(islandPerimeter(arr));
    }
}
