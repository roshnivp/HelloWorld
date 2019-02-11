package LeetCode;

public class MostStonesRemoved {
    public static int removeStones(int[][] stones) {
        boolean[] visited = new boolean[stones.length];
        int sum = 0;
        for(int i = 0;i<stones.length;i++){
            if(!visited[i]){
                int size = dfs(stones, visited, i);
                sum+=size-1; //no of edges that connected to i;
            }
        }
        return sum;
    }
    public static int dfs(int[][] stones, boolean[] visited, int idx){
        if(visited[idx]) return 0;
        int[] cur = stones[idx];
        visited[idx]=true;
        int sum = 1;
        for(int i = 0;i<stones.length;i++){
            if(visited[i]) continue;
            int[] next = stones[i];
            if(cur[0]==next[0] || cur[1]==next[1]) {
                sum+=dfs(stones, visited, i);
            }
        }
        return sum;
    }

    public static void main(String[] args){
        int[][] stones = new int[][]{{0,0},{0,1},{1,0},{1,2},{2,1},{3,3}};
        System.out.println(removeStones(stones));
    }

}
