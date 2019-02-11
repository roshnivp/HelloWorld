package LeetCode;

public class SearchIn2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length;
        if(m==0)return false;
        int n= matrix[0].length;
        int i = 0;
        int j= n-1;

        while(i<m && j >=0){
            if(matrix[i][j]==target)return true;
            else if(matrix[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}},13));
    }
}
