package HackerRank;

/**
 * Created by Roshni Velluva Puthanidam on 01/03/17.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MakePallindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String number = in.next();
        String res = makePallindrome(number, k);
        System.out.println(res);
    }

    static String makePallindrome(String num, int rem) {
        int mid;
        int count = 0;
        String temp = num;
        String number;
        int n = temp.length();
        if (temp.length() % 2 == 0) {
            mid = n / 2;
        } else {
            mid = n / 2 + 1;
        }

        for (int i = 0; i < mid; i++) {
            //    int var =mid;
            if (temp.charAt(i) != temp.charAt(n - 1 - i)) {
                count++;

            }

        }

        rem -= count;
        String res = temp;
        if (rem < 0) res = ("-1");
        else {
            for (int i = 0; i < n / 2; i++) {
                int x = Integer.parseInt(String.valueOf(res.charAt(i)));
                int y = Integer.parseInt(String.valueOf(res.charAt(n - 1 - i)));
                String new_val = String.valueOf(Math.max(x, y));
                char val = new_val.charAt(0);
                if ((res.charAt(i) != res.charAt(n - 1 - i)) && count > 0) {
                    if (rem > 0) {

                        if (val != '9') {
                            res = res.substring(0, i) + '9' + res.substring(i + 1);
                            res = res.substring(0, n - 1 - i) + '9' + res.substring(n - 1 - i + 1);
                            count--;
                            //count--;
                            rem--;
                            // rem--;
                        } else {
                            res = res.substring(0, i) + '9' + res.substring(i + 1);
                            res = res.substring(0, n - 1 - i) + '9' + res.substring(n - 1 - i + 1);
                            count--;
                            // rem--;

                        }
                    } else {

                        res = res.substring(0, i) + val + res.substring(i + 1);
                        res = res.substring(0, n - 1 - i) + val + res.substring(n - 1 - i + 1);
                        // System.out.println(res);
                        count--;
                    }
                } else if (rem >= 2) {
                    if (val != '9') {
                        res = res.substring(0, i) + '9' + res.substring(i + 1);
                        res = res.substring(0, n - 1 - i) + '9' + res.substring(n - 1 - i + 1);
                        rem -= 2;
                    }
                }
            }
        }

        if ((n % 2 != 0) && (rem > 0)) res = res.substring(0, n / 2) + '9' + res.substring(n / 2 + 1);
        return res;
    }
}
