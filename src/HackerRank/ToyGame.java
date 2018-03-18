package HackerRank;

import java.io.*;
import java.util.*;

/**
 * Created by Roshni Velluva Puthanidam on 09/02/17.
 */
public class ToyGame {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named matrixZero. */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        TreeSet<Integer> list = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            list.add(value);
        }

        int maxValue = -1;
        int totalCount = 0;

        for (Integer val : list) {
            if (maxValue == -1 || val > maxValue) {
                maxValue = val + 4;
                totalCount++;
            }


        }
        System.out.println(totalCount);


    }
}
