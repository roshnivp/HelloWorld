package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAllAnagrams {
    static List<Integer> result = new ArrayList<>();
    public static List<Integer> findAnagrams(String s, String p) {
        if(p==null || s==null ){
            return result;
        }
        int n= s.length();
        int m= p.length();
        if(n==0 || m==0 || m>n) return result;

        for(int i=0; i<=n-m; i++){
            String str = s.substring(i,i+m);
            if(isAnagram(p,str))result.add(i);
        }


        return result;

    }

    public static boolean isAnagram(String p,String str){
        int[] dict = new int[26];

        for(int i=0; i<p.length(); i++){
            dict[p.charAt(i)-'a']++;
        }
        for(int i=0; i<str.length(); i++){
            dict[str.charAt(i)-'a']--;
            if(dict[str.charAt(i)-'a'] <0) return false;
        }
        return true;
    }

    public static void main(String[] args){
       System.out.println(findAnagrams("cbaebabacd","abc").toString());
    }
}
