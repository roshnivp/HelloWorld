package LeetCode;


import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestFromUnsortedMatrix {


    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->a-b);

        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[0].length; j++){
                pq.add(matrix[i][j]);
            }
        }
        int smallest=0;
        while(k-->0){

            smallest= pq.peek();
            pq.poll();

        }
        return smallest;
    }

    public static void main(String[] args){
        int[][] matrix =new int[][]{{7,4,6},{9,5,7},{3,10,9}};
       System.out.println(kthSmallest(matrix,3));
    }

}
