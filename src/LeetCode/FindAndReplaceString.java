package LeetCode;

import java.util.TreeMap;

public class FindAndReplaceString {
    public static String findReplaceString(String S, int[] indexes, String[] sources, String[] targets) {

         StringBuilder sb = new StringBuilder(S);
         //sort indexes asc order, best way is to use treemap

        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0;i<indexes.length;i++){
            map.put(indexes[i],i);
        }

        for(int key:map.descendingKeySet()){//get key in asc order
            int i= map.get(key);
            if(S.substring(key).startsWith(sources[i])){
                sb.replace(key,key+sources[i].length(),targets[i]);
            }
        }
        return sb.toString();

    }

    public static void main(String[] args){
        System.out.println(findReplaceString("abcd",new int[]{0,2},new String[]{"a","cd"},new String[]{"aa","ddd"}));
    }
}
