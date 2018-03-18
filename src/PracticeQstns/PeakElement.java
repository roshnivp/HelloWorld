package PracticeQstns;

/**
 * Created by Roshni Velluva Puthanidam on 14/03/17.
 */
// A Java program to find a peak element element using divide and conquer
import java.util.*;
import java.lang.*;
import java.io.*;

class PeakElement
{
    // A binary search based function that returns index of a peak
    // element
    static int findPeakUtil(int nums[], int start, int end, int n)
    {

        if(start == end) return start;

        int mid = (start+end) /2 ;

        if (nums[mid] > nums[mid + 1]) return findPeakUtil(nums,start,mid,n);



        else {
            return findPeakUtil(nums, mid+1,end,n);
        }

    }

    // A wrapper over recursive function findPeakUtil()
    static int findPeak(int arr[], int n)
    {
        return findPeakUtil(arr, 0, n-1, n);
    }

    // Driver method
    public static void main (String[] args)
    {
        int arr[] = {1,3,5,6,10,0};
        int n = arr.length;
        System.out.println("Index of a peak point is " +
                findPeak(arr, n));
    }
}
