package LeetCode;

import java.util.Map;
import java.util.TreeMap;

public class OddEvenJumps {
    public static int oddEvenJumps(int[] A) {
        int n= A.length;
        if(n<=1)return n;
        int ans = 1;
        boolean[] oddJump = new boolean[n];
        boolean[] evenJump = new boolean[n];
        oddJump[n-1] = evenJump[n-1]=true;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        map.put(A[n-1],n-1);

        for(int i=n-2;i>=0;i--){
            int val = A[i];
            if(map.containsKey(val)){
                oddJump[i] = evenJump[map.get(val)];
                evenJump[i] = oddJump[map.get(val)];
            }
            else{
                Integer lower = map.lowerKey(val);
                Integer higher = map.higherKey(val);

                if(lower!=null){
                   evenJump[i] = oddJump[map.get(lower)];
                }
                if(higher!=null){
                    oddJump[i] = evenJump[map.get(higher)];
                }
            }
            if(oddJump[i]) ans++;
            map.put(val,i);
        }

//        for(boolean val:oddJump){
//            if(val)ans++;
//        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println(oddEvenJumps(new int[]{2,3,1,1,4}));
    }
}
