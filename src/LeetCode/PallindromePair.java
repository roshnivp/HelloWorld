package LeetCode;

import java.util.*;

public class PallindromePair {
    public List<List<Integer>> palindromePairs(String[] words) {

        List<List<Integer>> res= new ArrayList<>();
        Map<String,Integer> hm = new LinkedHashMap<>();

        if(words.length<=1) return res;

        for(int i=0; i<words.length; i++){
            hm.put(words[i],i);
        }

        if(hm.containsKey("")){
            for(int i=0; i<words.length; i++){
                if(isPallindrome(words[i]) && i!=hm.get("")){
                    res.add(Arrays.asList(i, hm.get("")));
                    res.add(Arrays.asList( hm.get(""),i));

                }
            }
        }

        for(int i=0; i<words.length; i++){
            StringBuilder str= new StringBuilder(words[i]);
            String rev =str.reverse().toString();
            if(hm.containsKey(rev)){
                int found = hm.get(rev);
                if(i!=found) res.add(Arrays.asList(i, found));

            }
        }
//case1 : s1[0:cut] is palindrome and s1[cut+1:] = reverse(s2) => (s2, s1)
        //case2 : s1[cut+1:] is palindrome and s1[0:cut] = reverse(s2) => (s1, s2)
        for(int i = 0; i < words.length; i++){
            String cur = words[i];
            for(int cut = 1; cut < cur.length(); cut++){
                if(isPallindrome(cur.substring(0, cut))){
                    String strTocompare = reverseStr(cur.substring(cut));

                    if(hm.containsKey(strTocompare)){
                        int found = hm.get(strTocompare);
                        if(found == i) continue;
                        res.add(Arrays.asList(found, i));
                    }
                }
                if(isPallindrome(cur.substring(cut))){
                    String strTocompare = reverseStr(cur.substring(0, cut));

                    if(hm.containsKey(strTocompare)){
                        int found = hm.get(strTocompare);
                        if(found == i) continue;
                        res.add(Arrays.asList(i, found));
                    }
                }
            }
        }


        return res;
    }

    public String reverseStr(String rev){
        StringBuilder str = new StringBuilder(rev);
        return str.reverse().toString();
    }

    public static boolean isPallindrome(String pall){
        int start=0;
        int end= pall.length()-1;
        while(start<end){
            if(pall.charAt(start)!=pall.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        PallindromePair pp = new PallindromePair();
        System.out.println(pp.palindromePairs(new String[]{"a",""}));
    }
}
