package HackerRank;

/**
 * Created by Roshni Velluva Puthanidam on 02/02/17.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AnagramPallindrome {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();

        String ans = null;

        char[] input=inputString.toCharArray();
        int[] count=new int[26];
        int loc;
        for(int i=0; i<input.length; i++){
            loc = input[i] - 'a';
            count[loc]++;

        }
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
       // boolean status =false;
        int value=0;
        for(int k=0; k<count.length; k++) {
            //System.out.println(count[k]);
            if(count[k] % 2 == 0){
                value++;
            }
            if (value == 25 || value == 26){
                ans="YES";
            }
            else {
                ans="NO";
            }

        }
        System.out.println(ans);
        myScan.close();
    }
}