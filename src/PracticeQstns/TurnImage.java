package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 16/02/17.
 */
public class TurnImage {
    public static void main(String[] args){
        int[][] arr= new int[][]{{2,2,2},{1,1,1}};//,{-4,-3,-1},{-2,6,9}
        TurnImage ti=new TurnImage();
        int[][] res =ti.turnAnImage(arr);
        for(int i=0; i<res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println("");
        }

    }
    int[][] turnAnImage(int[][] arr){
        int m= arr.length;
        int n= arr[0].length;

        int[][] dest =new int[n][m];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                dest[j][m-i-1]=arr[i][j];
            }
        }
        return dest;
    }
}
