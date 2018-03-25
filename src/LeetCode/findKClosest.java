package LeetCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Roshni Velluva Puthanidam on 16/01/18.
 */
public class findKClosest {
//    condition :Array should be sorted
//    1. find the element which is very close to x; -- Binary Search
//    2. from the closest element move left and right to get the next closest elements;

    static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int high = arr.length -1;
        int low =0;
        int pivot = binarySearch(arr,x,high,low); // find closest element
        int r= pivot+1;
        if(arr[pivot] == x) pivot --;
        List<Integer> res = new ArrayList<>();
        int count =0;
        while(count <= k && pivot >= 0 && r <= high ){
            if(Math.abs(x- arr[pivot]) <= Math.abs(x-arr[r])){
                res.add(arr[pivot]);
                pivot--;
            }
            else{
                res.add(arr[r]);
                r++;
            }
            count++;
        }
        while(count<= k && pivot >=0 ){
            res.add(arr[pivot]);
            pivot--;
            count++;
        }
        while(count<= k  && r<=high ){
            res.add(arr[r]);
            r++;
            count++;
        }
        Collections.sort(res);
        return res;
    }
    static int binarySearch(int[] arr, int x,int high, int low){
        if(x > arr[high]) return high;
        if(x < arr[low]) return low;
        int mid = (high + low) /2;
        if(x >= arr[mid] && arr[mid+1]>x) return mid;
        if(x< arr[mid]) return binarySearch(arr,x,mid-1,low);
        return binarySearch(arr,x,high,mid+1);
    }
    public static void main(String[] args){
        List<Integer> ans = findClosestElements(new int[]{0,0,0,1,3,5,6,7,8,8},2,2);
        System.out.print(ans.toString());
    }
}
