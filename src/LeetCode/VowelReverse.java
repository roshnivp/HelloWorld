package LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Roshni Velluva Puthanidam on 18/10/17.
 */
public class VowelReverse {
    static String reverseVowels(String s) {

        Set<Character> set=  new HashSet<>();

        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int i=0,k=s.length()-1;

        while(i < k){
            if(!set.contains(s.charAt(i))){
                i++;
                continue;
            }
            if(!set.contains(s.charAt(k))){
                k--;
                continue;
            }
            s= swap(s,i,k);
            i++;
            k--;
        }

        return  s;

    }

    static String swap(String s,int i,int j){
//        String temp= s.charAt(i)+"";
//        s.replace(s.charAt(i)+"",s.charAt(j)+"");
//        s.replace(s.charAt(j)+"",temp);
        char temp = s.charAt(i);
        return s.substring(0,i)+s.charAt(j)+s.substring(i+1,j)+temp+s.substring(j+1);

    }
    public static void main(String[] args){
        System.out.println(reverseVowels("hello"));
    }

}
