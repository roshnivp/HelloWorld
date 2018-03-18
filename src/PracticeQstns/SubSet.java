package PracticeQstns;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roshni Velluva Puthanidam on 07/11/17.
 */
public class SubSet {
    List<List<Integer>> res = new ArrayList<>();

    public static void main(String[] args){
        int[] arr = new int[]{1,2,3};
        SubSet s= new SubSet();
        s.printSubSet(arr);
    }
    public void printSubSet(int[] nums){

        for(int i=0; i<= nums.length; i++){
            boolean[] ifadd = new boolean[nums.length];
            printSubSet(nums,ifadd,0,i);
        }
        System.out.print(res.toString());

    }
    public void printSubSet(int[] nums, boolean[] ifadd, int start,int remain){
        List<Integer> ls = new ArrayList<>();
        if(remain == 0){
            for(int i=0; i<ifadd.length; i++){
                if((!ls.contains(nums[i])) && ifadd[i]){
                    ls.add(nums[i]);
                }
            }
            if(!res.contains(ls))res.add(ls);
        }
        else{
            if(start + remain > nums.length) return;
            else{
                for(int k= start; k< nums.length; k++){
                    if(!ifadd[k]){
                        ifadd[k]=true;
                        printSubSet(nums,ifadd,k+1,remain-1);
                        ifadd[k]=false;
                    }
                }
            }
        }

    }
}
