package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindLongestWord {
    public static String findLongestWord(String s, List<String> d) {
        if(s.length()==0)return "";
        String maxStr = "";
        Collections.sort(d);//maintain elements in lexicographical order

        for(String str:d){
            if(isSubsequence(str,s)){
                if(str.length()>maxStr.length())maxStr =str;
            }
        }
        return maxStr;
    }

    public static boolean isSubsequence(String str, String s){
        int j=0;
        for(int i=0; i<s.length() && j<str.length();i++){
            if(str.charAt(j)==s.charAt(i))j++;
        }
        return j==str.length();
    }

    public static void main(String[] args){
        System.out.println(findLongestWord("abpcplea", Arrays.asList(new String[]{"ale","apple","monkey","plea"})));
    }

}
