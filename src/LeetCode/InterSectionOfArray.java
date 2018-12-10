package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class InterSectionOfArray {
    public static int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> ls = new ArrayList<>();
        List<Integer> result = new ArrayList<>();


        for(int i=0; i<nums1.length; i++){
            ls.add(nums1[i]);
        }

        for (int k=0; k<nums2.length; k++){
            if(ls.isEmpty()) break;
            if(ls.contains(nums2[k])){
                result.add(nums2[k]);
                ls.remove(new Integer(nums2[k]));
            }
        }
        int[] ans = new int[result.size()];
        for(int i=0; i<ans.length; i++ ){
            ans[i] = result.get(i);
        }
        return ans;

    }

    public static void main(String[] args){
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        System.out.println(intersect(nums1,nums2).toString());
    }
}
