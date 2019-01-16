package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniquePermutation {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i:nums) {
            list.add(i);
        }
        helper(new ArrayList<>(),list);
        return ans;
    }

    // this method use back track
    private void helper(List<Integer> tempList,ArrayList<Integer> list) {
        if(list.size()==0) {
            ans.add(new ArrayList<>(tempList));  // add a copy of tempList
        }
        else {
            for(int i=0;i<list.size();i++) {
                if(i==0 || list.get(i-1) != list.get(i))   // avoid duplication
                {
                    ArrayList<Integer> newlist = new ArrayList<>(list);
                    tempList.add(list.get(i));
                    newlist.remove(i);
                    helper(tempList,newlist);
                    tempList.remove(tempList.size()-1);
                }

            }
        }
    }




    public static void main(String[] args){
        int[] arr = new int[]{1,2,1};
        UniquePermutation pa = new UniquePermutation();
        List<List<Integer>> res = pa.permuteUnique(arr);
        for(int k=0; k<res.size();k++){
            System.out.println(res.get(k));
        }
    }


}
