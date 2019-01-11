package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class CentralSphere {
    public int solution(Point3D[] A) {
        // write your code in Java SE 8
        int M = A.length;
        int[] radius = new int[M];
        Map<Integer, Integer> result = new HashMap<>();
        findRadius( A, M, radius);

        for (int i: radius){
            int v = result.getOrDefault(i,0);
            result.put(i, v  + 1);
        }

        return result.size();
    }

    public void findRadius(Point3D[] points, int M, int[] radius) {
        for (int i = 0; i < M; i++) {
            double x = Math.pow(points[i].x, 2);
            double y = Math.pow(points[i].y, 2);
            double z = Math.pow(points[i].z, 2);
            radius[i] = (int) (x + y + z);
        }
    }
}

class Point3D{
    public int x;
    public int y;
    public int z;
}