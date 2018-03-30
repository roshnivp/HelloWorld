package PracticeQstns;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by Roshni Velluva Puthanidam on 18/01/18.
 */
public class FirstOccurence {
    static int firstOccurrence(String s, String x) {

        if(x==null) return -1;
        int n = x.length();
        int index= s.indexOf(x.charAt(0));
        int last_index = s.indexOf(x.charAt(n-1));
        if(index==-1) return -1;
        String s_copy= new String(s);
        int count = findIndex(s,x,index);

        if(count<=1){
            return index;
        }
        else{
            while(s.length()>n && count>1){
                s = s_copy.substring(index);
                index= s.indexOf(x.charAt(0));
                last_index = s.indexOf(x.charAt(n-1));
                if(last_index==-1) return -1;
                count = findIndex(s,x,index);
                if(count<=1) break;
            }
        }
        return index;
    }

    static int findIndex(String s, String x, int index){
        int count =0;
        int k=0;
        for(int i= index; i<index+x.length(); i++){
            if(s.charAt(i) != x.charAt(k)){
                count++;
                if(count>1) break;
            }
            k++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        String a = "abcdecdeffg";
        String b = "cdef";
        System.out.print(a.indexOf(b));
        //int res = ocuurenceOfAPattern(a, b);
        //System.out.print(res);
    }
}

