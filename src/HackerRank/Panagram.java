package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Roshni Velluva Puthanidam on 24/08/16.
 */
public class Panagram {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named matrixZero. */
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");
        String next = sc.next();
        next = next.replaceAll("\\s", "");
        Panagram p = new Panagram();
        String result = p.panagramOrNot(next);
        System.out.println(result);

    }

    String panagramOrNot(String sent) {
        List<Character> array = new ArrayList<>();
        sent = sent.toUpperCase();
        Map<Character, Integer> hm = new HashMap<>();
        //int count=0;
        for (int i = 0; i < sent.length(); i++) {
            if (!hm.containsKey(sent.charAt(i))) {
                //int count=hm.get(sent.charAt(i));
                hm.put(sent.charAt(i), 1);
            }
        }

        if (hm.size() == 26) {
            return "panagram";
        } else {
            return "not panagram";
        }
    }
}
