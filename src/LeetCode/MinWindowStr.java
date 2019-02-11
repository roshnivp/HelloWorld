package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class MinWindowStr {
    public static String minWindow(String s, String t) {
        if(s==null || t==null || s.length()==0 || t.length()==0)return "";

        HashMap<Character,Integer> uniqueMap =new HashMap<>();
        HashMap<Character,Integer> freqMap =new HashMap<>();

        for(int i=0; i<t.length(); i++){
            uniqueMap.put(t.charAt(i),uniqueMap.getOrDefault(t.charAt(i),0)+1);
        }

        int start =0;
        int end =0;
        String minStr="";
        int counter=0;
        int len = Integer.MAX_VALUE;


        while(end<s.length()){
            if(uniqueMap.containsKey(s.charAt(end))) {
                if (freqMap.containsKey(s.charAt(end))) {
                    if(freqMap.get(s.charAt(end))<uniqueMap.get(s.charAt(end)))counter++;
                    freqMap.put(s.charAt(end), freqMap.get(s.charAt(end)) + 1);
                } else {
                    freqMap.put(s.charAt(end), 1);
                    counter++;
                }
                if (counter ==t.length()) {
                    //When foundCounter equals to T.length(), in other words, found all characters.
                    char sc = s.charAt(start);
                    while (!freqMap.containsKey(sc) || freqMap.get(sc) > uniqueMap.get(sc)) {
                        if (freqMap.containsKey(sc) && freqMap.get(sc) > uniqueMap.get(sc))
                            freqMap.put(sc, freqMap.get(sc) - 1);
                        start++;
                        sc = s.charAt(start);
                    }
                    if (end - start + 1 < len) {
                         len = end-start+1;
                         minStr = s.substring(start, end + 1);
                    }

                }
            }

            end++;

        }

        return minStr;
    }

    public static void main(String[] args){
        System.out.println(minWindow("bdab","ab"));
    }
}
