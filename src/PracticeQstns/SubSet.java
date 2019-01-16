package PracticeQstns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Roshni Velluva Puthanidam on 07/11/17.
 */
public class SubSet {
    List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args){
        int[] arr = new int[]{1,2,3};
        SubSet s= new SubSet();
        System.out.println(s.subsets(arr).toString());
    }
//    public void printSubSet(int[] nums){
//
//        for(int i=0; i<= nums.length; i++){
//            boolean[] ifadd = new boolean[nums.length];
//            printSubSet(nums,ifadd,0,i);
//        }
//        System.out.print(res.toString());
//
//    }
//    public void printSubSet(int[] nums, boolean[] ifadd, int start,int remain){
//        List<Integer> ls = new ArrayList<>();
//        if(remain == 0){
//            for(int i=0; i<ifadd.length; i++){
//                if((!ls.contains(nums[i])) && ifadd[i]){
//                    ls.add(nums[i]);
//                }
//            }
//            if(!res.contains(ls))res.add(ls);
//        }
//        else{
//            if(start + remain > nums.length) return;
//            else{
//                for(int k= start; k< nums.length; k++){
//                    if(!ifadd[k]){
//                        ifadd[k]=true;
//                        printSubSet(nums,ifadd,k+1,remain-1);
//                        ifadd[k]=false;
//                    }
//                }
//            }
//        }
//
//    }


    public List<List<Integer>> subsets(int[] nums) {
       // Arrays.sort(nums);
        backtrack(new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
