package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordAbbreviation2 {
    public List<String> wordsAbbreviation(List<String> dict) {
       int len = dict.size();
       HashMap<String,List<Integer>>  map = new HashMap<>();
       String[] abbr = new String[len];
       int[] prefix = new int[len];

       for(int i=0 ; i<len; i++){
           prefix[i]=1;
           abbr[i] = makeAbbr(dict.get(i),1);
           List<Integer> list = map.getOrDefault(abbr[i],new ArrayList<>());
           list.add(i);
           map.put(abbr[i],list);
       }
        for(int i = 0; i < len; i++){
            //If we see duplicate, we adjust the duplicates until it works
            if(map.get(abbr[i]).size()>1){
                List<Integer> indexes =map.get(abbr[i]);
                map.remove(abbr[i]);
                for(int index:indexes){
                    prefix[index]++;
                    abbr[index] = makeAbbr(dict.get(index),prefix[index]);
                    List<Integer> list = map.getOrDefault(abbr[index],new ArrayList<>());
                    list.add(index);
                    map.put(abbr[index],list);
                }
                i--;
            }

        }
        return Arrays.asList(abbr);
    }

    private String makeAbbr(String s, int k) {
        if(k>=s.length()-2)return s;
        StringBuilder str = new StringBuilder();
        str.append(s.substring(0,k));
        str.append(s.length()-1-k);
        str.append(s.charAt(s.length()-1));
        return str.toString();

    }
    public static void main(String[] args){
        String[] arr = new String[]{"like", "god", "internal", "me", "internet", "interval", "intension", "face", "intrusion"};
        WordAbbreviation2 w= new WordAbbreviation2();
        System.out.println(w.wordsAbbreviation(Arrays.asList(arr)).toString());
    }
}
