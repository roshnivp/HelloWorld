package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Roshni Velluva Puthanidam on 03/08/16.
 */
public class ClosestNumbers2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named matrixZero. */
        Scanner in = new Scanner(System.in);
        //HashMap<List<Integer>,Integer> hm=new HashMap<List<Integer>,Integer>();
        int n = in.nextInt();
        int[] arr = new int[n];

        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        List<List<Integer>> res= new ArrayList<>();
        try {
            for (int k = 0; k < n - 1; k++) {
                // List<Integer> ls=new ArrayList<>();
                int abs = Math.abs(arr[k] - arr[k + 1]);
                if (diff > abs) {
                    List<Integer> ls = new ArrayList<Integer>();
                    res.clear();
                    diff = abs;
                    ls.add(arr[k]);
                    ls.add(arr[k + 1]);
                    res.add(ls);
                    // hm.put(ls,abs);
                } else if (diff == abs) {
                    diff = abs;
                    List<Integer> ls = new ArrayList<Integer>();
                    ls.add(arr[k]);
                    ls.add(arr[k + 1]);
                    res.add(ls);
                }
            }
            System.out.print(res.toString());

        } catch (Exception ae) {
            System.out.println("Exception caught " + ae.getMessage());
        }
    }
}
