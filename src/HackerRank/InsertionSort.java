package HackerRank;
import java.io.*;
import java.util.*;
/**
 * Created by Roshni Velluva Puthanidam on 23/07/16.
 */
public class InsertionSort {
    public static void insertIntoSorted(int[] arr) {
        // Fill up this function
        //int temp;
        int i, j, newValue;
        for (i = 1; i < arr.length; i++) {
            newValue = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > newValue) {
                arr[j] = arr[j - 1];
                printArray(arr);
                j--;
            }
            arr[j] = newValue;
        }


    }


    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
        printArray(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

}
