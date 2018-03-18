package HackerRank;

/**
 * Created by Roshni Velluva Puthanidam on 27/02/17.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindStrings {
    static int[] arr = new int[1000];
    static HashSet<String> set = new HashSet<String>();

    /* Head ends here */
    static void findStrings(String[] a, int[] querry) {

        for (int k = 0; k < a.length; k++) {
            String text = a[k];
        }
        //TreeSet<String> tset = new TreeSet<String>(set);
        List<String> list = new ArrayList<String>(set);
        Collections.sort(list);
        // System.out.println(list.get(1));
        for (int q = 0; q < querry.length; q++) {
            int min = querry[q];
            if (min <= list.size()) {
                System.out.println(list.get(min - 1));

            } else {
                System.out.println("INVALID");
            }

        }
    }

    static HashSet<String> toBin(HashSet hashset, String set, int i, int n) {

        if (i == n) {
           String str = "";
            // System.out.print("\t->{");
            for (int j = 0; j < n; j++) {
                if (arr[j] == 1) {
                    str = str.concat(String.valueOf(set.charAt(j)));

                }
                if (str.length() >= 1) {
                    hashset.add(str);
                }

            }
            //    System.out.println("}");
            return hashset;
        }
        arr[i] = 0;
        toBin(hashset, set, i + 1, n);
        arr[i] = 1;
        toBin(hashset, set, i + 1, n);
        return hashset;
    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int _cases = Integer.parseInt(in.nextLine());
        String[] _a = new String[_cases];

        for (int _a_i = 0; _a_i < _cases; _a_i++) {
            _a[_a_i] = in.nextLine();
        }
        int _query = Integer.parseInt(in.nextLine());
        int[] query = new int[_query];
        for (int _a_i = 0; _a_i < _query; _a_i++) {
            query[_a_i] = Integer.parseInt(in.nextLine());
        }

        findStrings(_a, query);
    }
}
