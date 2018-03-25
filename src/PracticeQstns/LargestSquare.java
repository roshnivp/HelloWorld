package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 20/03/18.
 */
public class LargestSquare {

    public static void main(String[] args){
        int[][] mat = new int[][]{{0,1,1,1},{1,1,1,1},{0,1,1,1}};
        System.out.print(longestSquare(mat));

    }

    static int min(int x, int y, int z){
        if(x<y){
            return (x<z)?x:z;
        }
        return (y<z)?y:z;
    }
    static int longestSquare(int[][] mat){
        int[][] resultMat = mat.clone();
        int m = mat.length;
        int n = mat[0].length;
        if(m==0 || n==0) return 0;
        int result =0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i == 0 || j == 0){
                    resultMat[i][j] = mat[i][j];
                }
                else if(mat[i][j] == 1){
                    resultMat[i][j] = min(mat[i][j-1], mat[i-1][j], mat[i-1][j-1]) +1;
                }
                if(result < resultMat[i][j] ){
                    result = resultMat[i][j];
                }
            }
        }
        return result;

    }
}
