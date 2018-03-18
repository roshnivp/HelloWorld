package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 15/03/17.
 */

import java.util.*;

public class SubString {
    static  List<String> str = new ArrayList<>();
    public static void main(String[] ar) {
        //Set<String> res = new HashSet<String>();
        SubString s= new SubString();
        s.getSubstrings("abc");
        //s.printSubString("abc");
        for(int i=0 ;i<str.size();i++){
            System.out.println(str.get(i));
        }
    }
    void printSubString(String s){
        int n= s.length();
        boolean[] ifAdd = new boolean[n];
        for(int i=0; i<n; i++){
            printSubString(s,ifAdd,str,0,i);

        }


    }
     void printSubString(String s, boolean[] ifAdd, List<String> set, int start,  int remain) {
         StringBuilder sb= new StringBuilder();
        if(remain==0){
            for(int i=0; i<ifAdd.length; i++){
                if(ifAdd[i]) sb.append(s.charAt(i));
            }
            if(!set.contains(sb.toString())){
                set.add(sb.toString());
            }
        }
        else{
            if(start+remain >s.length()) return;
            else{
                for(int k=start; k<s.length(); k++){
                    ifAdd[k]=true;
                    printSubString(s,ifAdd,set,k+1,remain-1);
                    ifAdd[k]=false;
                }
            }
        }

    }
    void getSubstrings(String s){
        for(int i=0; i<=s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String sbstr = s.substring(i,j);
                str.add(sbstr);
            }
        }
    }

}
