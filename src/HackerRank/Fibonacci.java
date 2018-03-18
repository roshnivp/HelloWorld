package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Roshni Velluva Puthanidam on 01/08/16.
 */
public class Fibonacci {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named matrixZero. */
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = in.nextInt();
        }
        if (arr[2] == 1) {

            System.out.println(arr[0]);
        } else if (arr[2] == 2) {
            System.out.println(arr[1]);
        } else if (arr[2] > 2) {
            BigInteger s = fibonacci(arr, arr[2]);
            System.out.println(s);
        }
    }

    private static BigInteger fibonacci(int[] arr, int n) {
        int first = arr[0];
        int second = arr[1];
        BigInteger[] new_arr = new BigInteger[n];
        new_arr[0] = BigInteger.valueOf((first));
        new_arr[1] = BigInteger.valueOf((second));
        for (int j = 2; j < n; j++) {
            BigInteger obj = new BigInteger(String.valueOf(new_arr[j - 2]));
            int exponent = 2;
            BigInteger obj1 = new BigInteger(String.valueOf(new_arr[j - 1]));
            BigInteger obj2 = obj1.pow(exponent);
            new_arr[j] = obj.add(obj2);
        }

        return new_arr[new_arr.length - 1];
    }
}
