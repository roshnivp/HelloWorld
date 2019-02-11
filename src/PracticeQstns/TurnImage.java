package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 16/02/17.
 */
public class TurnImage {
    public static void main(String[] args){
        int[][] arr= new int[][]{{1,2,3},{4,5,6},{7,8,9}};//,{-4,-3,-1},{-2,6,9}
        TurnImage ti=new TurnImage();
        int[][] res =ti.turnImageInPlace(arr);//ti.turnAnImage(arr);

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

    int[][] turnImageInPlace(int[][] arr){
        int n = arr.length;

        for(int i=0;i<n/2;i++){
            for(int j=i;j<n-1-i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][n-1-i];
                arr[j][n-1-i] = arr[n-1-i][n-1-j];
                arr[n-1-i][n-1-j] = arr[n-1-j][i];
                arr[n-1-j][i] = temp;
            }
        }
        return arr;
    }
}
