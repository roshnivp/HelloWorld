package PracticeQstns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static java.util.Arrays.*;

/**
 * Created by Roshni Velluva Puthanidam on 14/10/17.
 */
public class PermutationsArray {
    List<List<Integer>> ls = new ArrayList<>();

    public static void main(String[] args){
        int[] arr = new int[]{1,2,5};
        PermutationsArray pa = new PermutationsArray();
        List<List<Integer>> res = pa.permuteUnique(arr);
        for(int k=0; k<res.size();k++){
            System.out.println(res.get(k));
        }
    }


    public List<List<Integer>> permuteUnique(int[] nums) {
        if(nums.length == 0) return ls;

        permuteNumbers(nums,0,nums.length);

        return  ls;


    }

     void permuteNumbers(int[] nums,int i, int n){

         List<Integer> lstInt = new ArrayList<>();

        if(i == n-1){
            for (int index = 0; index < nums.length; index++)
            {
                lstInt.add(nums[index]);
            }

            if(!ls.contains(lstInt))
                ls.add(lstInt);
        }

        else{
            for(int j=i; j<n; j++){
                swap(nums,i,j);
                permuteNumbers(nums,i+1,n);
                swap(nums,i,j);
            }
        }

    }

    void swap(int[] nums, int i, int j){
        int temp= nums[i];
        nums[i] = nums[j];
        nums[j]=temp;

    }
}
