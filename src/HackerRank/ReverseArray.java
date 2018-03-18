package HackerRank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by Roshni Velluva Puthanidam on 21/07/16.
 */
public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int lenth=arr.length;
        int new_Arr[] = new int[lenth];

        int k=lenth-1;
        for(int i=0; i <arr.length; i++){
            new_Arr[i] = arr[k];
            k--;
            System.out.print(new_Arr[i]+" ");
        }

    }
}
