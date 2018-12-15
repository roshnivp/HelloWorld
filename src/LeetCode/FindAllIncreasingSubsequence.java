package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class FindAllIncreasingSubsequence {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        if(nums.length==0) return result;
        List<Integer> temp = new ArrayList<>();
        findAllSubSequences(nums, temp, 0);
        return result;
    }

    public void findAllSubSequences(int[] nums, List<Integer> temp, int start){
        if(temp.size()>=2){
            if(!result.contains(new ArrayList<>(temp))) result.add(new ArrayList<>(temp));
        }

        for(int i=start; i<nums.length; i++){
            if(temp.size()==0 || temp.get(temp.size()-1) <=nums[i]){
                temp.add(nums[i]);
                findAllSubSequences(nums, temp, i+1);
                temp.remove(temp.size()-1);

            }

        }
    }

    public static void main(String[] args){

    }
}
