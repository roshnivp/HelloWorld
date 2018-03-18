package HackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Roshni Velluva Puthanidam on 15/03/17.
 */
public class CocateSubstring {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named matrixZero. */
        Character c =charectorAtK("abc",4);
        System.out.println(c);
    }

  //  List<List<String>> result = new ArrayList<>();
    static Character charectorAtK(String s, int k){

        List<String> ls= new ArrayList<>();

        String result ="";


            int length = s.length();

            for(int i=0; i<length; i++){
                for (int j=i+1; j<=length; j++){
                    String val = s.substring(i,j);
                    if(!ls.contains(val))
                        ls.add(val);
                }
            }

            Collections.sort(ls);

            for(int l=0; l<ls.size(); l++){
                result= result.concat(ls.get(l));
                //System.out.println(ls.get(l));
            }
        System.out.println(result);

        return result.charAt(k-1);


    }
}
