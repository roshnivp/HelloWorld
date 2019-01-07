package PracticeQstns;

public class PrintDiagonalsOfMatrix {

    public static void printDiagonals(int[][] matrix){

        int m= matrix.length;
        int n= matrix[0].length;

        for(int k=0;k<m;k++){

            int i=k;
            int j=0;

            while(i>=0){
                System.out.print(matrix[i][j]);
                System.out.print(" ");
                i--;
                j++;
            }
            System.out.println();
        }
        for(int k=1;k<n;k++){

            int i=m-1;
            int j=k;

            while(j<=n-1){
                System.out.print(matrix[i][j]);
                System.out.print(" ");
                i--;
                j++;
            }
            System.out.println();

        }
    }
    public static void main(String[] args ){
        int[][] matrix = new int[][]{{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        printDiagonals(matrix);
    }

}
