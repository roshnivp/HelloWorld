package LeetCode;

import java.util.Scanner;

/**
 * Created by Roshni Velluva Puthanidam on 04/08/16.
 */
public class StringReverse {
     String reverseString(String s) {
         String str = "";

         if(s.length()==0) return str;
         if(s.length()==1 ) return s;

         int k=s.length()-1;
         StringBuilder sb = new StringBuilder(s);
         sb = sb.reverse();


         return sb.toString();
    }
    public static void main(String[] args){
        StringReverse s=new StringReverse();
        String str= "hello";
        String s1 = s.reverseString(str);
        System.out.println(s1);
    }
}
