package LeetCode;

import java.util.ArrayList;

public class CourseSchedule {
    public static void main(String[] args) {
        System.out.println(canFinish(3,new int[][]{{0,1},{1,2},{0,2}}));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList[] graph = new ArrayList[numCourses];

        for(int i=0; i<numCourses;i++){
            graph[i] = new ArrayList();
        }

        for(int[] preReq:prerequisites){
            graph[preReq[1]].add(preReq[0]); //generate graph from pre re to courses
        }

        boolean[] visited= new boolean[numCourses];//temp visited graph
        for(int i=0 ;i<numCourses;i++){
            if(!dfs(graph,visited,i)){
                return false;
            }
        }
        return true;

    }

    public static boolean dfs(ArrayList[] graph,boolean[] visited,int course){
        if(visited[course])return false; //cycle found, course depends on itself
        visited[course]=true;

        for(int i=0;i<graph[course].size();i++){
            if(!dfs(graph,visited,(int)graph[course].get(i)))return false;
        }
        visited[course]=false; //for next set of dfs
        return true;
    }
}
