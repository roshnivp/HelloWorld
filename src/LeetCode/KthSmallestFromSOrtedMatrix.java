package LeetCode;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallestFromSOrtedMatrix {
    public static int kthSmallest(int[][] matrix, int k) {
        if(matrix == null || k <= 0){
            return 0;
        }
        Queue<int[]> que = new PriorityQueue<>((a, b)->a[2] - b[2]);
        int m = matrix.length, n = matrix[0].length;
        int[][] visited = new int[m][n];
        que.offer(new int[]{0,0,matrix[0][0]});
        visited[0][0] = 1;
        int ans = matrix[0][0];
        while(k> 0 && !que.isEmpty()){
            int[] cur = que.poll();
            ans = cur[2];
            if(cur[0] + 1 < m && visited[cur[0] + 1][cur[1]] == 0){
                que.offer(new int[]{cur[0] + 1, cur[1], matrix[cur[0] + 1][cur[1]]});
                visited[cur[0] + 1][cur[1]] = 1;
            }
            if(cur[1] + 1 < n && visited[cur[0]][cur[1] + 1] == 0){
                que.offer(new int[]{cur[0], cur[1] + 1, matrix[cur[0]][cur[1] + 1]});
                visited[cur[0]][cur[1] + 1] = 1;
            }
            k--;
        }
        return ans;
    }
    public static void main(String[] args){
        int[][] matrix =new int[][]{{1,4,6},{2,5,7},{3,10,9}};
        System.out.println(kthSmallest(matrix,3));
    }

}
