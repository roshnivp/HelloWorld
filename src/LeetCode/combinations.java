package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class combinations {


    /* arr[]  ---> Input Array
    data[] ---> Temporary array to store current combination
    start & end ---> Staring and Ending indexes in arr[]
    index  ---> Current index in data[]
    r ---> Size of a combination to be printed */

    public void combinationsOfElements(int[] arr,  int[] temp_arr, int start, int end, int index, int k){

        if(index ==k){
            List<Integer> ls = new ArrayList<>();
            for(int j=0; j<k; j++){
                ls.add(temp_arr[j]);
            }

            if(!res.contains(ls)){
                res.add(ls);
            }
            return;
        }
        // replace index with all possible elements. The condition
        // "end-i+1 >= r-index" makes sure that including one element
        // at index will make a combination with remaining elements
        // at remaining positions

        for(int i= start; i<=end && end-i+1>=k-index; i++){
            temp_arr[index] = arr[i];
            combinationsOfElements(arr, temp_arr, i+1, end, index+1, k);
        }
    }



    // The main function that prints all combinations of size r
    // in arr[] of size n. This function mainly uses combinationUtil()
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {


        if(n==0 || k==0) return res;


        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=i+1;
        }
        int[] temp_arr = new int[k+1];

        combinationsOfElements(arr,  temp_arr, 0, n-1, 0, k);
        return res;

    }
    /*Driver function to check for above function*/
    public static void main (String[] args) {

        int r =2;
        int n = 4;
        combinations c = new combinations();
        System.out.println(c.combine(n, r).toString());
    }

}
