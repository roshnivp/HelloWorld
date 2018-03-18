package HackerRank;

/**
 * Created by Roshni Velluva Puthanidam on 06/02/17.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DescentNumberNDigit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] numArray = new int[t];
        for (int a0 = 0; a0 < t; a0++) {
            numArray[a0] = in.nextInt();
        }
        for (int i = 0; i < numArray.length; i++) {

            int value_3 = 0;
            int value_5 = 0;
            int num = numArray[i];
            while (num % 3 != 0) {
                num -= 5;
            }
            value_3 = numArray[i] - num;
            value_5 = num;
            if (num < 0) {
                System.out.print("-1");
            } else {
                for (int j = 0; j < value_5; j++)
                    System.out.print("5");

                for (int j = 0; j < value_3; j++)
                    System.out.print("3");

            }
            System.out.println();
        }

    }
}
