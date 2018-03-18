package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Roshni Velluva Puthanidam on 17/11/17.
 */
public class LongestPallindromeFromGivenString {

    static int longestPallindrome(String s){
        int n= s.length();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            if(map.containsKey(s.charAt(i))){
                int count= map.get(s.charAt(i))+1;
                map.put(s.charAt(i),count);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }

        boolean oddValue = false;
        int result=0;
        for(int count: map.values()){

            if(count%2 == 0){
                result +=count;
            }
            else if(count==1){
                oddValue=true;
            }
            else {
                oddValue=true;
                result +=count-1;
            }
        }

        if(oddValue){
            result +=1;
        }
        return result;
    }
    public static void main(String args[])
    {
        System.out.println(longestPallindrome("aab"));
    }
}
