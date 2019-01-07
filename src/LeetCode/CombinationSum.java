package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
              if(candidates.length==0 ||target==0) return result;
              Arrays.sort(candidates);
              List<Integer> ls = new ArrayList<>();
              getAllCombinationSumPairs(candidates,target,ls,0);
              return result;

    }

    public void getAllCombinationSumPairs(int[] candidates,int target,List<Integer> ls,int start){

        if(target==0){
            result.add(new ArrayList<>(ls));
        }
        else if(target>0){
            for(int i=start; i<candidates.length&&target>=candidates[i];i++){
                ls.add(candidates[i]);
                getAllCombinationSumPairs(candidates,target-candidates[i], ls,i);
                ls.remove(ls.size()-1);
            }
        }
    }

    public static void main(String[] args){
        CombinationSum cs =new CombinationSum();
        System.out.println(cs.combinationSum(new int[]{2,4,5,3,7},9).toString());
    }
}
