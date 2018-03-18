package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Roshni Velluva Puthanidam on 21/07/16.
 */
public class ArrayRotation {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named PracticeQstns.StackOperation. */
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int noOfRotation = in.nextInt();
//        int arr[] = new int[n];
//        for (int arr_i = 0; arr_i < n; arr_i++) {
//            arr[arr_i] = in.nextInt();
//        }
        ArrayRotation ar = new ArrayRotation();
        ar.leftRotate(new int[]{1,2,3,4,5}, 2, 5);
    }

    private void leftRotate(int[] arr, int d, int n) {
//        for (int i = 0; i < d; i++) {
//            leftRotateOnce(arr, n);
//        }
//        for (int i = 0; i <= n; i++) {
//            System.out.print(arr[i] + " ");
//        }

        int[] temp = new int[d];

        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }

        for(int i=0; i<n-d; i++){
            arr[i] = arr[i+d];
        }
        int k=0;
        for(int i = n-d; i<n; i++){
            arr[i] = temp[k];
            k++;
        }

    }

    private void leftRotateOnce(int[] arr, int n) {
        int temp = arr[0];

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n] = temp;
    }
}
