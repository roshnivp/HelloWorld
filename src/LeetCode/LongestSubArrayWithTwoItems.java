package LeetCode;

import java.util.HashMap;

public class LongestSubArrayWithTwoItems { //fruit in the basket
    public static int totalFruit(int[] tree) {
        if(tree==null || tree.length==0)return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int ans = Integer.MIN_VALUE;

        for(int j=0;j<tree.length;j++){
            map.put(tree[j],map.getOrDefault(tree[j],0)+1);
            if(map.size()>2){
                while(map.size()>2){
                    map.put(tree[i],map.get(tree[i])-1);
                    if(map.get(tree[i])==0) map.remove(tree[i]);
                    i++;
                }
            }
            if(ans<j-i+1)ans=j-i+1;
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println(totalFruit(new int[]{1,3,2,4,3,2,3}));
    }
}
