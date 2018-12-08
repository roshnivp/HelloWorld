package PracticeQstns;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

/**
 * Created by Roshni Velluva Puthanidam on 13/10/17.
 */
public class PermutationOfString {
    HashSet<String> hs= new HashSet<>();
    public static void main(String[] args){
        String s="abcd";
        List<String> result= new ArrayList<>();
        PermutationOfString ps= new PermutationOfString();
        result= ps.allPermutation(s,0,s.length());
        System.out.println(result.size());
        for (int i=0; i<result.size();i++){
            System.out.println(result.get(i));
        }
    }

    List<String> allPermutation(String s, int i, int n){

        char[] strChar =s.toCharArray();
        char temp=' ';

        if(i == n-1){
            hs.add(s);
        }
        else{
            for(int j=i; j<n; j++){
                temp= strChar[i];
                strChar[i] = strChar[j];
                strChar[j]=temp;
                String str = String.valueOf(strChar);
                allPermutation(str,i+1,n);
                temp= strChar[i];
                strChar[i] = strChar[j];
                strChar[j]=temp;
            }
        }
        List<String> ls = new ArrayList<>(hs);
        return ls;

    }
}
