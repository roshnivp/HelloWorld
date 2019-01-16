package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class InterSectionOfArray {
    public static int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ls = new ArrayList<>();

        for(int i=0;i<nums1.length; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i],0)+1);
        }

        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])){
                map.put(nums2[i],map.get(nums2[i])-1);
                if(map.get(nums2[i])>=0){
                    ls.add(nums2[i]);
                }
            }

        }

        int[] res = new int[ls.size()];
        for(int i=0; i<ls.size(); i++){
            res[i]=ls.get(i);
        }
        return res;

    }

    public static void main(String[] args){
        int[] nums1 = new int[]{4,9,5,9};
        int[] nums2 = new int[]{9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
}
