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
        HashMap<Integer, Integer> unique = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            if(!(list.contains(A[i]))){
                list.add(A[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int c = list.get(i);
            unique.put(c, 1);
        }

        HashMap<Integer, Integer> found = new HashMap<>();
        int foundCounter = 0;
        int start = 0;
        int end = 0;
        int min = Integer.MAX_VALUE;

        //
        while (end < A.length) {
            int c = A[end];
            if (unique.containsKey(c)) {
                if (found.containsKey(c)) {
                    found.put(c, found.getOrDefault(c,0) + 1);
                } else {
                    found.put(c, 1);
                    foundCounter++;
                }
            }
            if (foundCounter == list.size()) {
                //When foundCounter equals to T.length(), in other words, found all characters.
                int sc = A[start];
                while (!found.containsKey(sc) || found.get(sc) > unique.get(sc)) {
                    if (found.containsKey(sc) && found.get(sc) > unique.get(sc))
                        found.put(sc, found.get(sc) - 1);
                    start++;
                    sc = A[start];
                }
                if (end - start + 1 < min) {
                    //int length = end-start;
                   // ans = new int[length];
                   // ans = Arrays.copyOfRange(A, start, end + 1);
                    // minWindow = Arrays.asList(ans);
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
