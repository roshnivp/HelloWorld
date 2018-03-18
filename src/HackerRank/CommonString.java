package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Roshni Velluva Puthanidam on 25/08/16.
 */
public class CommonString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named matrixZero. */
        Scanner in=new Scanner(System.in);
        int pairs=in.nextInt();
      //  String[] arr=new String[pairs*2];
        for(int i=0; i<pairs;i++){
            String s1=in.next();
            String s2=in.next();
            CommonString c=new CommonString();
            String s=c.findCommonString(s1,s2);
            System.out.println(s);
        }


    }

    String findCommonString(String s1, String s2){


            int count=0;
            label1:
            for(int k=0; k<s1.length()&& k<s2.length(); k++){

                    if(s1.charAt(k)==s2.charAt(k)) {
                        count++;
                        break label1;
                    }
            }
            if (count== 1) {
                return "YES";
            }
            else{
                return "NO";
            }

        }


}
