package LeetCode;

import java.util.*;

/**
 * Created by Roshni Velluva Puthanidam on 15/02/17.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String word : strs){

            char[] c = word.toCharArray();
            Arrays.sort(c);
           // System.out.print(c.toString());
            String hash = new String(c);
            if(map.containsKey(hash)){
                map.get(hash).add(word);
            }else{
                List<String> l = new ArrayList<>();
                l.add(word);
                map.put(hash, l);
            }
        }

        return new ArrayList<List<String>>(map.values());
    }
    public static void main(String[] args){
        String[] arr= new String[]{"ate","ten","tea","net","eat","ten"};
        GroupAnagrams ga=new GroupAnagrams();
        List<List<String>> ans = ga.groupAnagrams(arr);
        System.out.print(ans.toString());

    }
}
