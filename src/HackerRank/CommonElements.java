package HackerRank;

/**
 * Created by Roshni Velluva Puthanidam on 03/02/17.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CommonElements {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named matrixZero. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] letters = new String[N];
        for (int i = 0; i < N; i++) {
            letters[i] = sc.next();
        }
        String prefix = letters[0];
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for(int i=0; i<prefix.length(); i++){
            for(int k=1; k<letters.length; k++){
                if(letters[k].indexOf(prefix.charAt(i))==-1){
                    flag = false;
                    break;
                }
                flag= true;
            }
            if(flag) sb.append(prefix.charAt(i));
        }
        System.out.println(sb.length());
        System.out.println(sb.toString());
    }
}
