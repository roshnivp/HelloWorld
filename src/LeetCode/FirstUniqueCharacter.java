package LeetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Roshni Velluva Puthanidam on 25/10/17.
 */
public class FirstUniqueCharacter {
    static int firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int count =map.get(s.charAt(i));
                map.put(s.charAt(i),count+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        char k = ' ';
        for(Map.Entry<Character,Integer> hm: map.entrySet()){
            if(hm.getValue()==1){
                k= hm.getKey();
                break;
            }

        }
        int index=-1;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)==k) index=i;

        }
         return index;


    }
    public static void main(String[] args){
        System.out.print(firstUniqChar("loveleetcode"));
    }
}
