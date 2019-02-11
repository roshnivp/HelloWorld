package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MinAreaRectangle {
    public static int minAreaRect(int[][] points) {
        Map<Integer,Set<Integer>> map = new HashMap<>();//store all x coordinates and its y coordinates - elements in same row
        for(int[] point:points){
            if(!map.containsKey(point[0])){
                map.put(point[0],new HashSet<>());
            }
            map.get(point[0]).add(point[1]);
        }

        int area = Integer.MAX_VALUE;

        for(int i=0; i<points.length-1;i++){
            int[] point1=points[i];
            for(int j=i+1;j<points.length;j++){
                int[] point2=points[j];

                if(point1[0]==point2[0] || point1[1]==point2[1]){
                    continue;//not a diagonal element
                }

                else if(map.get(point1[0]).contains(point2[1]) && map.get(point2[0]).contains(point1[1])){//checking for potential rectangle
                    area= Math.min(area,Math.abs(point2[0]-point1[0]) * Math.abs(point2[1]-point1[1]));
                }
            }
        }
        return area==Integer.MAX_VALUE?0:area;
    }

    public static void main(String[] args){
        System.out.println(minAreaRect(new int[][]{{1,1},{1,3},{3,1},{3,3},{4,1},{4,3}}));
    }
}
