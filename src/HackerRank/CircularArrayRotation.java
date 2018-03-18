package HackerRank;

import java.io.*;
import java.util.*;

/**
 * Created by Roshni Velluva Puthanidam on 05/08/16.
 */
public class CircularArrayRotation {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named matrixZero. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int rot = k % n;
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }
//
        for (int i = 0; i < q; i++) {
            //System.out.println(arr[in.nextInt()]);
            int pos = in.nextInt();
            if (pos - rot >= 0) {
                System.out.println(arr[pos - rot]);
            } else {
                System.out.println(arr[pos - rot + arr.length]);
            }
        }
    }


}
