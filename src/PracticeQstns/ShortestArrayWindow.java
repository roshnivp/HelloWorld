package PracticeQstns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Roshni Velluva Puthanidam on 17/02/18.
 */
public class ShortestArrayWindow {
    static int solution(int[] A) {  List<Integer> minWindow = new ArrayList<>();
        int[] ans;
        HashMap<Integer, Integer> unique = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int c = A[i];
            if (!unique.containsKey(c))
                unique.put(c, 1);
        }

        HashMap<Integer, Integer> found = new HashMap<>();
        int foundCounter = 0;
        int start = 0;
        int end = 0;
        int min = Integer.MAX_VALUE;

        while (end < A.length) {
                int c = A[end];
                if (found.containsKey(c)) {
                    found.put(c, found.get(c) + 1);
                }
                else {
                    found.put(c, 1);
                    foundCounter++;
                }

            if (foundCounter == unique.size()) {
                int sc = A[start];
                while (found.get(sc) > unique.get(sc)) {
                    found.put(sc, found.get(sc) - 1);
                    start++;
                    sc = A[start];
                }
                if (end - start + 1 < min) {
                    min = end - start + 1;
                }
            }
            end++;
        }
        return min;

    }
    public static void main(String[] args){
        System.out.println(solution(new int[]{2,1,1,3,2,1,1,3}));
    }
}
