package LeetCode;

import java.util.*;

/**
 * Created by Roshni Velluva Puthanidam on 15/10/17.
 */
public class TopKWords {
    static List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> tm=new TreeMap<>();
        int num=0;

        for (int i=0; i<words.length; i++){
            if (tm.containsKey(words[i])){
                int count= tm.get(words[i]);
                tm.put(words[i],count+1);
            }

            else{
                tm.put(words[i],1);
            }
        }

        List<Map.Entry> list = new ArrayList<Map.Entry>(tm.entrySet());

        Collections.sort(list, new Comparator(){
            public int compare(Object o1, Object o2){
                Integer v1= (Integer) ((Map.Entry)o1).getValue();
                Integer v2= (Integer) ((Map.Entry)o2).getValue();
                return v2.compareTo(v1);
            }
        });

        List<String> result = new ArrayList<>();
        for(int i =0; i<k; i++){
            result.add((String) (list.get(i)).getKey());
        }

        return result;
    }

    public static void main(String[] args){
        String[] str =new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        List<String> result= topKFrequent(str,2);

        for(int i=0; i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
}
