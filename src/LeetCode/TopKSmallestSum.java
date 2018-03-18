package LeetCode;
import java.util.*;
/**
 * Created by Roshni Velluva Puthanidam on 05/08/16.
 */
public class TopKSmallestSum {
    void kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<int[]> result = new ArrayList<int[]>();
        int ind1=0;
        int ind2=0;
        Map<List<Integer>,Integer> map = new HashMap<>();
        for(int i=0; i< nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                List<Integer> ls = new ArrayList<>();
                ls.add(i);
                ls.add(j);
                map.put(ls,nums1[i]+nums2[j]);
            }
        }

        List<Map.Entry> ls = new ArrayList<>(map.entrySet());
        Collections.sort(ls, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer v1 =(Integer) ((Map.Entry)o1).getValue();
                Integer v2 =(Integer) ((Map.Entry)o2).getValue();
                return v1.compareTo(v2);
            }
        });

        for(int i=0; i<k ; i++){
            System.out.println(ls.get(i).getKey().toString());
        }



    }

    public static void main(String[] args){
        int[] arr1=new int[]{1,2,3};
        int[] arr2=new int[]{1,0,3};
        int k=2;
        TopKSmallestSum ts=new TopKSmallestSum();
        ts.kSmallestPairs(arr1,arr2,k);

}
}
