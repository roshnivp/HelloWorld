package LeetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Roshni Velluva Puthanidam on 25/10/17.
 */
public class FirstUniqueCharacter {
    static int firstUniqChar(String s) {
        if(s.length()==0) return -1;
        if(s.length()==1) return 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        // find the index
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;


    }
    public static void main(String[] args){
        System.out.print(firstUniqChar("loveleetcode"));
    }
}
