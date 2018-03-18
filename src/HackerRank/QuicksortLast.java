package HackerRank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Roshni Velluva Puthanidam on 22/07/16.
 */
public class QuicksortLast {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named matrixZero. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        quickSort(ar);

    }
    /** Partition the array list[first..last] */
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<=high-1; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;


    }
    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }


    private static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            for(int k=0; k<=list.length-1; k++){
                System.out.print(list[k]+" ");
            }
            System.out.println();
            quickSort(list, first, pivotIndex - 1);

            quickSort(list, pivotIndex + 1, last);

        }
    }
}
